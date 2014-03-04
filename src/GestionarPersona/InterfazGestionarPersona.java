package GestionarPersona;

//import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JDialog;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
//import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.Toolkit;

/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 * 
 */
public class InterfazGestionarPersona extends JDialog {

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
	private JTextField jTextFieldLocalidad = null;
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
	private JTextField jTextFieldLocalidadCampo = null;
	private JLabel jLabelProvinciaCampo = null;
	private JLabel jLabelCaracteristica = null;
	private JButton jButtonAceptar = null;
	private JButton jButtonCancelar = null;
	private JTextField jTextFieldProvinciaCampo = null;
	private JTextField jTextFieldProvincia = null;
	private JTextField jTextFieldCaracteristica = null;
	private JLabel jLabelCodPost = null;
	private JTextField jTextFieldCodPost = null;
	private JLabel jLabelCodPostCampo = null;
	private JTextField jTextFieldCodPostCampo = null;
	/**
	 * This is the default constructor
	 */
	public InterfazGestionarPersona() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(616, 333);
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
			GridBagConstraints gridBagConstraints42 = new GridBagConstraints();
			gridBagConstraints42.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints42.gridy = 4;
			gridBagConstraints42.weightx = 1.0;
			gridBagConstraints42.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints42.gridx = 4;
			GridBagConstraints gridBagConstraints33 = new GridBagConstraints();
			gridBagConstraints33.gridx = 3;
			gridBagConstraints33.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints33.anchor = GridBagConstraints.EAST;
			gridBagConstraints33.gridy = 4;
			jLabelCodPostCampo = new JLabel();
			jLabelCodPostCampo.setText("Codigo Postal");
			jLabelCodPostCampo.setForeground(Color.black);
			GridBagConstraints gridBagConstraints22 = new GridBagConstraints();
			gridBagConstraints22.fill = GridBagConstraints.BOTH;
			gridBagConstraints22.gridy = 5;
			gridBagConstraints22.weightx = 1.0;
			gridBagConstraints22.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints22.gridwidth = 2;
			gridBagConstraints22.gridx = 1;
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.gridx = 0;
			gridBagConstraints11.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints11.anchor = GridBagConstraints.EAST;
			gridBagConstraints11.gridy = 5;
			jLabelCodPost = new JLabel();
			jLabelCodPost.setText("Codigo Postal");
			jLabelCodPost.setForeground(Color.black);
			GridBagConstraints gridBagConstraints32 = new GridBagConstraints();
			gridBagConstraints32.fill = GridBagConstraints.BOTH;
			gridBagConstraints32.gridy = 6;
			gridBagConstraints32.weightx = 1.0;
			gridBagConstraints32.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints32.gridx = 4;
			GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
			gridBagConstraints19.fill = GridBagConstraints.BOTH;
			gridBagConstraints19.gridy = 6;
			gridBagConstraints19.weightx = 1.0;
			gridBagConstraints19.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints19.gridwidth = 2;
			gridBagConstraints19.gridx = 1;
			GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
			gridBagConstraints18.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints18.gridy = 5;
			gridBagConstraints18.weightx = 1.0;
			gridBagConstraints18.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints18.gridx = 4;
			GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
			gridBagConstraints17.gridx = 4;
			gridBagConstraints17.anchor = GridBagConstraints.CENTER;
			gridBagConstraints17.insets = new Insets(0, 0, 0, 0);
			gridBagConstraints17.gridy = 9;
			GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
			gridBagConstraints16.gridx = 3;
			gridBagConstraints16.gridy = 9;
			GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
			gridBagConstraints15.fill = GridBagConstraints.VERTICAL;
			GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
			gridBagConstraints14.gridx = 3;
			gridBagConstraints14.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints14.anchor = GridBagConstraints.EAST;
			gridBagConstraints14.gridy = 6;
			jLabelCaracteristica = new JLabel();
			jLabelCaracteristica.setText("Caracteristica:");
			jLabelCaracteristica.setForeground(Color.black);
			GridBagConstraints gridBagConstraints111 = new GridBagConstraints();
			gridBagConstraints111.gridx = 3;
			gridBagConstraints111.anchor = GridBagConstraints.EAST;
			gridBagConstraints111.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints111.gridy = 5;
			jLabelProvinciaCampo = new JLabel();
			jLabelProvinciaCampo.setText("Provincia:");
			jLabelProvinciaCampo.setForeground(Color.black);
			GridBagConstraints gridBagConstraints101 = new GridBagConstraints();
			gridBagConstraints101.fill = GridBagConstraints.BOTH;
			gridBagConstraints101.gridy = 3;
			gridBagConstraints101.weightx = 1.0;
			gridBagConstraints101.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints101.gridx = 4;
			GridBagConstraints gridBagConstraints91 = new GridBagConstraints();
			gridBagConstraints91.gridx = 3;
			gridBagConstraints91.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints91.anchor = GridBagConstraints.EAST;
			gridBagConstraints91.gridy = 3;
			jLabelLocalidadCampo = new JLabel();
			jLabelLocalidadCampo.setText("Localidad:");
			jLabelLocalidadCampo.setForeground(Color.black);
			GridBagConstraints gridBagConstraints81 = new GridBagConstraints();
			gridBagConstraints81.fill = GridBagConstraints.BOTH;
			gridBagConstraints81.gridy = 2;
			gridBagConstraints81.weightx = 1.0;
			gridBagConstraints81.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints81.gridx = 4;
			GridBagConstraints gridBagConstraints71 = new GridBagConstraints();
			gridBagConstraints71.gridx = 3;
			gridBagConstraints71.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints71.anchor = GridBagConstraints.EAST;
			gridBagConstraints71.gridy = 2;
			jLabelCantHa = new JLabel();
			jLabelCantHa.setText("Cantidad Ha:");
			jLabelCantHa.setForeground(Color.black);
			GridBagConstraints gridBagConstraints61 = new GridBagConstraints();
			gridBagConstraints61.fill = GridBagConstraints.BOTH;
			gridBagConstraints61.gridy = 1;
			gridBagConstraints61.weightx = 1.0;
			gridBagConstraints61.insets = new Insets(11, 7, 5, 7);
			gridBagConstraints61.gridx = 4;
			GridBagConstraints gridBagConstraints51 = new GridBagConstraints();
			gridBagConstraints51.gridx = 3;
			gridBagConstraints51.insets = new Insets(11, 0, 5, 0);
			gridBagConstraints51.anchor = GridBagConstraints.EAST;
			gridBagConstraints51.gridy = 1;
			jLabelDireccion = new JLabel();
			jLabelDireccion.setText("Direccion:");
			jLabelDireccion.setForeground(Color.black);
			GridBagConstraints gridBagConstraints41 = new GridBagConstraints();
			gridBagConstraints41.gridx = 3;
			gridBagConstraints41.gridwidth = 2;
			gridBagConstraints41.insets = new Insets(20, 0, 0, 0);
			gridBagConstraints41.gridy = 0;
			jLabelCampo = new JLabel();
			jLabelCampo.setText("Información del Campo");
			jLabelCampo.setForeground(Color.black);
			jLabelCampo.setFont(new Font("Dialog", Font.BOLD, 14));
			GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
			gridBagConstraints31.gridx = 0;
			gridBagConstraints31.gridwidth = 2;
			gridBagConstraints31.insets = new Insets(20, 0, 0, 0);
			gridBagConstraints31.gridy = 0;
			jLabelPersona = new JLabel();
			jLabelPersona.setText("Información de la persona");
			jLabelPersona.setForeground(Color.black);
			jLabelPersona.setFont(new Font("Dialog", Font.BOLD, 14));
			GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
			gridBagConstraints21.fill = GridBagConstraints.BOTH;
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
			gridBagConstraints10.gridy = 6;
			jLabelProvincia = new JLabel();
			jLabelProvincia.setText("Provincia:");
			jLabelProvincia.setForeground(Color.black);
			GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
			gridBagConstraints9.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints9.gridy = 4;
			gridBagConstraints9.weightx = 1.0;
			gridBagConstraints9.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints9.anchor = GridBagConstraints.CENTER;
			gridBagConstraints9.gridwidth = 2;
			gridBagConstraints9.gridx = 1;
			GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
			gridBagConstraints8.gridx = 0;
			gridBagConstraints8.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints8.anchor = GridBagConstraints.EAST;
			gridBagConstraints8.gridy = 4;
			jLabelLocalidad = new JLabel();
			jLabelLocalidad.setText("Localidad:");
			jLabelLocalidad.setForeground(Color.black);
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.fill = GridBagConstraints.BOTH;
			gridBagConstraints7.gridy = 3;
			gridBagConstraints7.weightx = 1.0;
			gridBagConstraints7.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints7.gridx = 2;
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints5.gridy = 3;
			gridBagConstraints5.weightx = 1.0;
			gridBagConstraints5.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints5.anchor = GridBagConstraints.CENTER;
			gridBagConstraints5.gridx = 1;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.fill = GridBagConstraints.BOTH;
			gridBagConstraints4.gridy = 2;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.insets = new Insets(0, 7, 5, 7);
			gridBagConstraints4.anchor = GridBagConstraints.CENTER;
			gridBagConstraints4.gridwidth = 2;
			gridBagConstraints4.gridx = 1;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.fill = GridBagConstraints.BOTH;
			gridBagConstraints3.gridy = 1;
			gridBagConstraints3.weightx = 1.0;
			gridBagConstraints3.insets = new Insets(11, 7, 5, 7);
			gridBagConstraints3.anchor = GridBagConstraints.CENTER;
			gridBagConstraints3.gridwidth = 2;
			gridBagConstraints3.gridx = 1;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 0;
			gridBagConstraints2.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints2.anchor = GridBagConstraints.EAST;
			gridBagConstraints2.gridy = 3;
			jLabelTDni = new JLabel();
			jLabelTDni.setText("Tipo y nro documento:");
			jLabelTDni.setForeground(Color.black);
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.insets = new Insets(0, 0, 5, 0);
			gridBagConstraints1.anchor = GridBagConstraints.EAST;
			gridBagConstraints1.gridy = 2;
			jLabelNombre = new JLabel();
			jLabelNombre.setText("Nombre:");
			jLabelNombre.setForeground(Color.black);
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.insets = new Insets(11, 0, 5, 0);
			gridBagConstraints.anchor = GridBagConstraints.EAST;
			gridBagConstraints.gridy = 1;
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
			jContentPane.add(getJTextFieldLocalidad(), gridBagConstraints9);
			jContentPane.add(jLabelProvincia, gridBagConstraints10);
			jContentPane.add(jLabelPais, gridBagConstraints12);
			jContentPane.add(getJComboBoxPais(), gridBagConstraints21);
			jContentPane.add(jLabelPersona, gridBagConstraints31);
			jContentPane.add(jLabelCampo, gridBagConstraints41);
			jContentPane.add(jLabelDireccion, gridBagConstraints51);
			jContentPane.add(getJTextFieldDireccion(), gridBagConstraints61);
			jContentPane.add(jLabelCantHa, gridBagConstraints71);
			jContentPane.add(getJTextFieldCantHa(), gridBagConstraints81);
			jContentPane.add(jLabelLocalidadCampo, gridBagConstraints91);
			jContentPane.add(getJTextFieldLocalidadCampo(), gridBagConstraints101);
			jContentPane.add(jLabelProvinciaCampo, gridBagConstraints111);
			jContentPane.add(jLabelCaracteristica, gridBagConstraints14);
			jContentPane.add(getJButtonAceptar(), gridBagConstraints16);
			jContentPane.add(getJButtonCancelar(), gridBagConstraints17);
			jContentPane.add(getJTextFieldProvinciaCampo(), gridBagConstraints18);
			jContentPane.add(getJTextFieldProvincia(), gridBagConstraints19);
			jContentPane.add(getJTextFieldCaracteristica(), gridBagConstraints32);
			jContentPane.add(jLabelCodPost, gridBagConstraints11);
			jContentPane.add(getJTextFieldCodPost(), gridBagConstraints22);
			jContentPane.add(jLabelCodPostCampo, gridBagConstraints33);
			jContentPane.add(getJTextFieldCodPostCampo(), gridBagConstraints42);
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
	 * This method initializes jTextFieldLocalidad	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldLocalidad() {
		if (jTextFieldLocalidad == null) {
			jTextFieldLocalidad = new JTextField();
			jTextFieldLocalidad.setPreferredSize(new Dimension(80, 20));
		}
		return jTextFieldLocalidad;
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
			jTextFieldDireccion.setPreferredSize(new Dimension(80, 20));
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
	 * This method initializes jTextFieldLocalidadCampo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldLocalidadCampo() {
		if (jTextFieldLocalidadCampo == null) {
			jTextFieldLocalidadCampo = new JTextField();
			jTextFieldLocalidadCampo.setPreferredSize(new Dimension(80, 20));
		}
		return jTextFieldLocalidadCampo;
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
	 * This method initializes jTextFieldProvinciaCampo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldProvinciaCampo() {
		if (jTextFieldProvinciaCampo == null) {
			jTextFieldProvinciaCampo = new JTextField();
			jTextFieldProvinciaCampo.setPreferredSize(new Dimension(80, 20));
		}
		return jTextFieldProvinciaCampo;
	}

	/**
	 * This method initializes jTextFieldProvincia	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldProvincia() {
		if (jTextFieldProvincia == null) {
			jTextFieldProvincia = new JTextField();
			jTextFieldProvincia.setPreferredSize(new Dimension(80, 20));
		}
		return jTextFieldProvincia;
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
		this.getJComboBoxPais().addItem("Argentina");
		this.getJComboBoxPais().addItem("Paraguay");	
	}	
	
	/**
	 * This method initializes jTextFieldCaracteristica	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldCaracteristica() {
		if (jTextFieldCaracteristica == null) {
			jTextFieldCaracteristica = new JTextField();
			jTextFieldCaracteristica.setPreferredSize(new Dimension(80, 20));
		}
		return jTextFieldCaracteristica;
	}
	
	/**
	 * @since método que pone botones en escucha
	 * @param al
	 */
	public void setListenerButtons (ActionListener al) {
		this.jButtonAceptar.addActionListener(al);
		this.jButtonCancelar.addActionListener(al);	
	}

	/**
	 * This method initializes jTextFieldCodPost	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldCodPost() {
		if (jTextFieldCodPost == null) {
			jTextFieldCodPost = new JTextField();
			jTextFieldCodPost.setPreferredSize(new Dimension(80, 20));
		}
		return jTextFieldCodPost;
	}

	/**
	 * This method initializes jTextFieldCodPostCampo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldCodPostCampo() {
		if (jTextFieldCodPostCampo == null) {
			jTextFieldCodPostCampo = new JTextField();
			jTextFieldCodPostCampo.setPreferredSize(new Dimension(80, 20));
		}
		return jTextFieldCodPostCampo;
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"
