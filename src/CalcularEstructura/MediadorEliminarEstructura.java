package CalcularEstructura;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import BaseDeDatos.Persistencia;
import Dominio.*;
import Dominio.OidGenerator;
import Dominio.Presupuesto;

/**
 * 
 * @author Nicolas Chailvo, Damian Espindola y Maria Eugenia Peña
 *
 */
public class MediadorEliminarEstructura implements ActionListener {
	
	private InterfazEliminarEstructura iee=null;
	private Persistencia obP=null;
	private Vector vectorEstructura=null;
	private Vector datos=null;

	/**
	 * Costructor de la clase
	 */
	public MediadorEliminarEstructura() {
		this.iee= new InterfazEliminarEstructura();
		this.iee.setListenerButtons(this);
		this.iee.pack();
		this.iee.show();  
		this.iee.setLocationRelativeTo(null);
		this.obtenerDatos();
	}
	
	/**
	 * actionPerformed: captura los eventos de los botones "Eliminar Selecion" y "Eliminar Todo"
	 */
	public void actionPerformed(ActionEvent arg0) {
		Object source = arg0.getSource();
		if (this.iee.getJButtonElimSelec()== source)   {		
			this.esBorrar();
		}
		if (this.iee.getJButton1ElimTodo()== source)   {		
			this.eliminarTodo();
		}
		if (this.iee.getJButtonCanelar()==source){
			this.cancelar();
		}		
	}
	
	private void cancelar (){
		this.iee.dispose();
	}
	
	/**
	 * cargarTabla: carga la tabla utilizando el vector dato y el vector columna
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
	    this.iee.getJTable().setModel(modeloTabla);
	}
	
	/**
	 * getData: retorna el vector que posee por cada fila, otro vector que representa una persona.
	 * @return datos
	 */
	public Vector getData(){
		return this.datos;
	}
	
	/**
	 * getColumName: retornar el vector que posee los nombres de las columnas para la tabla.
	 * @return columnName
	 */
	public static Vector getColumName(){
		java.util.Vector columnName=new java.util.Vector();
		columnName.add(new String("Id"));
		columnName.add(new String("Cant. Tramos"));
		columnName.add(new String("Longitud total"));	
		columnName.add(new String("Bajo riego"));
		columnName.add(new String("Caudal"));
		columnName.add(new String("Tipo Boquilla"));
		columnName.add(new String("Presión Conexión"));
		return columnName;
	}
	
	/**
	 * obtenerDatos: se encarga de refrescar el vector que luego sera utilizado para la carga de la tabla mediante el metodo cargarTabla.
	 */
	public void obtenerDatos () {
		obP=new Persistencia();
		OidGenerator.init(obP.getPm().getPersistenceManagerFactory());
		this.datos = new Vector();
		try 
		{
			this.vectorEstructura= obP.filtrarDatos(Equipo.class, "campo==null");			
			for (int i=0;i<vectorEstructura.size();i++){
				Equipo equipo = (Equipo)vectorEstructura.get(i);
				Vector fila = new Vector();
				fila.add(equipo.getId());
				int cantTramos=((Integer)equipo.getEstructuraDeTuberia().getCantidad1())+((Integer)equipo.getEstructuraDeTuberia().getCantidad2())+((Integer)equipo.getEstructuraDeTuberia().getCantidad3());
				fila.add(cantTramos);
				fila.add(equipo.getEstructuraDeTuberia().getLongitudTotal());
				fila.add(equipo.getBajoRiego());
				fila.add(equipo.getCaudal());
				fila.add(equipo.getTipoBoquilla());
				fila.add(equipo.getPresionConexion());
				this.datos.add(fila);		
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
            obP.close();        
	    }	    
	}
	
	/**
	 * esBorrar: se encarga de eliminar la estrucuta con la fila seleccionada 
	 */
	private void esBorrar(){
		int filaSeleccion=this.iee.getJTable().getSelectedRow();
		if (filaSeleccion!=-1) {
			int boton = JOptionPane.showConfirmDialog(null,"¿Eliminar estructura?","Eliminar",JOptionPane.OK_CANCEL_OPTION);
			if (boton == JOptionPane.OK_OPTION) {			
				eliminar(filaSeleccion);
			}
			this.obtenerDatos(); //Refrescar tabla
		} else {
			JOptionPane.showMessageDialog(null,"Debe seleccionar una estructura","Informacion",JOptionPane.ERROR_MESSAGE);
		} 
	}
	
	/**
	 * eliminar: elimina de la base de datos el presupuesto, equipo, inventario de boquilla, aspersor, valvula, estructura de tuberia, motor y neumaticos
	 * 			 relacionados con una estructura en particular 
	 * @param filaSeleccion
	 */
	private void eliminar(int filaSeleccion){
		obP=new Persistencia();
		Vector fila=(Vector)this.datos.elementAt(filaSeleccion);
		Long id=(Long)fila.elementAt(0);
		try {
			Presupuesto p=(Presupuesto)obP.getObjeto(Presupuesto.class,"equipo.id=="+id);
			Equipo e=p.getEquipo();
			Valvula v=e.getValvula();
			Aspersor a=e.getAspersor();
			EstructuraDeTuberia edt=e.getEstructuraDeTuberia();
			Motor m=e.getMotor();
			Neumatico n=e.getRodado();
			obP.eliminar(Presupuesto.class, p.getId());
			obP.eliminar(Equipo.class,id);
			obP.eliminar(InventarioBoquilla.class, id);
			obP.eliminar(Aspersor.class, a.getId());
			obP.eliminar(Valvula.class, v.getId());
			obP.eliminar(EstructuraDeTuberia.class, edt.getId());
			obP.eliminar(Motor.class, m.getId());
			obP.eliminar(Neumatico.class, n.getId());
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
	 * eliminarTodo: elimina todos las estructuras de la base de datos
	 */
	private void eliminarTodo(){
		int boton = JOptionPane.showConfirmDialog(null,"¿Eliminar estructura?","Eliminar",JOptionPane.OK_CANCEL_OPTION);
		if (boton == JOptionPane.OK_OPTION) {	
			obP=new Persistencia();
			try {
				Vector <Equipo> v=obP.filtrarDatos(Equipo.class,"campo==null");
				for (int i=0;i<v.size();i++){
					Presupuesto p=(Presupuesto)obP.getObjeto(Presupuesto.class,"equipo.id=="+v.get(i).getId());
					Equipo e=p.getEquipo();
					Valvula va=e.getValvula();
					Aspersor a=e.getAspersor();
					EstructuraDeTuberia edt=e.getEstructuraDeTuberia();
					Motor m=e.getMotor();
					Neumatico n=e.getRodado();
					obP.eliminar(Presupuesto.class, p.getId());
					obP.eliminar(Equipo.class,v.get(i).getId());
					obP.eliminar(Aspersor.class, a.getId());
					obP.eliminar(Valvula.class, va.getId());
					obP.eliminar(EstructuraDeTuberia.class, edt.getId());
					obP.eliminar(Motor.class, m.getId());
					obP.eliminar(Neumatico.class, n.getId());
				}
				obP.commit();
			}
			catch (Exception e) {
				obP.rollback();
			}
			finally {
				obP.close();
			}
		}
		this.obtenerDatos(); //Refrescar tabla
		
	}
}// Fin clase MediadorEliminarEstructura
