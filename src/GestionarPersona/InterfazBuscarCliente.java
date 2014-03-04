package GestionarPersona;

import javax.swing.JPanel;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import javax.swing.JComboBox;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 * 
 */
public class InterfazBuscarCliente extends JDialog{

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabelNombre = null;
	private JLabel jLabelApellido = null;
	private JLabel jLabelDni = null;
	private JTextField jTextFieldNombre = null;
	private JTextField jTextFieldApellido = null;
	private JTextField jTextFieldDni = null;
	private JLabel jLabelTexto2 = null;
	private JButton jButtonBuscar = null;
	private JButton jButtonCancelar = null;
	private JScrollPane jScrollPane = null;
	private JTable jTableResultado = null;
	private JButton jButtonAceptar = null;
	private JComboBox jComboBoxTDni = null;
	private JLabel jLabelTexto = null;
	private JPanel panelBotones;
	private JButton JbutonCancelarDatos;
	
	/**
	 * This is the default constructor
	 */
	public InterfazBuscarCliente() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(497, 178);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\trabajos java POO\\riegoscentro\\Imagenes\\gota.png"));
		this.setContentPane(getJContentPane());
		this.setResizable(false);
		//this.setContentPane(getJContentPane());
		this.setTitle("Buscar");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			GridBagConstraints gridBagConstraints41 = new GridBagConstraints();
			gridBagConstraints41.anchor = GridBagConstraints.WEST;
			gridBagConstraints41.gridx = 0;
			gridBagConstraints41.gridwidth = 4;
			gridBagConstraints41.insets = new Insets(8, 5, 5, 0);
			gridBagConstraints41.gridy = 0;
			jLabelTexto = new JLabel();
			jLabelTexto.setText("Ingrese los datos del cliente que desea buscar");
			jLabelTexto.setForeground(Color.black);
			jLabelTexto.setFont(new Font("Dialog", Font.BOLD, 14));
			GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
			gridBagConstraints31.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints31.gridy = 3;
			gridBagConstraints31.weightx = 1.0;
			gridBagConstraints31.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints31.gridx = 1;
			GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
			gridBagConstraints21.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints21.fill = java.awt.GridBagConstraints.BOTH;
			gridBagConstraints21.gridy = 5;
			gridBagConstraints21.weightx = 1.0;
			gridBagConstraints21.weighty = 1.0;
			gridBagConstraints21.gridwidth = 4;
			gridBagConstraints21.gridx = 0;
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.gridx = 0;
			gridBagConstraints7.gridwidth = 4;
			gridBagConstraints7.anchor = GridBagConstraints.CENTER;
			gridBagConstraints7.insets = new Insets(10, 5, 10, 0);
			gridBagConstraints7.gridy = 4;
			jLabelTexto2 = new JLabel();
			jLabelTexto2.setText("Resultados de la busqueda");
			jLabelTexto2.setForeground(Color.black);
			jLabelTexto2.setFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 14));
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints6.gridy = 3;
			gridBagConstraints6.weightx = 1.0;
			gridBagConstraints6.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints6.anchor = GridBagConstraints.CENTER;
			gridBagConstraints6.gridwidth = 1;
			gridBagConstraints6.ipadx = 0;
			gridBagConstraints6.gridx = 2;
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints5.gridy = 2;
			gridBagConstraints5.weightx = 1.0;
			gridBagConstraints5.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints5.gridwidth = 2;
			gridBagConstraints5.gridx = 1;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints4.gridy = 1;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints4.gridwidth = 2;
			gridBagConstraints4.gridx = 1;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.anchor = GridBagConstraints.EAST;
			gridBagConstraints3.gridx = 0;
			gridBagConstraints3.insets = new Insets(0, 5, 5, 5);
			gridBagConstraints3.gridy = 3;
			jLabelDni = new JLabel();
			jLabelDni.setText("Tipo y Nro de DNI: ");
			jLabelDni.setForeground(Color.black);
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 0;
			gridBagConstraints2.insets = new Insets(0, 0, 5, 5);
			gridBagConstraints2.anchor = GridBagConstraints.EAST;
			gridBagConstraints2.gridy = 2;
			jLabelApellido = new JLabel();
			jLabelApellido.setText("Apellido: ");
			jLabelApellido.setForeground(Color.black);
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.insets = new Insets(0, 0, 5, 5);
			gridBagConstraints1.anchor = GridBagConstraints.EAST;
			gridBagConstraints1.gridy = 1;
			jLabelNombre = new JLabel();
			jLabelNombre.setText("Nombre: ");
			jLabelNombre.setForeground(Color.black);
			jContentPane = new JPanel();
			jContentPane.setBackground(Color.white);
			GridBagLayout gbl_jContentPane = new GridBagLayout();
			gbl_jContentPane.columnWidths = new int[]{0, 0, 131, 0};
			gbl_jContentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
			gbl_jContentPane.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0};
			gbl_jContentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 15};
			jContentPane.setLayout(gbl_jContentPane);
			jContentPane.add(jLabelNombre, gridBagConstraints1);
			jContentPane.add(jLabelApellido, gridBagConstraints2);
			GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
			gridBagConstraints8.gridheight = 2;
			gridBagConstraints8.gridx = 3;
			gridBagConstraints8.anchor = GridBagConstraints.EAST;
			gridBagConstraints8.insets = new Insets(7, 6, 7, 0);
			gridBagConstraints8.gridy = 1;
			jContentPane.add(getJButtonBuscar(), gridBagConstraints8);
			jContentPane.add(jLabelDni, gridBagConstraints3);
			jContentPane.add(getJTextFieldNombre(), gridBagConstraints4);
			jContentPane.add(getJTextFieldApellido(), gridBagConstraints5);
			jContentPane.add(getJTextFieldDni(), gridBagConstraints6);
			GridBagConstraints gbc_JbutonCancelarDatos = new GridBagConstraints();
			gbc_JbutonCancelarDatos.fill = GridBagConstraints.HORIZONTAL;
			gbc_JbutonCancelarDatos.insets = new Insets(0, 5, 5, 0);
			gbc_JbutonCancelarDatos.gridx = 3;
			gbc_JbutonCancelarDatos.gridy = 3;
			jContentPane.add(getJbutonCancelarDatos(), gbc_JbutonCancelarDatos);
			jContentPane.add(jLabelTexto2, gridBagConstraints7);
			GridBagConstraints gbc_panelBotones = new GridBagConstraints();
			gbc_panelBotones.anchor = GridBagConstraints.SOUTHEAST;
			gbc_panelBotones.gridwidth = 4;
			gbc_panelBotones.insets = new Insets(0, 0, 2, 0);
			gbc_panelBotones.gridx = 0;
			gbc_panelBotones.gridy = 6;
			jContentPane.add(getPanelBotones(), gbc_panelBotones);
			jContentPane.add(getJScrollPane(), gridBagConstraints21);
			jContentPane.add(getJComboBoxTDni(), gridBagConstraints31);
			jContentPane.add(jLabelTexto, gridBagConstraints41);
		}
		return jContentPane;
	}
	

	private JPanel getPanelBotones() {
		if (panelBotones == null) {
			panelBotones = new JPanel();
			panelBotones.setBackground(Color.WHITE);
			GridBagLayout gbl_panelBotones = new GridBagLayout();
			gbl_panelBotones.columnWidths = new int[]{244, 98, 0};
			gbl_panelBotones.rowHeights = new int[]{0, 0};
			gbl_panelBotones.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
			gbl_panelBotones.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panelBotones.setLayout(gbl_panelBotones);
			GridBagConstraints gbc_jButtonAceptar = new GridBagConstraints();
			gbc_jButtonAceptar.insets = new Insets(0, 0, 6, 6);
			gbc_jButtonAceptar.anchor = GridBagConstraints.EAST;
			gbc_jButtonAceptar.gridx = 0;
			gbc_jButtonAceptar.gridy = 0;
			panelBotones.add(getJButtonAceptar(), gbc_jButtonAceptar);
			GridBagConstraints gbc_jButtonCancelar = new GridBagConstraints();
			gbc_jButtonCancelar.insets = new Insets(0, 0, 6, 0);
			gbc_jButtonCancelar.anchor = GridBagConstraints.NORTHWEST;
			gbc_jButtonCancelar.gridx = 1;
			gbc_jButtonCancelar.gridy = 0;
			panelBotones.add(getJButtonCancelar(), gbc_jButtonCancelar);
		}
		return panelBotones;
	}

	public JLabel getJLabelTexto() {
		return jLabelTexto;
	}

	public void setJLabelTexto(JLabel labelTexto) {
		jLabelTexto = labelTexto;
	}

	public JLabel getJLabelNombre() {
		return jLabelNombre;
	}

	public void setJLabelNombre(JLabel labelNombre) {
		jLabelNombre = labelNombre;
	}

	public JLabel getJLabelApellido() {
		return jLabelApellido;
	}

	public void setJLabelApellido(JLabel labelApellido) {
		jLabelApellido = labelApellido;
	}

	public JLabel getJLabelDni() {
		return jLabelDni;
	}

	public void setJLabelDni(JLabel labelDni) {
		jLabelDni = labelDni;
	}

	public JLabel getJLabelTexto2() {
		return jLabelTexto2;
	}

	public void setJLabelTexto2(JLabel labelTexto2) {
		jLabelTexto2 = labelTexto2;
	}

	/**
	 * This method initializes jTextFieldNombre	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldNombre() {
		if (jTextFieldNombre == null) {
			jTextFieldNombre = new JTextField();
		}
		return jTextFieldNombre;
	}

	/**
	 * This method initializes jTextFieldApellido	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldApellido() {
		if (jTextFieldApellido == null) {
			jTextFieldApellido = new JTextField();
		}
		return jTextFieldApellido;
	}

	/**
	 * This method initializes jTextFieldDni	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldDni() {
		if (jTextFieldDni == null) {
			jTextFieldDni = new JTextField();
			jTextFieldDni.setPreferredSize(new Dimension(30, 20));
		}
		return jTextFieldDni;
	}

	/**
	 * This method initializes jButtonBuscar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonBuscar() {
		if (jButtonBuscar == null) {
			jButtonBuscar = new JButton();
			jButtonBuscar.setIcon(new ImageIcon("D:\\proyectos\\riegoscentro\\Imagenes\\IconosTesis\\find.png"));
			jButtonBuscar.setPreferredSize(new java.awt.Dimension(85,26));
			jButtonBuscar.setForeground(Color.black);
			jButtonBuscar.setText("Buscar");
		}
		return jButtonBuscar;
	}

	/**
	 * This method initializes jButtonCancelar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonCancelar() {
		if (jButtonCancelar == null) {
			jButtonCancelar = new JButton();
			jButtonCancelar.setText("Cancelar");
			jButtonCancelar.setVisible(false);
		}
		return jButtonCancelar;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	public JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getJTableResultado());
			jScrollPane.setViewportView(getJTableResultado());
			jScrollPane.setVisible(false);
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableResultado	
	 * 	
	 * @return javax.swing.JTable	
	 */
	public JTable getJTableResultado() {
		if (jTableResultado == null) {
			jTableResultado = new JTable();
		}
		return jTableResultado;
	}
	
	/**
	 * This method initializes jButtonAceptar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonAceptar() {
		if (jButtonAceptar == null) {
			jButtonAceptar = new JButton();
			jButtonAceptar.setVisible(false);
		}
		return jButtonAceptar;
	}

	/**
	 * This method initializes jComboBoxTDni	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	public JComboBox getJComboBoxTDni() {
		if (jComboBoxTDni == null) {
			jComboBoxTDni = new JComboBox();
			jComboBoxTDni.setPreferredSize(new Dimension(80, 20));
			jComboBoxTDni.setBackground(Color.white);
			this.cargarTDni();
		}
		return jComboBoxTDni;
	}
	
	/**
	 * @since agregar los botones a la escucha
	 * @param al
	 */
	public void setListenerButtons(ActionListener al){
		this.jButtonAceptar.addActionListener(al);
		this.jButtonBuscar.addActionListener(al);
		this.jButtonCancelar.addActionListener(al);
		this.JbutonCancelarDatos.addActionListener(al);
	}
	
	/**
	 * @since Cargar el combo con los diferentes tipos de Documentos.
	 */
	public void cargarTDni(){
		this.getJComboBoxTDni().addItem("");
		this.getJComboBoxTDni().addItem("LC");
		this.getJComboBoxTDni().addItem("DNI");
		this.getJComboBoxTDni().addItem("Pasaporte");
	}
	public JButton getJbutonCancelarDatos() {
		if (JbutonCancelarDatos == null) {
			JbutonCancelarDatos = new JButton("Cancelar");
			JbutonCancelarDatos.setForeground(Color.black);
		}
		return JbutonCancelarDatos;
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"
