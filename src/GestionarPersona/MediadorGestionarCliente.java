package GestionarPersona;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JOptionPane;
import BaseDeDatos.*;
import Dominio.Aspersor;
import Dominio.Cliente;
import Dominio.Campo;
import Dominio.Equipo;
import Dominio.EstructuraDeTuberia;
import Dominio.Motor;
import Dominio.Neumatico;
import Dominio.OidGenerator;
import Dominio.Persona;
import Dominio.Presupuesto;
import Dominio.Factura;
import Dominio.Valvula;
import GestionarPersona.InterfazGestionarCliente;

/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 *
 */

public class MediadorGestionarCliente implements ActionListener{
	
	private int filaSeleccion; 
	private Persona personaABorrar = null;
	private InterfazGestionarCliente iP= null;
	private MediadorInsertarCliente mGP = null;
	private Vector <Cliente> vectorDeClientes=null;
	private Vector datos = new Vector ();
	private Persistencia obP; 
	private Cliente clienteABorrar=null;
	
	/**
	 *@since Metodo constructor de la clase MediadorABM.
	 */
	public MediadorGestionarCliente () {
		super();		
		this.iP=new InterfazGestionarCliente();
		this.iP.setListenerBotones(this);
		this.iP.pack();
		this.iP.setLocationRelativeTo(null);
		this.show();
		this.obtenerDatos();		
	}
	
	/**
	 *@since Metodo que hace visible la interfaz principal.
	 */
	private void show (){
		this.iP.setVisible(true);
	}
	
	/**
	 * @since Metodo que se encarga de refrescar el vector que luego sera utilizado para la carga de
	 * @since la tabla mediante el metodo cargarTabla.
	 */
	public void obtenerDatos () {
		this.obP=new Persistencia();
		OidGenerator.init(this.obP.getPm().getPersistenceManagerFactory());
		this.datos = new Vector();
		try 
		{
			this.vectorDeClientes= this.obP.filtrarDatos(Cliente.class, " ");			
			for (int i=0;i<vectorDeClientes.size();i++){
				Cliente cliente = (Cliente)vectorDeClientes.get(i);
				if (cliente.getDni()!=null){
					Vector fila = new Vector();
					fila.add(cliente.getTipo());
					fila.add(cliente.getDni());
					fila.add(cliente.getNombre());
					fila.add(cliente.getApellido());
					this.datos.add(fila);
					//creo persona nueva
					Cliente clienteAux = new Cliente();
					clienteAux.setDni(cliente.getDni());
					clienteAux.setTipo(cliente.getTipo());
					clienteAux.setNombre(cliente.getNombre());
					clienteAux.setApellido(cliente.getApellido());
					this.vectorDeClientes.remove(i);
					this.vectorDeClientes.add(i, clienteAux);
				}
				else {
					this.vectorDeClientes.remove(i);
				}		
			}	
			this.obP.commit();
			this.cargarTabla();			
		}    
	    catch (Exception e)
	    {	    	
	        System.out.println("Exception thrown during retrieval of Extent : " + e.getMessage());
	    }
	    finally
	    {	        
            this.obP.close();        
	    }	    
	}
	
	/**
	 * @since Metodo encargado de cargar la tabla utilizando el vector datos y el vector columna.
	 */
	public void cargarTabla () {
		/*todos los campos son no editables, salvo el de selección*/
		javax.swing.table.DefaultTableModel modeloTabla = new javax.swing.table.DefaultTableModel(this.getData(),this.getColumName()){
			public boolean isCellEditable(int row, int column) {
			/*no se hacen editable ninguna de las columnas de la tabla*/
			return false;
    	 	}
	    	/*para saber la clase del objeto que se esta almacenando en la columna*/
			public Class getColumnClass(int c) {
				return getValueAt(0, c).getClass();
	    	}
	    };
	    /*set del ancho de las columnas*/
	    this.getIntergazPersona().getJTable1Personas().setModel(modeloTabla);
	}
	 
	/**
	 * @since Metodo encargado de retornar el vector que posee los nombres de las columnas para la tabla.
	 * @return columnName
	 */
	public static Vector getColumName(){
		java.util.Vector columnName=new java.util.Vector();
		columnName.add(new String("TIPO Doc"));
		columnName.add(new String("Número"));
		columnName.add(new String("Nombre"));	
		columnName.add(new String("Apellido"));
		return columnName;
	}
	
	/**
	 * @since Metodo que retorna la interfaz principal.
	 * @return iabm
	 */
	public InterfazGestionarCliente getIntergazPersona() {
		return (iP);
	}
	
	/**
	 * @since Metodo que setea la interfaz principal.
	 */
	public void setInterfazPersona (InterfazGestionarCliente vP) {
		this.iP = vP;
	}
	
	/**
	 * @since Metodo que retorna el vector que posee por cada fila, otro vector que representa una persona.
	 * @return datos
	 */
	public Vector getData(){
		return this.datos;
	}
	
	/**
	 * @since Metodo que captura los eventos de los botones: "Agregar", "Modificar" y "Borrar"
	 */
	public void actionPerformed (ActionEvent arg0) {
		Object source = arg0.getSource();
		/*Condicion para AGREGAR*/
		if (this.iP.getJButtonAgregar() == source)   {			
			System.out.println("Agregar cliente");
			this.iP.dispose();
			new MediadorInsertarCliente();			
		}
		/*Condicion para MODIFICAR*/
		if (this.iP.getJButtonModificar()== source)   {
			this.Modificar();
			this.obtenerDatos(); 
		}		
		/*Condicion para BORRAR*/
		if (this.iP.getJButtonEliminar() == source) {			
			this.esBorrar();
		}	
	}
	
	/**
	 * @since Metodo que llama al mediador insertar cliente para setear uno nuevo
	 */
	private void agregar(){
		this.mGP = new MediadorInsertarCliente();
		this.mGP.setearPersona();
		this.obtenerDatos();
	}
	
	/**
	 * @since Metodo que llama llama a la interfaz necesaria para modificar un cliente según la selección realizada
	 */
	private void Modificar(){
		int filaSeleccion = this.iP.getJTable1Personas().getSelectedRow();
		if (filaSeleccion!=-1) {
			Cliente personaSeleccionada = (Cliente)this.vectorDeClientes.get(filaSeleccion);
			this.mGP = new MediadorInsertarCliente(personaSeleccionada);
		} else {
			JOptionPane.showMessageDialog(null,"Debe seleccionar una PERSONA","Informacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 *@since Metodo que se encarga de borrar una persona en el vector utilizado como base de datos,
	 *@since y posteriormente actualizar la tabla sin el.
	 */
	private void esBorrar(){
		this.filaSeleccion = this.iP.getJTable1Personas().getSelectedRow();
		if (this.filaSeleccion!=-1) {
			int boton = JOptionPane.showConfirmDialog(null,"¿Eliminar PERSONA?","Eliminar",JOptionPane.OK_CANCEL_OPTION);
			if (boton == JOptionPane.OK_OPTION) {			
				this.eliminarPersona();
			}
			this.obtenerDatos(); //Refrescar tabla
		} else {
			JOptionPane.showMessageDialog(null,"Debe seleccionar una PERSONA","Informacion",JOptionPane.ERROR_MESSAGE);
		} 
	}
	
	/**
	 * @since Metodo que elimina una persona de la base de datos.
	 */
	public void eliminarPersona(){
		Campo c=null;
		obP=new Persistencia();		
	    try {
			this.vectorDeClientes= obP.filtrarDatos(Cliente.class, "");
			this.clienteABorrar= (Cliente) this.vectorDeClientes.get(this.filaSeleccion);
			for (Iterator i = clienteABorrar.getCampo().iterator(); i.hasNext(); ) {
				c = (Campo)i.next();
				Equipo e=(Equipo)obP.getObjeto(Equipo.class,"campo.id=="+c.getId());
				Presupuesto p=(Presupuesto)obP.getObjeto(Presupuesto.class,"equipo.id=="+e.getId());
				Valvula v=e.getValvula();
				Aspersor a=e.getAspersor();
				EstructuraDeTuberia edt=e.getEstructuraDeTuberia();
				Motor m=e.getMotor();
				Neumatico n=e.getRodado();
				Vector<Factura> vectorFactura = obP.filtrarDatos(Factura.class, "presupuesto.id=="+p.getId());				
				if (!vectorFactura.isEmpty()){
					Factura f=(Factura)vectorFactura.get(0);
					obP.eliminar(Factura.class, f.getId());	
				}
				obP.eliminar(Presupuesto.class, p.getId());
				obP.eliminar(Equipo.class, e.getId());
				obP.eliminar(Aspersor.class, a.getId());
				obP.eliminar(Valvula.class, v.getId());
				obP.eliminar(EstructuraDeTuberia.class, edt.getId());
				obP.eliminar(Motor.class, m.getId());
				obP.eliminar(Neumatico.class, n.getId());
				clienteABorrar.removeCampo(c);
				obP.eliminar(Campo.class, c.getId());
			}
			obP.eliminar(Cliente.class, this.clienteABorrar.getId());
            obP.commit();
		}
		catch (Exception e) {
			obP.rollback();
		}
		finally {
			obP.close();
		}
	}
	
	/**
	 * @since Metodo que remueve una fila de la tabla.
	 * @param fila
	 */
	public void removeRow(int fila) {		
		datos.remove(fila);
		this.iP.getJTable1Personas();    
    }	
}

