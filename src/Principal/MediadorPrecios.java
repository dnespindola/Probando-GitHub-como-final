package Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 * 
 */

public class MediadorPrecios implements ActionListener {
	
	private InterfazPrecios ip=null;
	private Connection conexion = null;
	private Vector precio = null;
	private int boton=0; //0=modificar, 1=confirmar, 2=listo
	private boolean seleccionada=true;
	private Vector aux=null;
	private String tipo=null; //el "tipo" de la fila seleccionada
	
	/**
	 * Constructor de la clase
	 */
	public MediadorPrecios () {
		ip = new InterfazPrecios();
		ip.setListenerButtons(this);
		ip.setLocationRelativeTo(null);
		ip.setVisible(true);
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/riego", "root", ""); 
		}catch(Exception e){
			e.printStackTrace();
		}
		llenarTablaPrecios();
	}
	
	public Vector getColumnName(){
		Vector columna=new Vector();
		columna.add(new String("Parte"));
		columna.add(new String("Tipo"));
		columna.add(new String("Precio"));
		return columna;
	}
	/**
	 * Llena la tabla con los datos de la tabla precio
	 */
	public void llenarTablaPrecios(){
		try {
			Statement st = this.conexion.createStatement();
			st.executeQuery ("SELECT * FROM precio");
			ResultSet ds = st.getResultSet ( );
			precio=new Vector();
			Vector fila=new Vector();
			while (ds.next ( )) {
				fila.add(ds.getString(2));
				fila.add(ds.getString(3));
				fila.add(ds.getFloat(4));
				precio.add(fila);
				fila=new Vector();
			}
			ds.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ip.getJTablePrecios().setModel(new DefaultTableModel(precio,getColumnName()));
	}
	
	/**
	 * Accion de los botones que permite modificar los precios
	 */
	public void actionPerformed(ActionEvent arg0) {
		Vector filaSel=null;
		Object source = arg0.getSource();
		if (this.ip.getJButtonModificar()==source) {
			int seleccion=ip.getJTablePrecios().getSelectedRow();
			if (seleccionada==true){
				filaSel=(Vector)precio.elementAt(seleccion);
				if (boton==0){
					aux=filaSel; //por si selecciona otra fila despues de apretar en modificar. 
				}	
			}	
			if (boton==0){
				ip.getJLabelPrecio().setVisible(true);
				ip.getJTextFieldPrecio().setVisible(true);
				ip.getJTextFieldPrecio().setText(filaSel.elementAt(2).toString());
				tipo=filaSel.elementAt(1).toString();
				ip.getJButtonModificar().setText("Confirmar");
				boton=1;
			}
			else{ 
				if (boton==1){
					String nuevoPrecio=ip.getJTextFieldPrecio().getText();
					aux.add(2,nuevoPrecio);
					ip.getJButtonModificar().setText("Listo");
					ip.getJButtonCancelar().setVisible(false);
					float nuevoP = Float.parseFloat(nuevoPrecio);
					try {				
						Statement st = this.conexion.createStatement();
						st.execute("UPDATE precio SET precio=\'"+nuevoP+"\' WHERE tipo=\'"+tipo+"\'");
						st.close();
					} 
					catch (SQLException e) {
						e.printStackTrace();
					}
					ip.getJTablePrecios().setModel(new DefaultTableModel(precio,getColumnName()));
					boton=2;
					seleccionada=false;
				}
				else{
					ip.dispose();
				}
				
			}
		}
		if (this.ip.getJButtonCancelar()==source) {
			ip.dispose();
		}
	}

}
