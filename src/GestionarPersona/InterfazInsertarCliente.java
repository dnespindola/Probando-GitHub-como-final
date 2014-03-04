package GestionarPersona; 

//import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
//import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.JButton;
//import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.Toolkit;

/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 * 
 */
public class InterfazInsertarCliente extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabelApellido = null;
	private JLabel jLabelNombre = null;
	private JLabel jLabelTDni = null;
	private JTextField jTextFieldApellido = null;
	private JTextField jTextFieldNombre = null;
	private JComboBox jComboBoxTDni = null;
	private JTextField jTextFieldDni = null;
	private JLabel jLabelLocalidad = null;
	private JLabel jLabelProvincia = null;
	private JLabel jLabelPais = null;
	private JComboBox jComboBoxPais = null;
	private JLabel jLabelPersona = null;
	private JLabel jLabelCampo = null;
	private JLabel jLabelDireccion = null;
	private JTextField jTextFieldDireccion = null;
	private JLabel jLabelCantHa = null;
	private JTextField jTextFieldCantHa = null;
	private JLabel jLabelLocalidadCampo = null;
	private JLabel jLabelProvinciaCampo = null;
	private JButton jButtonAceptar = null;
	private JButton jButtonCancelar = null;
	private JComboBox jComboBoxCampo = null;
	private JPanel jPanelCampo = null;
	private JPanel jPanelBotones = null;
	private JButton jButtonModificarCampos = null;
	private JComboBox jComboBoxProvinciaCliente = null;
	private JComboBox jComboBoxLocalidadCliente = null;
	private JComboBox jComboBoxProvinciaCampo = null;
	private JComboBox jComboBoxLocalidadCampo = null;
	private JLabel jLabelTelContacto = null;
	private JTextField jTextFieldTelContacto = null;
	private JLabel jLabelMail = null;
	private JTextField jTextFieldMail = null;
	private JComboBox jComboBoxDptoCampo = null;
	private JLabel jLabelDptoCampo = null;
	private JLabel jLabelDptoCliente = null;
	private JComboBox jComboBoxDptoCliente = null;
	private JLabel jLabelPaisCampo = null;
	private JComboBox jComboBoxPaisCampo = null;
	
	/**
	 * This is the default constructor
	 */
	public InterfazInsertarCliente() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(648, 347);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\trabajos java POO\\riegoscentro\\Imagenes\\gota.png"));
		this.setResizable(false);
		this.setEnabled(true);
		this.setContentPane(getJContentPane());
		this.setTitle("Gestionar Persona");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			GridBagConstraints gridBagConstraints210 = new GridBagConstraints();
			gridBagConstraints210.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints210.gridy = 10;
			gridBagConstraints210.weightx = 1.0;
			gridBagConstraints210.gridwidth = 2;
			gridBagConstraints210.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints210.gridx = 1;
			GridBagConstraints gridBagConstraints110 = new GridBagConstraints();
			gridBagConstraints110.gridx = 0;
			gridBagConstraints110.anchor = GridBagConstraints.EAST;
			gridBagConstraints110.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints110.gridy = 10;
			jLabelDptoCliente = new JLabel();
			jLabelDptoCliente.setText("Departamento:");
			jLabelDptoCliente.setForeground(Color.black);
			GridBagConstraints gridBagConstraints41 = new GridBagConstraints();
			gridBagConstraints41.fill = GridBagConstraints.BOTH;
			gridBagConstraints41.gridy = 7;
			gridBagConstraints41.weightx = 1.0;
			gridBagConstraints41.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints41.gridwidth = 2;
			gridBagConstraints41.gridx = 1;
			GridBagConstraints gridBagConstraints32 = new GridBagConstraints();
			gridBagConstraints32.gridx = 0;
			gridBagConstraints32.anchor = GridBagConstraints.EAST;
			gridBagConstraints32.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints32.gridy = 7;
			jLabelMail = new JLabel();
			jLabelMail.setText("Mail:");
			jLabelMail.setForeground(Color.black);
			GridBagConstraints gridBagConstraints24 = new GridBagConstraints();
			gridBagConstraints24.fill = GridBagConstraints.BOTH;
			gridBagConstraints24.gridy = 6;
			gridBagConstraints24.weightx = 1.0;
			gridBagConstraints24.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints24.gridx = 1;
			GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
			gridBagConstraints19.gridx = 0;
			gridBagConstraints19.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints19.anchor = GridBagConstraints.EAST;
			gridBagConstraints19.gridy = 6;
			jLabelTelContacto = new JLabel();
			jLabelTelContacto.setText("Teléfono de Contacto:");
			jLabelTelContacto.setForeground(Color.black);
			GridBagConstraints gridBagConstraints22 = new GridBagConstraints();
			gridBagConstraints22.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints22.gridy = 11;
			gridBagConstraints22.weightx = 1.0;
			gridBagConstraints22.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints22.gridwidth = 2;
			gridBagConstraints22.gridx = 1;
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints11.gridy = 9;
			gridBagConstraints11.weightx = 1.0;
			gridBagConstraints11.gridwidth = 2;
			gridBagConstraints11.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints11.gridx = 1;
			GridBagConstraints gridBagConstraints33 = new GridBagConstraints();
			gridBagConstraints33.gridx = 0;
			gridBagConstraints33.gridwidth = 6;
			gridBagConstraints33.anchor = GridBagConstraints.EAST;
			gridBagConstraints33.insets = new Insets(7, 0, 0, 9);
			gridBagConstraints33.gridy = 12;
			GridBagConstraints gridBagConstraints23 = new GridBagConstraints();
			gridBagConstraints23.gridx = 3;
			gridBagConstraints23.gridheight = 10;
			gridBagConstraints23.gridwidth = 3;
			gridBagConstraints23.insets = new Insets(0, 0, 0, 0);
			gridBagConstraints23.anchor = GridBagConstraints.NORTH;
			gridBagConstraints23.gridy = 1;
			GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
			gridBagConstraints15.fill = GridBagConstraints.VERTICAL;
			jLabelProvinciaCampo = new JLabel();
			jLabelProvinciaCampo.setText("Provincia:");
			jLabelProvinciaCampo.setForeground(Color.black);
			jLabelLocalidadCampo = new JLabel();
			jLabelLocalidadCampo.setText("Localidad:");
			jLabelLocalidadCampo.setForeground(Color.black);
			jLabelCantHa = new JLabel();
			jLabelCantHa.setText("Cantidad Ha:");
			jLabelCantHa.setForeground(Color.black);
			jLabelDireccion = new JLabel();
			jLabelDireccion.setText("Direccion:");
			jLabelDireccion.setForeground(Color.black);
			jLabelCampo = new JLabel();
			jLabelCampo.setText("Información del Campo");
			jLabelCampo.setForeground(Color.black);
			jLabelCampo.setFont(new Font("Dialog", Font.BOLD, 14));
			GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
			gridBagConstraints31.gridx = 0;
			gridBagConstraints31.gridwidth = 2;
			gridBagConstraints31.insets = new Insets(20, 10, 0, 0);
			gridBagConstraints31.anchor = GridBagConstraints.WEST;
			gridBagConstraints31.gridy = 1;
			jLabelPersona = new JLabel();
			jLabelPersona.setText("Información del cliente");
			jLabelPersona.setForeground(Color.black);
			jLabelPersona.setFont(new Font("Dialog", Font.BOLD, 14));
			GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
			gridBagConstraints21.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints21.gridy = 8;
			gridBagConstraints21.weightx = 1.0;
			gridBagConstraints21.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints21.gridx = 1;
			GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
			gridBagConstraints12.gridx = 0;
			gridBagConstraints12.anchor = GridBagConstraints.EAST;
			gridBagConstraints12.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints12.gridy = 8;
			jLabelPais = new JLabel();
			jLabelPais.setText("Pais:");
			jLabelPais.setForeground(Color.black);
			GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
			gridBagConstraints10.gridx = 0;
			gridBagConstraints10.anchor = GridBagConstraints.EAST;
			gridBagConstraints10.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints10.gridy = 9;
			jLabelProvincia = new JLabel();
			jLabelProvincia.setText("Provincia:");
			jLabelProvincia.setForeground(Color.black);
			GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
			gridBagConstraints8.gridx = 0;
			gridBagConstraints8.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints8.anchor = GridBagConstraints.EAST;
			gridBagConstraints8.gridy = 11;
			jLabelLocalidad = new JLabel();
			jLabelLocalidad.setText("Localidad:");
			jLabelLocalidad.setForeground(Color.black);
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints7.gridy = 5;
			gridBagConstraints7.weightx = 1.0;
			gridBagConstraints7.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints7.gridx = 2;
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints5.gridy = 5;
			gridBagConstraints5.weightx = 1.0;
			gridBagConstraints5.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints5.anchor = GridBagConstraints.CENTER;
			gridBagConstraints5.gridx = 1;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.fill = GridBagConstraints.BOTH;
			gridBagConstraints4.gridy = 4;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints4.anchor = GridBagConstraints.CENTER;
			gridBagConstraints4.gridwidth = 2;
			gridBagConstraints4.gridx = 1;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.fill = GridBagConstraints.BOTH;
			gridBagConstraints3.gridy = 3;
			gridBagConstraints3.weightx = 1.0;
			gridBagConstraints3.insets = new Insets(11, 7, 5, 7);
			gridBagConstraints3.anchor = GridBagConstraints.CENTER;
			gridBagConstraints3.gridwidth = 2;
			gridBagConstraints3.gridx = 1;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 0;
			gridBagConstraints2.insets = new Insets(0, 3, 5, 0);
			gridBagConstraints2.anchor = GridBagConstraints.EAST;
			gridBagConstraints2.gridy = 5;
			jLabelTDni = new JLabel();
			jLabelTDni.setText("Tipo y nro documento:");
			jLabelTDni.setForeground(Color.black);
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints1.anchor = GridBagConstraints.EAST;
			gridBagConstraints1.gridy = 4;
			jLabelNombre = new JLabel();
			jLabelNombre.setText("Nombre:");
			jLabelNombre.setForeground(Color.black);
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.insets = new Insets(11, 0, 5, 0);
			gridBagConstraints.anchor = GridBagConstraints.EAST;
			gridBagConstraints.gridy = 3;
			jLabelApellido = new JLabel();
			jLabelApellido.setText("Apellido:");
			jLabelApellido.setForeground(Color.black);
			jContentPane = new JPanel();
			jContentPane.setLayout(new GridBagLayout());
			jContentPane.setBackground(Color.white);
			jContentPane.add(jLabelApellido, gridBagConstraints);
			jContentPane.add(jLabelNombre, gridBagConstraints1);
			jContentPane.add(jLabelTDni, gridBagConstraints2);
			jContentPane.add(getJTextFieldApellido(), gridBagConstraints3);
			jContentPane.add(getJTextFieldNombre(), gridBagConstraints4);
			jContentPane.add(getJComboBoxTDni(), gridBagConstraints5);
			jContentPane.add(getJTextFieldDni(), gridBagConstraints7);
			jContentPane.add(jLabelLocalidad, gridBagConstraints8);
			jContentPane.add(jLabelProvincia, gridBagConstraints10);
			jContentPane.add(jLabelPais, gridBagConstraints12);
			jContentPane.add(getJComboBoxPais(), gridBagConstraints21);
			jContentPane.add(jLabelPersona, gridBagConstraints31);
			jContentPane.add(getJPanelCampo(), gridBagConstraints23);
			jContentPane.add(getJPanelBotones(), gridBagConstraints33);
			jContentPane.add(getJComboBoxProvinciaCliente(), gridBagConstraints11);
			jContentPane.add(getJComboBoxLocalidadCliente(), gridBagConstraints22);
			jContentPane.add(jLabelTelContacto, gridBagConstraints19);
			jContentPane.add(getJTextFieldTelContacto(), gridBagConstraints24);
			jContentPane.add(jLabelMail, gridBagConstraints32);
			jContentPane.add(getJTextFieldMail(), gridBagConstraints41);
			jContentPane.add(jLabelDptoCliente, gridBagConstraints110);
			jContentPane.add(getJComboBoxDptoCliente(), gridBagConstraints210);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTextFieldApellido	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldApellido() {
		if (jTextFieldApellido == null) {
			jTextFieldApellido = new JTextField();
			jTextFieldApellido.setPreferredSize(new Dimension(80, 20));
		}
		return jTextFieldApellido;
	}

	/**
	 * This method initializes jTextFieldNombre	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldNombre() {
		if (jTextFieldNombre == null) {
			jTextFieldNombre = new JTextField();
			jTextFieldNombre.setPreferredSize(new Dimension(80, 20));
		}
		return jTextFieldNombre;
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
			jComboBoxTDni.setFont(new Font("Dialog", Font.BOLD, 12));
			this.cargarTDni();
		}
		return jComboBoxTDni;
	}

	/**
	 * This method initializes jTextFieldDni	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldDni() {
		if (jTextFieldDni == null) {
			jTextFieldDni = new JTextField();
			jTextFieldDni.setPreferredSize(new Dimension(80, 20));
		}
		return jTextFieldDni;
	}

	/**
	 * This method initializes jComboBoxPais	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	public JComboBox getJComboBoxPais() {
		if (jComboBoxPais == null) {
			jComboBoxPais = new JComboBox();
			jComboBoxPais.setPreferredSize(new Dimension(80, 20));
			jComboBoxPais.setBackground(Color.white);
			this.cargarPais();
		}
		return jComboBoxPais;
	}

	/**
	 * This method initializes jTextFieldDireccion	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldDireccion() {
		if (jTextFieldDireccion == null) {
			jTextFieldDireccion = new JTextField();
			jTextFieldDireccion.setPreferredSize(new Dimension(100, 20));
		}
		return jTextFieldDireccion;
	}

	/**
	 * This method initializes jTextFieldCantHa	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldCantHa() {
		if (jTextFieldCantHa == null) {
			jTextFieldCantHa = new JTextField();
			jTextFieldCantHa.setPreferredSize(new Dimension(80, 20));
		}
		return jTextFieldCantHa;
	}

	/**
	 * This method initializes jButtonAceptar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonAceptar() {
		if (jButtonAceptar == null) {
			jButtonAceptar = new JButton();
			jButtonAceptar.setText("Aceptar");
			jButtonAceptar.setForeground(Color.black);
		}
		return jButtonAceptar;
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
			jButtonCancelar.setForeground(Color.black);
		}
		return jButtonCancelar;
	}

	/**
	 * @since Metodo que setea las distintas opciones en el ComboBox de los documentos
	 */
	public void cargarTDni(){
		this.getJComboBoxTDni().addItem("<Selec Tipo>");
		this.getJComboBoxTDni().addItem("LC");
		this.getJComboBoxTDni().addItem("DNI");
		this.getJComboBoxTDni().addItem("Pasaporte");
	}
	
	/**
	 * @since Metodo que setea las distintas opciones en el ComboBox de pais
	 */
	public void cargarPais(){
		this.getJComboBoxPais().addItem("<Selec País>");
		this.getJComboBoxProvinciaCliente().addItem("<Selec Provincia>");
		this.getJComboBoxDptoCliente().addItem("<Selec Depto>");
		this.getJComboBoxLocalidadCliente().addItem("<Selec Localidad>");
	}	
	
	public void setListenerButtons (ActionListener al) {
		this.jButtonAceptar.addActionListener(al);
		this.jButtonCancelar.addActionListener(al);	
	}
		
	public void setItemListener(ItemListener il){
		this.jComboBoxPais.addItemListener(il);
		this.jComboBoxProvinciaCliente.addItemListener(il);
		this.jComboBoxDptoCliente.addItemListener(il);
		this.jComboBoxPaisCampo.addItemListener(il);
		this.jComboBoxProvinciaCampo.addItemListener(il);
		this.jComboBoxDptoCampo.addItemListener(il);
	}

	/**
	 * This method initializes jComboBoxCampo	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	public JComboBox getJComboBoxCampo() {
		if (jComboBoxCampo == null) {
			jComboBoxCampo = new JComboBox();
			jComboBoxCampo.setPreferredSize(new Dimension(100, 20));
			jComboBoxCampo.setBackground(Color.white);
		}
		return jComboBoxCampo;
	}

	/**
	 * This method initializes jPanelCampo	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	public JPanel getJPanelCampo() {
		if (jPanelCampo == null) {
			GridBagConstraints gridBagConstraints36 = new GridBagConstraints();
			gridBagConstraints36.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints36.gridy = 4;
			gridBagConstraints36.weightx = 1.0;
			gridBagConstraints36.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints36.gridx = 2;
			GridBagConstraints gridBagConstraints35 = new GridBagConstraints();
			gridBagConstraints35.gridx = 1;
			gridBagConstraints35.anchor = GridBagConstraints.EAST;
			gridBagConstraints35.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints35.gridy = 4;
			jLabelPaisCampo = new JLabel();
			jLabelPaisCampo.setText("Pais");
			jLabelPaisCampo.setForeground(Color.black);
			GridBagConstraints gridBagConstraints28 = new GridBagConstraints();
			gridBagConstraints28.gridx = 1;
			gridBagConstraints28.insets = new Insets(0, 0, 0, 0);
			gridBagConstraints28.gridy = 6;
			jLabelDptoCampo = new JLabel();
			jLabelDptoCampo.setText("Departamento");
			jLabelDptoCampo.setForeground(Color.black);
			GridBagConstraints gridBagConstraints27 = new GridBagConstraints();
			gridBagConstraints27.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints27.gridy = 6;
			gridBagConstraints27.weightx = 1.0;
			gridBagConstraints27.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints27.gridx = 2;
			GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
			gridBagConstraints18.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints18.gridy = 7;
			gridBagConstraints18.weightx = 1.0;
			gridBagConstraints18.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints18.gridx = 2;
			GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
			gridBagConstraints9.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints9.gridy = 5;
			gridBagConstraints9.weightx = 1.0;
			gridBagConstraints9.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints9.gridx = 2;
			GridBagConstraints gridBagConstraints30 = new GridBagConstraints();
			gridBagConstraints30.anchor = GridBagConstraints.WEST;
			gridBagConstraints30.gridwidth = 3;
			gridBagConstraints30.gridx = 0;
			gridBagConstraints30.gridy = 0;
			gridBagConstraints30.insets = new Insets(20, 3, 0, 69);
			GridBagConstraints gridBagConstraints29 = new GridBagConstraints();
			gridBagConstraints29.anchor = GridBagConstraints.EAST;
			gridBagConstraints29.gridx = 1;
			gridBagConstraints29.gridy = 5;
			gridBagConstraints29.insets = new Insets(0, 0, 5, 0);
			GridBagConstraints gridBagConstraints26 = new GridBagConstraints();
			gridBagConstraints26.fill = GridBagConstraints.BOTH;
			gridBagConstraints26.gridx = 2;
			gridBagConstraints26.gridy = 3;
			gridBagConstraints26.weightx = 1.0;
			gridBagConstraints26.insets = new Insets(0, 7, 5, 7);
			GridBagConstraints gridBagConstraints25 = new GridBagConstraints();
			gridBagConstraints25.fill = GridBagConstraints.BOTH;
			gridBagConstraints25.gridx = 2;
			gridBagConstraints25.gridy = 2;
			gridBagConstraints25.weightx = 1.0;
			gridBagConstraints25.insets = new Insets(6, 7, 5, 7);
			GridBagConstraints gridBagConstraints20 = new GridBagConstraints();
			gridBagConstraints20.anchor = GridBagConstraints.EAST;
			gridBagConstraints20.gridx = 1;
			gridBagConstraints20.gridy = 7;
			gridBagConstraints20.insets = new Insets(3, 0, 5, 0);
			GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
			gridBagConstraints14.anchor = GridBagConstraints.EAST;
			gridBagConstraints14.gridx = 1;
			gridBagConstraints14.gridy = 3;
			gridBagConstraints14.insets = new Insets(2, 0, 5, 0);
			GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
			gridBagConstraints13.anchor = GridBagConstraints.EAST;
			gridBagConstraints13.gridx = 1;
			gridBagConstraints13.gridy = 2;
			gridBagConstraints13.insets = new Insets(3, 0, 5, 0);
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints6.gridwidth = 1;
			gridBagConstraints6.gridx = 2;
			gridBagConstraints6.gridy = 1;
			gridBagConstraints6.weightx = 1.0;
			gridBagConstraints6.anchor = GridBagConstraints.WEST;
			gridBagConstraints6.insets = new Insets(8, 7, 2, 7);
			jPanelCampo = new JPanel();
			jPanelCampo.setLayout(new GridBagLayout());
			jPanelCampo.setBackground(Color.white);
			jPanelCampo.add(getJComboBoxCampo(), gridBagConstraints6);
			jPanelCampo.add(jLabelDireccion, gridBagConstraints13);
			jPanelCampo.add(jLabelCantHa, gridBagConstraints14);
			jPanelCampo.add(jLabelLocalidadCampo, gridBagConstraints20);
			jPanelCampo.add(getJTextFieldDireccion(), gridBagConstraints25);
			jPanelCampo.add(getJTextFieldCantHa(), gridBagConstraints26);
			jPanelCampo.add(jLabelProvinciaCampo, gridBagConstraints29);
			jPanelCampo.add(jLabelCampo, gridBagConstraints30);
			jPanelCampo.add(getJComboBoxProvinciaCampo(), gridBagConstraints9);
			jPanelCampo.add(getJComboBoxLocalidadCampo(), gridBagConstraints18);
			jPanelCampo.add(getJComboBoxDptoCampo(), gridBagConstraints27);
			jPanelCampo.add(jLabelDptoCampo, gridBagConstraints28);
			jPanelCampo.add(jLabelPaisCampo, gridBagConstraints35);
			jPanelCampo.add(getJComboBoxPaisCampo(), gridBagConstraints36);
		}
		return jPanelCampo;
	}

	/**
	 * This method initializes jPanelBotones	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelBotones() {
		if (jPanelBotones == null) {
			GridBagConstraints gridBagConstraints34 = new GridBagConstraints();
			gridBagConstraints34.gridx = 0;
			gridBagConstraints34.anchor = GridBagConstraints.WEST;
			gridBagConstraints34.insets = new Insets(0, 0, 0, 54);
			gridBagConstraints34.gridy = 0;
			GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
			gridBagConstraints17.anchor = GridBagConstraints.CENTER;
			gridBagConstraints17.gridx = 2;
			gridBagConstraints17.gridy = -1;
			gridBagConstraints17.insets = new Insets(0, 8, 0, 0);
			GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
			gridBagConstraints16.gridx = 1;
			gridBagConstraints16.insets = new Insets(0, 0, 0, 8);
			gridBagConstraints16.gridy = -1;
			jPanelBotones = new JPanel();
			jPanelBotones.setLayout(new GridBagLayout());
			jPanelBotones.setBackground(Color.white);
			jPanelBotones.add(getJButtonAceptar(), gridBagConstraints16);
			jPanelBotones.add(getJButtonCancelar(), gridBagConstraints17);
			jPanelBotones.add(getJButtonModificarCampos(), gridBagConstraints34);
		}
		return jPanelBotones;
	}

	/**
	 * This method initializes jButtonModificarCampos	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonModificarCampos() {
		if (jButtonModificarCampos == null) {
			jButtonModificarCampos = new JButton();
			jButtonModificarCampos.setText("Modificar Campo");
			jButtonModificarCampos.setForeground(Color.black);
		}
		return jButtonModificarCampos;
	}

	/**
	 * This method initializes jComboBoxProvinciaCliente	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	public JComboBox getJComboBoxProvinciaCliente() {
		if (jComboBoxProvinciaCliente == null) {
			jComboBoxProvinciaCliente = new JComboBox();
			jComboBoxProvinciaCliente.setPreferredSize(new Dimension(31, 20));
			jComboBoxProvinciaCliente.setBackground(Color.white);
		}
		return jComboBoxProvinciaCliente;
	}

	/**
	 * This method initializes jComboBoxLocalidadCliente	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	public JComboBox getJComboBoxLocalidadCliente() {
		if (jComboBoxLocalidadCliente == null) {
			jComboBoxLocalidadCliente = new JComboBox();
			jComboBoxLocalidadCliente.setPreferredSize(new Dimension(31, 20));
			jComboBoxLocalidadCliente.setBackground(Color.white);
		}
		return jComboBoxLocalidadCliente;
	}

	/**
	 * This method initializes jComboBoxProvinciaCampo	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	public JComboBox getJComboBoxProvinciaCampo() {
		if (jComboBoxProvinciaCampo == null) {
			jComboBoxProvinciaCampo = new JComboBox();
			jComboBoxProvinciaCampo.setPreferredSize(new Dimension(31, 20));
			jComboBoxProvinciaCampo.setBackground(Color.white);
		}
		return jComboBoxProvinciaCampo;
	}

	/**
	 * This method initializes jComboBoxLocalidadCampo	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	public JComboBox getJComboBoxLocalidadCampo() {
		if (jComboBoxLocalidadCampo == null) {
			jComboBoxLocalidadCampo = new JComboBox();
			jComboBoxLocalidadCampo.setPreferredSize(new Dimension(31, 20));
			jComboBoxLocalidadCampo.setBackground(Color.white);
			jComboBoxLocalidadCampo.setEnabled(true);
		}
		return jComboBoxLocalidadCampo;
	}

	/**
	 * This method initializes jTextFieldTelContacto	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldTelContacto() {
		if (jTextFieldTelContacto == null) {
			jTextFieldTelContacto = new JTextField();
		}
		return jTextFieldTelContacto;
	}

	/**
	 * This method initializes jTextFieldMail	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldMail() {
		if (jTextFieldMail == null) {
			jTextFieldMail = new JTextField();
		}
		return jTextFieldMail;
	}

	/**
	 * This method initializes jComboBoxDptoCampo	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	public JComboBox getJComboBoxDptoCampo() {
		if (jComboBoxDptoCampo == null) {
			jComboBoxDptoCampo = new JComboBox();
			jComboBoxDptoCampo.setPreferredSize(new Dimension(31, 20));
			jComboBoxDptoCampo.setBackground(Color.white);
		}
		return jComboBoxDptoCampo;
	}

	/**
	 * This method initializes jComboBoxDptoCliente	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	public JComboBox getJComboBoxDptoCliente() {
		if (jComboBoxDptoCliente == null) {
			jComboBoxDptoCliente = new JComboBox();
			jComboBoxDptoCliente.setPreferredSize(new Dimension(31, 20));
			jComboBoxDptoCliente.setBackground(Color.white);
		}
		return jComboBoxDptoCliente;
	}

	/**
	 * This method initializes jComboBoxPaisCampo	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	public JComboBox getJComboBoxPaisCampo() {
		if (jComboBoxPaisCampo == null) {
			jComboBoxPaisCampo = new JComboBox();
			jComboBoxPaisCampo.setPreferredSize(new Dimension(31, 20));
			jComboBoxPaisCampo.setBackground(Color.white);
		}
		return jComboBoxPaisCampo;
	}
	
	public JLabel getJLabelApellido() {
		return jLabelApellido;
	}

	public void setJLabelApellido(JLabel labelApellido) {
		jLabelApellido = labelApellido;
	}

	public JLabel getJLabelNombre() {
		return jLabelNombre;
	}

	public void setJLabelNombre(JLabel labelNombre) {
		jLabelNombre = labelNombre;
	}

	public JLabel getJLabelTDni() {
		return jLabelTDni;
	}

	public void setJLabelTDni(JLabel labelTDni) {
		jLabelTDni = labelTDni;
	}

	public JLabel getJLabelLocalidad() {
		return jLabelLocalidad;
	}

	public void setJLabelLocalidad(JLabel labelLocalidad) {
		jLabelLocalidad = labelLocalidad;
	}

	public JLabel getJLabelProvincia() {
		return jLabelProvincia;
	}

	public void setJLabelProvincia(JLabel labelProvincia) {
		jLabelProvincia = labelProvincia;
	}

	public JLabel getJLabelPais() {
		return jLabelPais;
	}

	public void setJLabelPais(JLabel labelPais) {
		jLabelPais = labelPais;
	}

	public JLabel getJLabelDireccion() {
		return jLabelDireccion;
	}

	public void setJLabelDireccion(JLabel labelDireccion) {
		jLabelDireccion = labelDireccion;
	}

	public JLabel getJLabelCantHa() {
		return jLabelCantHa;
	}

	public void setJLabelCantHa(JLabel labelCantHa) {
		jLabelCantHa = labelCantHa;
	}

	public JLabel getJLabelLocalidadCampo() {
		return jLabelLocalidadCampo;
	}

	public void setJLabelLocalidadCampo(JLabel labelLocalidadCampo) {
		jLabelLocalidadCampo = labelLocalidadCampo;
	}

	public JLabel getJLabelProvinciaCampo() {
		return jLabelProvinciaCampo;
	}

	public void setJLabelProvinciaCampo(JLabel labelProvinciaCampo) {
		jLabelProvinciaCampo = labelProvinciaCampo;
	}

	public JLabel getJLabelTelContacto() {
		return jLabelTelContacto;
	}

	public void setJLabelTelContacto(JLabel labelTelContacto) {
		jLabelTelContacto = labelTelContacto;
	}

	public JLabel getJLabelMail() {
		return jLabelMail;
	}

	public void setJLabelMail(JLabel labelMail) {
		jLabelMail = labelMail;
	}

	public JLabel getJLabelPaisCampo() {
		return jLabelPaisCampo;
	}

	public void setJLabelPaisCampo(JLabel labelPaisCampo) {
		jLabelPaisCampo = labelPaisCampo;
	}

	public JLabel getJLabelDptoCampo() {
		return jLabelDptoCampo;
	}

	public void setJLabelDptoCampo(JLabel labelDptoCampo) {
		jLabelDptoCampo = labelDptoCampo;
	}

	public JLabel getJLabelDptoCliente() {
		return jLabelDptoCliente;
	}

	public void setJLabelDptoCliente(JLabel labelDptoCliente) {
		jLabelDptoCliente = labelDptoCliente;
	}

	


}  //  @jve:decl-index=0:visual-constraint="10,10"
