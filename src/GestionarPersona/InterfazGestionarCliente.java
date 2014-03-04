package GestionarPersona;


import javax.swing.JPanel;
import javax.swing.JDialog;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
//import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Toolkit;
import java.awt.Color;

/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 * 
 */
public class InterfazGestionarCliente extends JDialog {
 
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JButton jButtonAgregar = null;
	private JButton jButtonModificar = null;
	private JButton jButtonEliminar = null;
	private JScrollPane jScrollPane1Tabla = null;
	private JTable jTable1Personas = null;
	private JPanel jPanelBotones = null;
	/**
	 * This is the default constructor
	 */
	public InterfazGestionarCliente() {
		super();
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\trabajos java POO\\riegoscentro\\Imagenes\\gota.png"));
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(423, 248);
		//this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:/proyectos/RiegosCentro/Imagenes/gota.png"));
		this.setContentPane(getJContentPane());
		this.setTitle("Clientes");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
			gridBagConstraints21.gridx = 2;
			gridBagConstraints21.gridy = 1;
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.fill = GridBagConstraints.BOTH;
			gridBagConstraints11.gridy = 0;
			gridBagConstraints11.weightx = 1.0;
			gridBagConstraints11.weighty = 1.0;
			gridBagConstraints11.gridwidth = 3;
			gridBagConstraints11.gridx = 0;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.fill = GridBagConstraints.BOTH;
			gridBagConstraints3.gridy = 0;
			gridBagConstraints3.weightx = 1.0;
			gridBagConstraints3.weighty = 1.0;
			gridBagConstraints3.gridx = 0;
			jContentPane = new JPanel();
			jContentPane.setLayout(new GridBagLayout());
			jContentPane.setBackground(Color.white);
			jContentPane.add(getJScrollPane1Tabla(), gridBagConstraints11);
			jContentPane.add(getJPanelBotones(), gridBagConstraints21);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jButtonAgregar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonAgregar() {
		if (jButtonAgregar == null) {
			jButtonAgregar = new JButton();
			jButtonAgregar.setText("Agregar");
			jButtonAgregar.setForeground(Color.black);
		}
		return jButtonAgregar;
	}
 
	/**
	 * This method initializes jButtonModificar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonModificar() {
		if (jButtonModificar == null) {
			jButtonModificar = new JButton();
			jButtonModificar.setText("Modificar");
			jButtonModificar.setForeground(Color.black);
		}
		return jButtonModificar;
	}

	/**
	 * This method initializes jButtonEliminar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonEliminar() {
		if (jButtonEliminar == null) {
			jButtonEliminar = new JButton();
			jButtonEliminar.setText("Eliminar");
			jButtonEliminar.setForeground(Color.black);
		}
		return jButtonEliminar;
	}

	/**
	 * This method initializes jScrollPane1Tabla	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane1Tabla() {
		if (jScrollPane1Tabla == null) {
			jScrollPane1Tabla = new JScrollPane();
			jScrollPane1Tabla.setViewportView(getJTable1Personas());
		}
		return jScrollPane1Tabla;
	}

	/**
	 * This method initializes jTable1Personas	
	 * 	
	 * @return javax.swing.JTable	
	 */
	public JTable getJTable1Personas() {
		if (jTable1Personas == null) {
			jTable1Personas = new JTable();
			jTable1Personas.setSelectionBackground(Color.white);
			jTable1Personas.setSelectionForeground(Color.black);
		}
		return jTable1Personas;
	}

	/**
	 * This method initializes jPanelBotones	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelBotones() {
		if (jPanelBotones == null) {
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.insets = new Insets(4, 4, 4, 4);
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints.gridx = -1;
			gridBagConstraints.gridy = -1;
			gridBagConstraints.insets = new Insets(4, 4, 4, 4);
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints1.gridx = -1;
			gridBagConstraints1.gridy = -1;
			gridBagConstraints1.insets = new Insets(4, 4, 4, 4);
			jPanelBotones = new JPanel();
			jPanelBotones.setLayout(new GridBagLayout());
			jPanelBotones.setBackground(Color.white);
			jPanelBotones.add(getJButtonAgregar(), gridBagConstraints);
			jPanelBotones.add(getJButtonModificar(), gridBagConstraints1);
			jPanelBotones.add(getJButtonEliminar(), gridBagConstraints2);
		}
		return jPanelBotones;
	}

	/**
	 * @since Metodo que setea los listeners para los botones: Agregar, Modificar y Eliminar. 
	 * @param aL
	 */
	public void setListenerBotones (ActionListener aL) {
		this.jButtonAgregar.addActionListener(aL);
		this.jButtonModificar.addActionListener(aL);
		this.jButtonEliminar.addActionListener(aL);
	}

}  //  @jve:decl-index=0:visual-constraint="27,15"
