package GestionarPersona;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import CalcularEstructura.Validar;
import Dominio.*;
import BaseDeDatos.*;
import EmitirFactura.*;
import EmitirPresupuesto.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Vector;
/**
 * <p>Description: este mediador permite buscar una persona guardada en la base de datos.
 * 
 * @author Riegos del Sur
 *
 */
public class MediadorBuscarPersona implements ActionListener {
	private InterfazBuscarCliente ibp; 
	private Validar va=new Validar();
	private Persistencia obP=null;
	private Vector v=new Vector();
	private Vector vc=new Vector();
	private Vector <Cliente> cliente=null;
	private Vector columna=null;
	int flag=0;
	private int opcion=0;
	
	/**
	 * @since Constructor de la clase MediadorBuscarPersona
	 */	
	public MediadorBuscarPersona(int opcion){
		super();
		this.ibp = new InterfazBuscarCliente();
		this.ibp.getJLabelTexto2().setVisible(false);
		this.ibp.setListenerButtons(this);
		this.ibp.setVisible(true);
		this.ibp.setLocationRelativeTo(null);
		obP=new Persistencia();
		OidGenerator.init(obP.getPm().getPersistenceManagerFactory());
		this.opcion=opcion;
	}	
	
	/**
	 * @since Metodo que captura los eventos de los botones "Buscar" y "Aceptar"
	 */
	public void actionPerformed(ActionEvent arg0) {
		Object source = arg0.getSource();
		boolean flag2 =false;
		if (this.ibp.getJButtonBuscar()==source) {
			try{
			if(!va.validarNoNull(ibp.getJTextFieldApellido().getText())) {
				if (!va.validarNoNull(ibp.getJTextFieldNombre().getText())){
					if(!va.validarNoNull(ibp.getJTextFieldDni().getText())){
						JOptionPane.showMessageDialog(null,"Debe ingresar el apellido y nombre o puede ingresar solo el dni del cliente que desea buscar","Informacion",JOptionPane.ERROR_MESSAGE);
					}
					else{
						this.buscar();
						flag2=true;
					}
				}
				else{
					this.buscar();
					flag2=true;
				}
			}
			else{
				this.buscar();
				flag2=true;
			}
				if (flag2){
					this.ibp.getJLabelTexto2().setVisible(true);
					this.ibp.getJComboBoxTDni().setVisible(false);
					this.ibp.getJTextFieldApellido().setVisible(false);
					this.ibp.getJTextFieldDni().setVisible(false);
					this.ibp.getJTextFieldNombre().setVisible(false);
					this.ibp.getJLabelApellido().setVisible(false);
					this.ibp.getJLabelDni().setVisible(false);
					this.ibp.getJLabelNombre().setVisible(false);
					this.ibp.getJLabelTexto().setVisible(false);
					this.ibp.getJButtonBuscar().setVisible(false);
					this.ibp.getJbutonCancelarDatos().setVisible(false);
					for (Iterator iter = cliente.iterator(); iter.hasNext();) {
						Cliente p = (Cliente) iter.next();
						Vector fila = new Vector();
						fila.add(p.getApellido());
						fila.add(p.getNombre());
						fila.add(p.getTipo());
						fila.add(p.getDni());
						Connection conexion = null;
						try
						{
							Class.forName("com.mysql.jdbc.Driver").newInstance();
							conexion = DriverManager.getConnection("jdbc:mysql://localhost/riego", "root", ""); 
						}catch(Exception e){
							e.printStackTrace();
						}
						try {
							Statement st = conexion.createStatement();
							st.executeQuery ("SELECT * FROM localidad WHERE id = \""+p.getLocalidadId()+"\"");
							ResultSet ds = st.getResultSet ( );
							while (ds.next ( )) {
								fila.add(ds.getString(3));
							}
							ds.close();
							st.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
						fila.add(p.getMail());
						this.v.add(fila);		
					}
					this.ibp.getJButtonBuscar().setEnabled(false);
					this.ibp.setSize(700, 250);
					this.ibp.setLocationRelativeTo(null);
					this.ibp.getJTableResultado().setModel(defaultTabla(v, getColumnName()));
					TableColumn tableColumn2= this.ibp.getJTableResultado().getColumnModel().getColumn(2);
					tableColumn2.setPreferredWidth(20);
					TableColumn tableColumn3= this.ibp.getJTableResultado().getColumnModel().getColumn(3);
					tableColumn3.setPreferredWidth(20);
					this.ibp.getJScrollPane().setVisible(true);
					this.ibp.getJTableResultado().setVisible(true);
					this.ibp.getJButtonAceptar().setText("Buscar Campo");
					this.ibp.getJButtonAceptar().setVisible(true);
					this.ibp.getJButtonCancelar().setVisible(true);
				}
				else{
					JOptionPane.showMessageDialog(null,"No existe un cliente con esos datos ","Informacion",JOptionPane.ERROR_MESSAGE);
				}
			}
			
			catch(Exception e){
				e.printStackTrace();
				this.obP.rollback();
			}
		 }
		 if (this.ibp.getJButtonAceptar()==source){
			 if(flag==0){
				 try{
					 this.buscarCampo();
					 this.obP.commit();
				 }
				 catch(Exception e){
					 e.printStackTrace();
					 this.obP.rollback();
				 }
				 finally{
					 this.obP.close();
				 }
			 }
			 else{
				 this.aceptar();
			 }
		 }
		 if (this.ibp.getJButtonCancelar()==source){
			this.cancelar();
		 }
		 if (this.ibp.getJbutonCancelarDatos()==source){
				this.cancelar();
			 }	
	}
	
	private void cancelar (){
		this.ibp.dispose();
	}
	
	/**
	 * @since Este metodo es el encargado de buscar el cliente en la base de datos, de acuerdo a los datos insertados en los campos de la interfaz.
	 */
	public void buscar(){
		try{
			if (!(ibp.getJTextFieldDni().getText()).equals("")) {
				//busca la persona en la base de datos por el num de DNI.
				String dni=ibp.getJTextFieldDni().getText();
				cliente =obP.filtrarDatos(Cliente.class, "dni==\""+dni+"\"");
			}
			else{
				if((va.validarNoNull(ibp.getJTextFieldApellido().getText())) && (va.validarNoNull(ibp.getJTextFieldNombre().getText()))){
					//busca la persona en la base de datos por el nombre y apellido insertado.
					String nombre= ibp.getJTextFieldNombre().getText().toUpperCase();
					String apellido= ibp.getJTextFieldApellido().getText().toUpperCase();
					cliente=obP.filtrarDatos(Cliente.class, "apellido==\""+apellido+"\" && nombre==\""+nombre+"\"");
				}
				else{
					//bisca la persona en la base de datos por el apellido insertado
					if(va.validarNoNull(ibp.getJTextFieldApellido().getText())){
						String apellido= ibp.getJTextFieldApellido().getText().toUpperCase();
						cliente=obP.filtrarDatos(Cliente.class, "apellido==\""+apellido+"\"" );	
					}
					else{
						//busca la persona en la base de datos por el nombre insertado.
						String nombre= ibp.getJTextFieldNombre().getText().toUpperCase();
						cliente=obP.filtrarDatos(Cliente.class,"nombre==\""+nombre+"\"" );
					}
				}
			}
		}catch (Exception e){
			e.printStackTrace();
			this.obP.rollback();
		}
	}
	
	public void aceptar(){
		int filaSeleccion=this.ibp.getJTableResultado().getSelectedRow();
		if (filaSeleccion!=-1) {
			Vector fila=(Vector)this.vc.elementAt(filaSeleccion);
			String direccion=(String)fila.elementAt(0);
			Campo campito=null;
			obP=new Persistencia();
			OidGenerator.init(obP.getPm().getPersistenceManagerFactory());
			this.ibp.setVisible(false);
			try{
				campito=(Campo)obP.getObjeto(Campo.class,"direccion==\""+direccion+"\"");
				long id=campito.getId();
				Equipo eq;
				eq=(Equipo)obP.getObjeto(Equipo.class,"campo.id=="+id);
				if (opcion==1){
					MediadorEmitirFactura mef=new MediadorEmitirFactura();
					mef.obtenerDatos(eq,obP);
				}
				else{
					new ReportePresupuesto().startReport(eq.getId());
				}
			}catch(Exception e){
				e.printStackTrace();
				this.obP.rollback();
			}
		}
	}
	
	/**
	 * @since Metodo que se encarga de buscar el campo en la base de datos.
	 */
	public void buscarCampo(){
		flag=1;
		int filaSeleccion = this.ibp.getJTableResultado().getSelectedRow();
		if (filaSeleccion!=-1) {
			Cliente clienteSeleccionado = (Cliente) this.cliente.elementAt(filaSeleccion);
			Iterator campo= clienteSeleccionado.getCampo().iterator();
			while (campo.hasNext()){
				llenarTabla(campo);
			}
			this.ibp.getJTableResultado().setModel(defaultTabla(vc,getColumnNameCampo()));
			this.ibp.getJTableResultado().setVisible(true);
			this.ibp.getJButtonAceptar().setText("Aceptar");
			this.ibp.getJButtonAceptar().setVisible(true);
			this.ibp.getJButtonCancelar().setVisible(true);
		}
		else {
			JOptionPane.showMessageDialog(null,"Debe seleccionar un CLIENTE","Informacion",JOptionPane.ERROR_MESSAGE);
		} 	
	}
	
	/**
	 * @since Metodo que completa la tabla con los datos de los campos
	 * @param campo
	 */
	public void llenarTabla(Iterator campo){
		Vector fila= new Vector();
		Campo c = (Campo)campo.next();
		fila.add(c.getDireccion());
		fila.add(c.getHectareas());
		Connection conexion = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/riego", "root", ""); 
		}catch(Exception e){
			e.printStackTrace();
		}
		try {
			Statement st = conexion.createStatement();
			st.executeQuery ("SELECT * FROM localidad WHERE id = \""+c.getLocalidadId()+"\"");
			ResultSet ds = st.getResultSet ( );
			while (ds.next ( )) {
				fila.add(ds.getString(3));
			}
			ds.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.vc.add(fila);		
	}
	
	/**
	 * @since Metodo que se encarga de llenar el nombre de la columna de la tabla Persona.
	 * @return Un vector con los nombres de las columnas.
	 */
	public Vector getColumnName(){
		columna=new Vector();
		columna.add(new String("Apellido"));
		columna.add(new String("Nombre"));
		columna.add(new String("Tipo DNI"));
		columna.add(new String("DNI"));
		columna.add(new String("Localidad"));
		columna.add(new String("Mail"));
		return columna;
	}
	
	/**
	 * @since Metodo que se encarga de llenar el nombre de la columna de la tabla Persona.
	 * @return Un vector con los nombres de las columnas.
	 */
	public Vector getColumnNameCampo(){
		columna=new Vector();
		columna.add(new String("Direccion"));
		columna.add(new String("Cant Hectareas"));
		columna.add(new String("Localidad"));
		return columna;
	}
	
	/**
	 * 
	 * @param v
	 * @param columna
	 * @return modelo
	 */
	public DefaultTableModel defaultTabla(Vector v, Vector columna){
		DefaultTableModel modelo = new DefaultTableModel(v,columna);
		return modelo;
	}
}
