package GestionarPersona;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import CalcularEstructura.Validar;
import Dominio.*;
import BaseDeDatos.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import CalcularEstructura.*;

/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 *
 */

public class MediadorInsertarCliente implements ActionListener, ItemListener {
	
	private InterfazInsertarCliente igp; 
	private Validar va=new Validar();
	private Cliente cl=null;
	private Campo c=null;
	private Persistencia obP=null;
	private Vector <Cliente> cliente=null;
	private Vector <Campo> campo=null;
	private Cliente clienteAModificar = null;
	private boolean flag=false;
	private Connection conexion = null;
	private int idDeptoCliente=0;
	private int idDeptoCampo=0;
	private int idLocalidadCliente=0;
	private int idLocalidadCampo=0;
	
	/**
	 * @since Metodo constructor de la clase vacio.
	 */
	public MediadorInsertarCliente(){
		super();	
		this.igp = new InterfazInsertarCliente();
		this.igp.getJComboBoxLocalidadCampo().setEnabled(false);
		this.igp.getJComboBoxLocalidadCliente().setEnabled(false);
		this.igp.getJComboBoxProvinciaCliente().setEnabled(false);
		this.igp.getJComboBoxDptoCliente().setEnabled(false);
		this.igp.getJComboBoxDptoCampo().setEnabled(false);
		this.igp.getJComboBoxProvinciaCampo().setEnabled(false);
		this.igp.setListenerButtons(this);
		this.igp.setItemListener(this);
		this.igp.getJButtonModificarCampos().setVisible(false);
		this.igp.getJComboBoxCampo().setVisible(false);
		this.igp.setVisible(true);
		this.igp.setLocationRelativeTo(null);	
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/riego", "root", ""); 
		}catch(Exception e){
			e.printStackTrace();
		}
		this.llenarComboBoxPais();
	}

	/**
	 * @since Metodo constructor de la clase vacio precargado.
	 * @param c
	 */	
	public MediadorInsertarCliente(Cliente c){
		super();
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/riego", "root", ""); 
		}catch(Exception e){
			e.printStackTrace();
		}
		this.igp = new InterfazInsertarCliente();
		this.igp.setModal(true);
		this.igp.setListenerButtons(this);
		this.llenarComboBoxPais();
		this.setearMediadorModificarCliente(c);	
		this.igp.getJButtonModificarCampos().setVisible(false);
		this.igp.getJComboBoxCampo().setVisible(false);
		this.igp.setLocationRelativeTo(null);
		this.igp.setVisible(true);
	}
	
	/**
	 * @since Metodo que llena los comboBox de los paises.
	 */
	public void llenarComboBoxPais(){
		try {
			Statement st = this.conexion.createStatement();
			st.executeQuery ("SELECT * FROM pais");
			ResultSet ds = st.getResultSet ( );			
			while (ds.next ( )) {
				/*mientras ds tenga elementos */
				igp.getJComboBoxPais().addItem(ds.getString(2));
				igp.getJComboBoxPaisCampo().addItem(ds.getString(2));
			}
			ds.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @since Metdodo que se encarga de obtener los datos de la base de datos,
	 * @since dependiendo del dni del cliente y la direccion del campo pasada como parametro.
	 * @param dni
	 * @param dirCampo
	 */
	public void obtenerVectores(String dni,String dirCampo){
		obP=new Persistencia();
		OidGenerator.init(obP.getPm().getPersistenceManagerFactory());
		try{
			cliente =obP.filtrarDatos(Cliente.class, "dni==\""+dni+"\"");
			campo =obP.filtrarDatos(Campo.class, "direccion==\""+dirCampo+"\"");	        	
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * @since Metodo que captura los eventos de los botones: "Modificar cliente", "Cancelar"
	 */
	public void actionPerformed(ActionEvent arg1) {
		Object source = arg1.getSource();
		if (this.igp.getJButtonAceptar()==source) {
			this.obtenerVectores(igp.getJTextFieldDni().getText(), igp.getJTextFieldDireccion().getText());
				if (!igp.getTitle().equals("Modificar cliente")){
					this.aceptar();
				}
				else{
					this.aceptarModificar(this.clienteAModificar);
				}
		}
		if (this.igp.getJButtonCancelar() == source)   {			
			System.out.println("Cancelar");
			this.cancelar();
		}		
	}
	
	/**
	 * @since 
	 */
	private void cancelar (){
		this.igp.dispose();
	}
	
	/**
	 * @since Metodo que setea una persona si esta no esta almacenada en la base de datos.
	 */
	public void setearPersona(){
		int id=0;
		if (cliente.size()==0){//si el cliente no existe
			flag=true;
			cl=new Cliente();
			this.cl.setApellido(igp.getJTextFieldApellido().getText().toUpperCase());
			this.cl.setNombre(igp.getJTextFieldNombre().getText().toUpperCase());
			this.cl.setTipo((String)igp.getJComboBoxTDni().getSelectedItem());
			this.cl.setDni(igp.getJTextFieldDni().getText());
			this.cl.setMail(igp.getJTextFieldMail().getText());
			this.cl.setTel(igp.getJTextFieldTelContacto().getText());	
			try {
				Statement st = this.conexion.createStatement();
				String nombre=(String)this.igp.getJComboBoxLocalidadCliente().getSelectedItem();
				st.executeQuery ("SELECT * FROM localidad where nombre=\""+nombre+"\" and departamento_id="+ idDeptoCliente);
				ResultSet ds = st.getResultSet ( );
				while (ds.next ( )) {
					id=ds.getInt(1);
				}
				ds.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			this.cl.setLocalidadId(id);		
		}
		else{
			flag=false;
			JOptionPane.showMessageDialog(null,"El cliente ya existe","Informacion",JOptionPane.ERROR_MESSAGE); 
		}				
	}
	
	/**
	 * @since Metodo que setea un campo si esta no esta almacenado
	 */
	public void setearCampo(){
		if(flag==true){ // Si el campo no existe
		if (campo.size()==0){
			c= new Campo();
			c.setDireccion(igp.getJTextFieldDireccion().getText());
			c.setHectareas(Integer.parseInt(igp.getJTextFieldCantHa().getText()));
			c.setCliente(cl);
			cl.addCampo(c);
			int id=0;
			try{
				Statement st = this.conexion.createStatement();
				String nombre=(String)this.igp.getJComboBoxLocalidadCampo().getSelectedItem();
				st.executeQuery ("SELECT * FROM localidad where nombre=\""+nombre+"\" and departamento_id="+ idDeptoCampo);
				ResultSet ds = st.getResultSet ( );
				while (ds.next ( )) {
					id=ds.getInt(1);
				}
				ds.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			c.setLocalidad(id);
			}
		}	
		else{
			JOptionPane.showMessageDialog(null,"El campo ya existe","Informacion",JOptionPane.ERROR_MESSAGE); 
		}
	}
	
	/**
	 * @since Metodo que se encarga  de setear la interfaz con la persona que se le paso como parámetro.
	 * @param p
	 */
	public void setearMediadorModificarCliente (Cliente p){
		this.igp.getJTextFieldNombre().setText(p.getNombre());
		this.igp.getJTextFieldApellido().setText(p.getApellido());
		this.igp.getJTextFieldDni().setText(p.getDni());
		obP=new Persistencia();
		OidGenerator.init(obP.getPm().getPersistenceManagerFactory());
		try{
			cliente =obP.filtrarDatos(Cliente.class, "dni==\""+p.getDni()+"\"");
			p.setLocalidadId(cliente.elementAt(0).getLocalidadId());
		}catch (Exception e){
			e.printStackTrace();
		}
		this.igp.getJTextFieldTelContacto().setText(cliente.get(0).getTel());
		this.igp.getJTextFieldMail().setText(cliente.get(0).getMail());
		Vector<String> ubicacion=this.getUbicacion(p);
		this.igp.getJComboBoxPais().setSelectedItem("ARGENTINA");
		this.llenarComboBoxProvincia();
		this.igp.getJComboBoxProvinciaCliente().setSelectedItem(ubicacion.get(2));
		this.llenarComboBoxDepartamento(ubicacion.get(2));
		this.igp.getJComboBoxDptoCliente().setSelectedItem(ubicacion.get(1));
		this.llenarComboBoxLocalidad(ubicacion.get(1));
		this.igp.getJComboBoxLocalidadCliente().setSelectedItem(ubicacion.get(0));
		this.igp.getJComboBoxTDni().setSelectedItem (p.getTipo());
		this.igp.setSize(500, 400);
		this.igp.setTitle("Modificar cliente");
		this.igp.setLocationRelativeTo(null);
		this.igp.setItemListener(this);
		this.igp.getJButtonModificarCampos().setVisible(true);
		this.igp.getJPanelCampo().setVisible(false);
		this.clienteAModificar = p;
	}
	
	/**
	 * @since Metodo que retorna la ubicacion del cliente pasado como parametro
	 * @param p
	 * @return ubicacion
	 */
	public Vector <String> getUbicacion (Cliente p){
		Vector <String> ubicacion=new Vector <String> ();
		int deptoId=0;
		int provinciaId=0;
		try {
			Statement st = this.conexion.createStatement();
			st.executeQuery ("SELECT * FROM localidad WHERE id = \""+p.getLocalidadId()+"\"");
			ResultSet ds = st.getResultSet ( );
			while (ds.next ( )) {
				ubicacion.add(ds.getString(3));
				deptoId=ds.getInt(2);  
			}
			ds.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			Statement st = this.conexion.createStatement();
			st.executeQuery ("SELECT * FROM departamento WHERE id = \""+deptoId+"\"");
			ResultSet ds = st.getResultSet ( );
			while (ds.next ( )) {
				ubicacion.add(ds.getString(3));
				provinciaId=ds.getInt(2);
			}
			ds.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			Statement st = this.conexion.createStatement();
			st.executeQuery ("SELECT * FROM provincia WHERE id = \""+provinciaId+"\"");
			ResultSet ds = st.getResultSet ( );
			while (ds.next ( )) {
				ubicacion.add(ds.getString(2));
			}
			ds.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ubicacion;
	}
	
	/**
	 * @since
	 */
	public void aceptar(){
		setearPersona();
		setearCampo();
		 if(flag==true){
			 this.igp.dispose();
			 MediadorCalcularEstructura mce=new MediadorCalcularEstructura(c,cl, obP); 
		 }//FIJARSE el obP no es necesario pasarlo se cierra en el finally
	}
	
	/**
	 * 
	 * @param p
	 */
	public void aceptarModificar(Cliente p){
		try{
			this.obP = new Persistencia();
			cliente = obP.filtrarDatos(Cliente.class, "dni==\""+p.getDni()+"\"");
			cliente.get(0).setApellido(igp.getJTextFieldApellido().getText());
			cliente.get(0).setNombre(igp.getJTextFieldNombre().getText());
			cliente.get(0).setDni(igp.getJTextFieldDni().getText());
			cliente.get(0).setTipo(igp.getJComboBoxTDni().getSelectedItem().toString());
			int id=0;
			try {
				Statement st = this.conexion.createStatement();
				String nombre=(String)this.igp.getJComboBoxLocalidadCliente().getSelectedItem();
				st.executeQuery ("SELECT * FROM localidad where nombre=\""+nombre+"\" and departamento_id="+ idDeptoCliente);
				ResultSet ds = st.getResultSet ( );
				while (ds.next ( )) {
					id=ds.getInt(1);
				}
				ds.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			cliente.get(0).setLocalidadId(id);
			igp.dispose();			
			obP.commit();			
		} 
		catch (Exception e){
			e.printStackTrace();
		}
		finally{
			 this.obP.close();																						 
		}		
	}

	/**
	 * @since Metodo que se encarga de llenar el ComboBox de las provincias
	 */
	public void llenarComboBoxProvincia(){
		try {
			Statement st = this.conexion.createStatement();
			st.executeQuery ("SELECT * FROM provincia p WHERE p.id_Pais = 1");//\""+idPais+"\"");
			ResultSet ds = st.getResultSet ( );
			while (ds.next ( )) {
				igp.getJComboBoxProvinciaCliente().addItem(ds.getString(2));
			}
			ds.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	public void llenarComboBoxProvinciaCampo(){
		try {
			Statement st = this.conexion.createStatement();
			st.executeQuery ("SELECT * FROM provincia p WHERE p.id_Pais = 1");
			ResultSet ds = st.getResultSet ( );
			while (ds.next ( )) {
				igp.getJComboBoxProvinciaCampo().addItem(ds.getString(2));
			}
			ds.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void llenarComboBoxDepartamento(String nomProvincia){
		int id=0;
		try {
			Statement st = this.conexion.createStatement();
			st.executeQuery ("SELECT * FROM provincia p WHERE p.nombre = \""+nomProvincia+"\"");
			ResultSet ds = st.getResultSet ( );
			while (ds.next ( )) {
				id=(ds.getInt(1));
			}
			ds.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			Statement st = this.conexion.createStatement();
			st.executeQuery ("SELECT * FROM departamento d WHERE d.provincia_id = \""+id+"\"");
			ResultSet ds = st.getResultSet ( );
			while (ds.next ( )) {
				igp.getJComboBoxDptoCliente().addItem(ds.getString(3));
			}
			ds.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void llenarComboBoxDepartamentoCampo(String nomProvincia){
		int id=0;
		try {
			Statement st = this.conexion.createStatement();
			st.executeQuery ("SELECT * FROM provincia p WHERE p.nombre = \""+nomProvincia+"\"");
			ResultSet ds = st.getResultSet ( );
			while (ds.next ( )) {
				id=(ds.getInt(1));
			}
			ds.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Statement st = this.conexion.createStatement();
			st.executeQuery ("SELECT * FROM departamento d WHERE d.provincia_id = \""+id+"\"");
			ResultSet ds = st.getResultSet ( );
			while (ds.next ( )) {
				igp.getJComboBoxDptoCampo().addItem(ds.getString(3));
			}
			ds.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void llenarComboBoxLocalidad(String nomDepto){
		try {
			Statement st = this.conexion.createStatement();
			st.executeQuery ("SELECT * FROM departamento p WHERE p.nombre = \""+nomDepto+"\"");
			ResultSet ds = st.getResultSet ( );
			while (ds.next ( )) {
				idDeptoCliente=(ds.getInt(1));
			}
			ds.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Statement st = this.conexion.createStatement();
			st.executeQuery ("SELECT * FROM localidad l WHERE l.departamento_id = \""+idDeptoCliente+"\"");
			ResultSet ds = st.getResultSet ( );
			while (ds.next ( )) {
				igp.getJComboBoxLocalidadCliente().addItem(ds.getString(3));
			}
			ds.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void llenarComboBoxLocalidadCampo(String nomDepto){
		int id=0;
		try {
			Statement st = this.conexion.createStatement();
			st.executeQuery ("SELECT * FROM departamento p WHERE p.nombre = \""+nomDepto+"\"");
			ResultSet ds = st.getResultSet ( );
			while (ds.next ( )) {
				idDeptoCampo=(ds.getInt(1));
			}
			ds.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Statement st = this.conexion.createStatement();
			st.executeQuery ("SELECT * FROM localidad l WHERE l.departamento_id = \""+idDeptoCampo+"\"");
			ResultSet ds = st.getResultSet ( );
			while (ds.next ( )) {
				igp.getJComboBoxLocalidadCampo().addItem(ds.getString(3));
			}
			ds.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void itemStateChanged(ItemEvent ie) {
		Object source = ie.getSource();
		if(source == this.igp.getJComboBoxPais()){
			this.igp.getJComboBoxProvinciaCliente().removeAllItems();
			this.igp.getJComboBoxProvinciaCliente().addItem("<Selec Prov>");
			this.igp.getJComboBoxDptoCliente().setEnabled(false);
			this.igp.getJComboBoxLocalidadCliente().setEnabled(false);
			llenarComboBoxProvincia();
			this.igp.getJComboBoxProvinciaCliente().setEnabled(true);
		}
		if(source == this.igp.getJComboBoxProvinciaCliente()){
			this.igp.getJComboBoxDptoCliente().removeAllItems();
			this.igp.getJComboBoxDptoCliente().addItem("<Selec Depto>");
			this.igp.getJComboBoxLocalidadCliente().setEnabled(false);
			llenarComboBoxDepartamento((String)igp.getJComboBoxProvinciaCliente().getSelectedItem());
			this.igp.getJComboBoxDptoCliente().setEnabled(true);
		}
		if(source == this.igp.getJComboBoxDptoCliente()){
			this.igp.getJComboBoxLocalidadCliente().removeAllItems();
			llenarComboBoxLocalidad((String) igp.getJComboBoxDptoCliente().getSelectedItem());
			this.igp.getJComboBoxLocalidadCliente().setEnabled(true);			
		}
		if(source == this.igp.getJComboBoxPaisCampo()){
			this.igp.getJComboBoxProvinciaCampo().removeAllItems();
			this.igp.getJComboBoxProvinciaCampo().addItem("<Selec Prov>");
			this.igp.getJComboBoxDptoCampo().setEnabled(false);
			this.igp.getJComboBoxLocalidadCampo().setEnabled(false);
			llenarComboBoxProvinciaCampo();
			this.igp.getJComboBoxProvinciaCampo().setEnabled(true);
		}
		if(source == this.igp.getJComboBoxProvinciaCampo()){
			this.igp.getJComboBoxDptoCampo().removeAllItems();
			this.igp.getJComboBoxDptoCampo().addItem("<Selec Depto>");
			this.igp.getJComboBoxLocalidadCampo().setEnabled(false);
			llenarComboBoxDepartamentoCampo((String)igp.getJComboBoxProvinciaCampo().getSelectedItem());
			this.igp.getJComboBoxDptoCampo().setEnabled(true);
		}
		if(source == this.igp.getJComboBoxDptoCampo()){
			this.igp.getJComboBoxLocalidadCampo().removeAllItems();
			this.igp.getJComboBoxLocalidadCampo().addItem("<Selec Depto>");
			llenarComboBoxLocalidadCampo((String)igp.getJComboBoxDptoCampo().getSelectedItem());
			this.igp.getJComboBoxLocalidadCampo().setEnabled(true);
		}
	}
}

