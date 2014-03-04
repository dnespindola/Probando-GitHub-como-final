package CalcularEstructura;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JDialog;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JTabbedPane;
import java.awt.GridBagConstraints;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class InterfazCalcularEstructura extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel panelPrincipal;
	private JPanel panelNorOeste;
	private JLabel jLabelDiametroDTuberia;
	private JLabel jLabelLongTramo;
	private JLabel jLabelCantTramos;
	private JSeparator separator;
	private JComboBox jComboBoxDiamTuberia;
	private JLabel jLabelMedidaMM0;
	private JComboBox jComboBoxLongTramo0;
	private JLabel jLabelLongTramo0;
	private JTextField jTextFieldCantTramos0;
	private JLabel jLabelMedida0168;
	private JLabel jLabelMedidaMM1;
	private JComboBox jComboBoxLongTramo1;
	private JLabel jLabelLongTramo1;
	private JTextField jTextFieldCantTramo1;
	private JLabel jLabelMedida1168;
	private JLabel jLabelMedidaMM2;
	private JComboBox jComboBoxLongTramo2;
	private JLabel jLabelLongTramo2;
	private JTextField jTextFieldCantTramos2;
	private JPanel panelNorEste;
	private JLabel jLabel1Transportable;
	private JCheckBox jCheckBoxTransportable;
	private JLabel jLabelVoladizo;
	private JComboBox jComboBoxVoladizo;
	private JLabel jLabelVoladizoMts;
	private JLabel jLabel1CanonFinal;
	private JTextField jTextFieldCanonFinal;
	private JLabel jLabel1CanonFinalMts;
	private JLabel jLabel1Neumaticos;
	private JComboBox jComboBoxNeumaticos;
	private JLabel jLabel1TTablero;
	private JComboBox jComboBoxTTablero;
	private JLabel jLabel1TMotor;
	private JComboBox jComboBoxTMotor;
	private JLabel jLabel1TReductor;
	private JComboBox jComboBoxTReductor;
	private JPanel panelSurOeste;
	private JLabel jLabel1DistAspersores;
	private JComboBox jComboBoxDistAspersores;
	private JLabel jLabelDistAspMts;
	private JLabel jLabelPresionAspersor;
	private JTextField jTextFieldPresionAspersor;
	private JLabel jLabelPresionAspersorKilo;
	private JSeparator separator_1;
	private JLabel jLabel1ReguladorPresion;
	private JCheckBox jCheckBoxReguladorPresion;
	private JLabel jLabel1ReguladorPresion0;
	private JLabel jLabel1TAspersor;
	private JLabel jLabel1DistPiso;
	private JComboBox jComboBoxReguladorPresion;
	private JLabel jLabelPSI;
	private JComboBox jComboBoxTAspersor;
	private JComboBox jComboBoxDistanciaPiso;
	private JLabel jLabelDistPisoMts;
	private JSeparator separator_2;
	private JLabel jLabel1BoquillasAnuladas;
	private JTextField jTextFieldBoquillasAnuladas;
	private JLabel jLabel1HrIrrigacion;
	private JTextField jTextFieldHrIrrigacion;
	private JLabel jLabel1HrIrrigacionHrs;
	private JLabel jLabel1AnguloIrrigacion;
	private JTextField jTextFieldAnguloIrrigacion;
	private JLabel jLabel1AnguloIrrigacionº;
	private JLabel jLabel1Caudal;
	private JTextField jTextFieldCaudal;
	private JLabel jLabel1CaudalM3Hr;
	private JPanel panelSurEste;
	private JLabel jLabelDatos;
	private JLabel jLabel2PrecipitacionMin;
	private JTextField jTextFieldPrecipitacionMin;
	private JLabel jLabelPrecipitacionMinimaMM;
	private JLabel jLabelLongTotal;
	private JTextField jTextFieldLongTotal;
	private JLabel jLabel;
	private JLabel jLabel1HaRegadas;
	private JTextField jTextFieldHaRegadas;
	private JLabel jLabel1HaRiegoHa;
	private JLabel jLabel1PresionConexion;
	private JTextField jTextFieldPresionConexion;
	private JLabel jLabelPresionConexionKilo;
	private JPanel panelBotones;
	private JButton jButtonCancelar;
	private JButton jButtonAplicar;
	private JButton jButtonDetalletecnico;
	private JButton jButtonReporteBoquilla;
	private JSeparator separator_3;
	private JButton jButtonTerminar;
	/**
	 * This is the default constructor
	 */
	public InterfazCalcularEstructura() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(743, 423);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\trabajos java POO\\riegoscentro\\Imagenes\\gota.png"));
		this.setResizable(false);
		this.setContentPane(getJContentPane());
		this.setTitle("Diseño");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setBackground(Color.white);
			GridBagLayout gbl_jContentPane = new GridBagLayout();
			gbl_jContentPane.rowWeights = new double[]{1.0};
			gbl_jContentPane.columnWeights = new double[]{1.0};
			jContentPane.setLayout(gbl_jContentPane);
			GridBagConstraints gbc_panelPrincipal = new GridBagConstraints();
			gbc_panelPrincipal.fill = GridBagConstraints.BOTH;
			gbc_panelPrincipal.gridx = 0;
			gbc_panelPrincipal.gridy = 0;
			jContentPane.add(getPanelPrincipal(), gbc_panelPrincipal);
		}
		return jContentPane;
	}

	public void setListenerButtons (ActionListener al) {
		this.jButtonCancelar.addActionListener(al);	
		this.jButtonAplicar.addActionListener(al);
		this.jButtonDetalletecnico.addActionListener(al);
		this.jButtonReporteBoquilla.addActionListener(al);
		this.jButtonTerminar.addActionListener(al);
	}
	
	public void setChecked (ItemListener e){
		this.jCheckBoxReguladorPresion.addItemListener(e);
		this.jCheckBoxTransportable.addItemListener(e);
	}	
	
	private JPanel getPanelPrincipal() {
		if (panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBackground(Color.white);
			GridBagLayout gbl_panelPrincipal = new GridBagLayout();
			gbl_panelPrincipal.columnWidths = new int[]{0, 317, 304, 0};
			gbl_panelPrincipal.rowHeights = new int[]{0, 0, 131, 39, 17, 0};
			gbl_panelPrincipal.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_panelPrincipal.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			panelPrincipal.setLayout(gbl_panelPrincipal);
			GridBagConstraints gbc_panelNorOeste = new GridBagConstraints();
			gbc_panelNorOeste.fill = GridBagConstraints.BOTH;
			gbc_panelNorOeste.gridwidth = 2;
			gbc_panelNorOeste.insets = new Insets(5, 5, 5, 5);
			gbc_panelNorOeste.gridx = 0;
			gbc_panelNorOeste.gridy = 0;
			panelPrincipal.add(getPanel_1_1(), gbc_panelNorOeste);
			GridBagConstraints gbc_panelNorEste = new GridBagConstraints();
			gbc_panelNorEste.fill = GridBagConstraints.BOTH;
			gbc_panelNorEste.anchor = GridBagConstraints.NORTH;
			gbc_panelNorEste.gridheight = 2;
			gbc_panelNorEste.insets = new Insets(5, 0, 5, 5);
			gbc_panelNorEste.gridx = 2;
			gbc_panelNorEste.gridy = 0;
			panelPrincipal.add(getPanelNorEste(), gbc_panelNorEste);
			GridBagConstraints gbc_panelSurOeste = new GridBagConstraints();
			gbc_panelSurOeste.fill = GridBagConstraints.BOTH;
			gbc_panelSurOeste.gridheight = 4;
			gbc_panelSurOeste.gridwidth = 2;
			gbc_panelSurOeste.insets = new Insets(0, 5, 5, 5);
			gbc_panelSurOeste.gridx = 0;
			gbc_panelSurOeste.gridy = 1;
			panelPrincipal.add(getPanelSurOeste(), gbc_panelSurOeste);
			GridBagConstraints gbc_panelSurEste = new GridBagConstraints();
			gbc_panelSurEste.fill = GridBagConstraints.BOTH;
			gbc_panelSurEste.insets = new Insets(0, 0, 5, 5);
			gbc_panelSurEste.gridx = 2;
			gbc_panelSurEste.gridy = 2;
			panelPrincipal.add(getPanelSurEste(), gbc_panelSurEste);
			GridBagConstraints gbc_panelBotones = new GridBagConstraints();
			gbc_panelBotones.insets = new Insets(0, 0, 5, 5);
			gbc_panelBotones.gridheight = 2;
			gbc_panelBotones.fill = GridBagConstraints.BOTH;
			gbc_panelBotones.gridx = 2;
			gbc_panelBotones.gridy = 3;
			panelPrincipal.add(getPanelBotones(), gbc_panelBotones);
		}
		return panelPrincipal;
	}
	private JPanel getPanel_1_1() {
		if (panelNorOeste == null) {
			panelNorOeste = new JPanel();
			panelNorOeste.setBorder(new LineBorder(Color.GRAY, 2));
			panelNorOeste.setBackground(Color.white);
			GridBagLayout gbl_panelNorOeste = new GridBagLayout();
			gbl_panelNorOeste.columnWidths = new int[]{74, 40, 69, 42, 119, 0};
			gbl_panelNorOeste.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
			gbl_panelNorOeste.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panelNorOeste.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelNorOeste.setLayout(gbl_panelNorOeste);
			GridBagConstraints gbc_jLabelDiametroDTuberia = new GridBagConstraints();
			gbc_jLabelDiametroDTuberia.gridwidth = 2;
			gbc_jLabelDiametroDTuberia.insets = new Insets(4, 5, 5, 5);
			gbc_jLabelDiametroDTuberia.gridx = 0;
			gbc_jLabelDiametroDTuberia.gridy = 0;
			panelNorOeste.add(getJLabelDiametroDTuberia(), gbc_jLabelDiametroDTuberia);
			GridBagConstraints gbc_jLabelLongTramo = new GridBagConstraints();
			gbc_jLabelLongTramo.gridwidth = 2;
			gbc_jLabelLongTramo.insets = new Insets(4, 5, 5, 5);
			gbc_jLabelLongTramo.gridx = 2;
			gbc_jLabelLongTramo.gridy = 0;
			panelNorOeste.add(getJLabelLongTramo(), gbc_jLabelLongTramo);
			GridBagConstraints gbc_jLabelCantTramos = new GridBagConstraints();
			gbc_jLabelCantTramos.insets = new Insets(4, 5, 5, 5);
			gbc_jLabelCantTramos.gridx = 4;
			gbc_jLabelCantTramos.gridy = 0;
			panelNorOeste.add(getJLabelCantTramos(), gbc_jLabelCantTramos);
			GridBagConstraints gbc_separator = new GridBagConstraints();
			gbc_separator.fill = GridBagConstraints.HORIZONTAL;
			gbc_separator.anchor = GridBagConstraints.NORTH;
			gbc_separator.gridwidth = 5;
			gbc_separator.insets = new Insets(0, 0, 5, 0);
			gbc_separator.gridx = 0;
			gbc_separator.gridy = 1;
			panelNorOeste.add(getSeparator_3(), gbc_separator);
			GridBagConstraints gbc_jComboBoxDiamTuberia = new GridBagConstraints();
			gbc_jComboBoxDiamTuberia.fill = GridBagConstraints.HORIZONTAL;
			gbc_jComboBoxDiamTuberia.insets = new Insets(0, 7, 5, 5);
			gbc_jComboBoxDiamTuberia.gridx = 0;
			gbc_jComboBoxDiamTuberia.gridy = 2;
			panelNorOeste.add(getJComboBoxDiamTuberia(), gbc_jComboBoxDiamTuberia);
			GridBagConstraints gbc_jLabelMedidaMM0 = new GridBagConstraints();
			gbc_jLabelMedidaMM0.anchor = GridBagConstraints.WEST;
			gbc_jLabelMedidaMM0.insets = new Insets(0, 0, 5, 5);
			gbc_jLabelMedidaMM0.gridx = 1;
			gbc_jLabelMedidaMM0.gridy = 2;
			panelNorOeste.add(getJLabelMedidaMM0(), gbc_jLabelMedidaMM0);
			GridBagConstraints gbc_jComboBoxLongTramo0 = new GridBagConstraints();
			gbc_jComboBoxLongTramo0.fill = GridBagConstraints.HORIZONTAL;
			gbc_jComboBoxLongTramo0.insets = new Insets(0, 14, 5, 5);
			gbc_jComboBoxLongTramo0.gridx = 2;
			gbc_jComboBoxLongTramo0.gridy = 2;
			panelNorOeste.add(getJComboBoxLongTramo0(), gbc_jComboBoxLongTramo0);
			GridBagConstraints gbc_jLabelLongTramo0 = new GridBagConstraints();
			gbc_jLabelLongTramo0.anchor = GridBagConstraints.WEST;
			gbc_jLabelLongTramo0.insets = new Insets(0, 0, 5, 5);
			gbc_jLabelLongTramo0.gridx = 3;
			gbc_jLabelLongTramo0.gridy = 2;
			panelNorOeste.add(getJLabelLongTramo0(), gbc_jLabelLongTramo0);
			GridBagConstraints gbc_jTextFieldCantTramos0 = new GridBagConstraints();
			gbc_jTextFieldCantTramos0.fill = GridBagConstraints.BOTH;
			gbc_jTextFieldCantTramos0.insets = new Insets(0, 17, 5, 17);
			gbc_jTextFieldCantTramos0.gridx = 4;
			gbc_jTextFieldCantTramos0.gridy = 2;
			panelNorOeste.add(getJTextFieldCantTramos0(), gbc_jTextFieldCantTramos0);
			GridBagConstraints gbc_jLabelMedida0168 = new GridBagConstraints();
			gbc_jLabelMedida0168.anchor = GridBagConstraints.EAST;
			gbc_jLabelMedida0168.insets = new Insets(0, 0, 5, 5);
			gbc_jLabelMedida0168.gridx = 0;
			gbc_jLabelMedida0168.gridy = 3;
			panelNorOeste.add(getJLabelMedida0168(), gbc_jLabelMedida0168);
			GridBagConstraints gbc_jLabelMedidaMM1 = new GridBagConstraints();
			gbc_jLabelMedidaMM1.anchor = GridBagConstraints.WEST;
			gbc_jLabelMedidaMM1.insets = new Insets(0, 0, 5, 5);
			gbc_jLabelMedidaMM1.gridx = 1;
			gbc_jLabelMedidaMM1.gridy = 3;
			panelNorOeste.add(getJLabelMedidaMM1(), gbc_jLabelMedidaMM1);
			GridBagConstraints gbc_jComboBoxLongTramo1 = new GridBagConstraints();
			gbc_jComboBoxLongTramo1.fill = GridBagConstraints.HORIZONTAL;
			gbc_jComboBoxLongTramo1.insets = new Insets(0, 14, 5, 5);
			gbc_jComboBoxLongTramo1.gridx = 2;
			gbc_jComboBoxLongTramo1.gridy = 3;
			panelNorOeste.add(getJComboBoxLongTramo1(), gbc_jComboBoxLongTramo1);
			GridBagConstraints gbc_jLabelLongTramo1 = new GridBagConstraints();
			gbc_jLabelLongTramo1.anchor = GridBagConstraints.WEST;
			gbc_jLabelLongTramo1.insets = new Insets(0, 0, 5, 5);
			gbc_jLabelLongTramo1.gridx = 3;
			gbc_jLabelLongTramo1.gridy = 3;
			panelNorOeste.add(getJLabelLongTramo1(), gbc_jLabelLongTramo1);
			GridBagConstraints gbc_jTextFieldCantTramo1 = new GridBagConstraints();
			gbc_jTextFieldCantTramo1.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldCantTramo1.insets = new Insets(0, 17, 5, 17);
			gbc_jTextFieldCantTramo1.gridx = 4;
			gbc_jTextFieldCantTramo1.gridy = 3;
			panelNorOeste.add(getJTextFieldCantTramo1(), gbc_jTextFieldCantTramo1);
			GridBagConstraints gbc_jLabelMedida1168 = new GridBagConstraints();
			gbc_jLabelMedida1168.anchor = GridBagConstraints.EAST;
			gbc_jLabelMedida1168.insets = new Insets(0, 0, 0, 5);
			gbc_jLabelMedida1168.gridx = 0;
			gbc_jLabelMedida1168.gridy = 4;
			panelNorOeste.add(getJLabelMedida1168(), gbc_jLabelMedida1168);
			GridBagConstraints gbc_jLabelMedidaMM2 = new GridBagConstraints();
			gbc_jLabelMedidaMM2.anchor = GridBagConstraints.WEST;
			gbc_jLabelMedidaMM2.insets = new Insets(0, 0, 0, 5);
			gbc_jLabelMedidaMM2.gridx = 1;
			gbc_jLabelMedidaMM2.gridy = 4;
			panelNorOeste.add(getJLabelMedidaMM2(), gbc_jLabelMedidaMM2);
			GridBagConstraints gbc_jComboBoxLongTramo2 = new GridBagConstraints();
			gbc_jComboBoxLongTramo2.fill = GridBagConstraints.HORIZONTAL;
			gbc_jComboBoxLongTramo2.insets = new Insets(0, 14, 0, 5);
			gbc_jComboBoxLongTramo2.gridx = 2;
			gbc_jComboBoxLongTramo2.gridy = 4;
			panelNorOeste.add(getJComboBoxLongTramo2(), gbc_jComboBoxLongTramo2);
			GridBagConstraints gbc_jLabelLongTramo2 = new GridBagConstraints();
			gbc_jLabelLongTramo2.anchor = GridBagConstraints.WEST;
			gbc_jLabelLongTramo2.insets = new Insets(0, 0, 0, 5);
			gbc_jLabelLongTramo2.gridx = 3;
			gbc_jLabelLongTramo2.gridy = 4;
			panelNorOeste.add(getJLabelLongTramo2(), gbc_jLabelLongTramo2);
			GridBagConstraints gbc_jTextFieldCantTramos2 = new GridBagConstraints();
			gbc_jTextFieldCantTramos2.insets = new Insets(0, 17, 5, 17);
			gbc_jTextFieldCantTramos2.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldCantTramos2.gridx = 4;
			gbc_jTextFieldCantTramos2.gridy = 4;
			panelNorOeste.add(getJTextFieldCantTramos2(), gbc_jTextFieldCantTramos2);
		}
		return panelNorOeste;
	}
	public JLabel getJLabelDiametroDTuberia() {
		if (jLabelDiametroDTuberia == null) {
			jLabelDiametroDTuberia = new JLabel();
			jLabelDiametroDTuberia.setText("Diametro de tuber\u00EDa");
			jLabelDiametroDTuberia.setForeground(Color.black);
			jLabelDiametroDTuberia.setFont(new Font("Tahoma", Font.BOLD, 11));
		}
		return jLabelDiametroDTuberia;
	}
	public JLabel getJLabelLongTramo() {
		if (jLabelLongTramo == null) {
			jLabelLongTramo = new JLabel();
			jLabelLongTramo.setText("Longitud de tramo");
			jLabelLongTramo.setForeground(Color.black);
			jLabelLongTramo.setFont(new Font("Tahoma", Font.BOLD, 11));
		}
		return jLabelLongTramo;
	}
	public JLabel getJLabelCantTramos() {
		if (jLabelCantTramos == null) {
			jLabelCantTramos = new JLabel();
			jLabelCantTramos.setText("Cantidad de tramos");
			jLabelCantTramos.setForeground(Color.black);
			jLabelCantTramos.setFont(new Font("Tahoma", Font.BOLD, 11));
		}
		return jLabelCantTramos;
	}
	private JSeparator getSeparator_3() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(Color.GRAY);
			separator.setBackground(Color.GRAY);
		}
		return separator;
	}
	public JComboBox getJComboBoxDiamTuberia() {
		if (jComboBoxDiamTuberia == null) {
			jComboBoxDiamTuberia = new JComboBox();
			jComboBoxDiamTuberia.setPreferredSize(new Dimension(71, 20));
			jComboBoxDiamTuberia.setBackground(Color.white);
			jComboBoxDiamTuberia.setFont(new Font("Tahoma", Font.PLAIN, 11));
			this.cargarJComboDiamTuberia();
		}
		return jComboBoxDiamTuberia;
	}
	private JLabel getJLabelMedidaMM0() {
		if (jLabelMedidaMM0 == null) {
			jLabelMedidaMM0 = new JLabel();
			jLabelMedidaMM0.setText("mm");
			jLabelMedidaMM0.setForeground(Color.black);
		}
		return jLabelMedidaMM0;
	}
	public JComboBox getJComboBoxLongTramo0() {
		if (jComboBoxLongTramo0 == null) {
			jComboBoxLongTramo0 = new JComboBox();
			jComboBoxLongTramo0.setPreferredSize(new Dimension(75, 20));
			jComboBoxLongTramo0.setBackground(Color.white);
			this.cargarJComboLongTramo0();
		}
		return jComboBoxLongTramo0;
	}
	private JLabel getJLabelLongTramo0() {
		if (jLabelLongTramo0 == null) {
			jLabelLongTramo0 = new JLabel();
			jLabelLongTramo0.setText("mts");
			jLabelLongTramo0.setForeground(Color.black);
		}
		return jLabelLongTramo0;
	}
	public JTextField getJTextFieldCantTramos0() {
		if (jTextFieldCantTramos0 == null) {
			jTextFieldCantTramos0 = new JTextField();
			jTextFieldCantTramos0.setPreferredSize(new Dimension(40, 20));
			jTextFieldCantTramos0.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return jTextFieldCantTramos0;
	}
	private JLabel getJLabelMedida0168() {
		if (jLabelMedida0168 == null) {
			jLabelMedida0168 = new JLabel();
			jLabelMedida0168.setText("168");
			jLabelMedida0168.setForeground(Color.black);
		}
		return jLabelMedida0168;
	}
	private JLabel getJLabelMedidaMM1() {
		if (jLabelMedidaMM1 == null) {
			jLabelMedidaMM1 = new JLabel();
			jLabelMedidaMM1.setText("mm");
			jLabelMedidaMM1.setForeground(Color.black);
		}
		return jLabelMedidaMM1;
	}
	public JComboBox getJComboBoxLongTramo1() {
		if (jComboBoxLongTramo1 == null) {
			jComboBoxLongTramo1 = new JComboBox();
			jComboBoxLongTramo1.setPreferredSize(new Dimension(75, 20));
			jComboBoxLongTramo1.setBackground(Color.white);
			this.cargarJComboLongTramo1();
		}
		return jComboBoxLongTramo1;
	}
	private JLabel getJLabelLongTramo1() {
		if (jLabelLongTramo1 == null) {
			jLabelLongTramo1 = new JLabel();
			jLabelLongTramo1.setText("mts");
			jLabelLongTramo1.setForeground(Color.black);
		}
		return jLabelLongTramo1;
	}
	public JTextField getJTextFieldCantTramo1() {
		if (jTextFieldCantTramo1 == null) {
			jTextFieldCantTramo1 = new JTextField();
			jTextFieldCantTramo1.setHorizontalAlignment(SwingConstants.CENTER);
			jTextFieldCantTramo1.setPreferredSize(new Dimension(40, 20));
		}
		return jTextFieldCantTramo1;
	}
	private JLabel getJLabelMedida1168() {
		if (jLabelMedida1168 == null) {
			jLabelMedida1168 = new JLabel();
			jLabelMedida1168.setText("168");
			jLabelMedida1168.setForeground(Color.black);
		}
		return jLabelMedida1168;
	}
	private JLabel getJLabelMedidaMM2() {
		if (jLabelMedidaMM2 == null) {
			jLabelMedidaMM2 = new JLabel();
			jLabelMedidaMM2.setText("mm");
			jLabelMedidaMM2.setForeground(Color.black);
		}
		return jLabelMedidaMM2;
	}
	public JComboBox getJComboBoxLongTramo2() {
		if (jComboBoxLongTramo2 == null) {
			jComboBoxLongTramo2 = new JComboBox();
			jComboBoxLongTramo2.setPreferredSize(new Dimension(75, 20));
			jComboBoxLongTramo2.setBackground(Color.white);
			this.cargarJComboLongTramo2();
		}
		return jComboBoxLongTramo2;
	}
	private JLabel getJLabelLongTramo2() {
		if (jLabelLongTramo2 == null) {
			jLabelLongTramo2 = new JLabel();
			jLabelLongTramo2.setText("mts");
			jLabelLongTramo2.setForeground(Color.black);
		}
		return jLabelLongTramo2;
	}
	public JTextField getJTextFieldCantTramos2(){
		if (jTextFieldCantTramos2 == null) {
			jTextFieldCantTramos2 = new JTextField();
			jTextFieldCantTramos2.setHorizontalAlignment(SwingConstants.CENTER);
			jTextFieldCantTramos2.setPreferredSize(new Dimension(40, 20));
		}
		return jTextFieldCantTramos2;
	}
	private JPanel getPanelNorEste() {
		if (panelNorEste == null) {
			panelNorEste = new JPanel();
			panelNorEste.setBorder(new LineBorder(new Color(128, 128, 128), 2));
			panelNorEste.setBackground(Color.white);
			GridBagLayout gbl_panelNorEste = new GridBagLayout();
			gbl_panelNorEste.columnWidths = new int[]{139, 53, 130, 0};
			gbl_panelNorEste.rowHeights = new int[]{21, 0, 0, 0, 0, 0, 0, 0};
			gbl_panelNorEste.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panelNorEste.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelNorEste.setLayout(gbl_panelNorEste);
			GridBagConstraints gbc_jLabel1Transportable = new GridBagConstraints();
			gbc_jLabel1Transportable.anchor = GridBagConstraints.EAST;
			gbc_jLabel1Transportable.insets = new Insets(4, 0, 5, 5);
			gbc_jLabel1Transportable.gridx = 0;
			gbc_jLabel1Transportable.gridy = 0;
			panelNorEste.add(getJLabel1Transportable(), gbc_jLabel1Transportable);
			GridBagConstraints gbc_jCheckBoxTransportable = new GridBagConstraints();
			gbc_jCheckBoxTransportable.anchor = GridBagConstraints.SOUTHWEST;
			gbc_jCheckBoxTransportable.insets = new Insets(5, 0, 5, 5);
			gbc_jCheckBoxTransportable.gridx = 1;
			gbc_jCheckBoxTransportable.gridy = 0;
			panelNorEste.add(getJCheckBoxTransportable(), gbc_jCheckBoxTransportable);
			GridBagConstraints gbc_jLabelVoladizo = new GridBagConstraints();
			gbc_jLabelVoladizo.anchor = GridBagConstraints.EAST;
			gbc_jLabelVoladizo.insets = new Insets(0, 0, 5, 5);
			gbc_jLabelVoladizo.gridx = 0;
			gbc_jLabelVoladizo.gridy = 1;
			panelNorEste.add(getJLabelVoladizo(), gbc_jLabelVoladizo);
			GridBagConstraints gbc_jComboBoxVoladizo = new GridBagConstraints();
			gbc_jComboBoxVoladizo.fill = GridBagConstraints.HORIZONTAL;
			gbc_jComboBoxVoladizo.insets = new Insets(0, 0, 5, 5);
			gbc_jComboBoxVoladizo.gridx = 1;
			gbc_jComboBoxVoladizo.gridy = 1;
			panelNorEste.add(getJComboBoxVoladizo(), gbc_jComboBoxVoladizo);
			GridBagConstraints gbc_jLabelVoladizoMts = new GridBagConstraints();
			gbc_jLabelVoladizoMts.anchor = GridBagConstraints.WEST;
			gbc_jLabelVoladizoMts.insets = new Insets(0, 0, 5, 0);
			gbc_jLabelVoladizoMts.gridx = 2;
			gbc_jLabelVoladizoMts.gridy = 1;
			panelNorEste.add(getJLabelVoladizoMts(), gbc_jLabelVoladizoMts);
			GridBagConstraints gbc_jLabel1CanonFinal = new GridBagConstraints();
			gbc_jLabel1CanonFinal.anchor = GridBagConstraints.EAST;
			gbc_jLabel1CanonFinal.insets = new Insets(0, 0, 5, 5);
			gbc_jLabel1CanonFinal.gridx = 0;
			gbc_jLabel1CanonFinal.gridy = 2;
			panelNorEste.add(getJLabel1CanonFinal(), gbc_jLabel1CanonFinal);
			GridBagConstraints gbc_jTextFieldCanonFinal = new GridBagConstraints();
			gbc_jTextFieldCanonFinal.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldCanonFinal.insets = new Insets(0, 0, 5, 5);
			gbc_jTextFieldCanonFinal.gridx = 1;
			gbc_jTextFieldCanonFinal.gridy = 2;
			panelNorEste.add(getJTextFieldCanonFinal(), gbc_jTextFieldCanonFinal);
			GridBagConstraints gbc_jLabel1CanonFinalMts = new GridBagConstraints();
			gbc_jLabel1CanonFinalMts.anchor = GridBagConstraints.WEST;
			gbc_jLabel1CanonFinalMts.insets = new Insets(0, 0, 5, 0);
			gbc_jLabel1CanonFinalMts.gridx = 2;
			gbc_jLabel1CanonFinalMts.gridy = 2;
			panelNorEste.add(getJLabel1CanonFinalMts(), gbc_jLabel1CanonFinalMts);
			GridBagConstraints gbc_jLabel1Neumaticos = new GridBagConstraints();
			gbc_jLabel1Neumaticos.anchor = GridBagConstraints.EAST;
			gbc_jLabel1Neumaticos.insets = new Insets(0, 0, 5, 5);
			gbc_jLabel1Neumaticos.gridx = 0;
			gbc_jLabel1Neumaticos.gridy = 3;
			panelNorEste.add(getJLabel1Neumaticos(), gbc_jLabel1Neumaticos);
			GridBagConstraints gbc_jComboBoxNeumaticos = new GridBagConstraints();
			gbc_jComboBoxNeumaticos.fill = GridBagConstraints.HORIZONTAL;
			gbc_jComboBoxNeumaticos.gridwidth = 2;
			gbc_jComboBoxNeumaticos.insets = new Insets(0, 0, 5, 5);
			gbc_jComboBoxNeumaticos.gridx = 1;
			gbc_jComboBoxNeumaticos.gridy = 3;
			panelNorEste.add(getJComboBoxNeumaticos(), gbc_jComboBoxNeumaticos);
			GridBagConstraints gbc_jLabel1TTablero = new GridBagConstraints();
			gbc_jLabel1TTablero.anchor = GridBagConstraints.EAST;
			gbc_jLabel1TTablero.insets = new Insets(0, 0, 5, 5);
			gbc_jLabel1TTablero.gridx = 0;
			gbc_jLabel1TTablero.gridy = 4;
			panelNorEste.add(getJLabel1TTablero(), gbc_jLabel1TTablero);
			GridBagConstraints gbc_jComboBoxTTablero = new GridBagConstraints();
			gbc_jComboBoxTTablero.fill = GridBagConstraints.HORIZONTAL;
			gbc_jComboBoxTTablero.gridwidth = 2;
			gbc_jComboBoxTTablero.insets = new Insets(0, 0, 5, 5);
			gbc_jComboBoxTTablero.gridx = 1;
			gbc_jComboBoxTTablero.gridy = 4;
			panelNorEste.add(getJComboBoxTTablero(), gbc_jComboBoxTTablero);
			GridBagConstraints gbc_jLabel1TMotor = new GridBagConstraints();
			gbc_jLabel1TMotor.anchor = GridBagConstraints.EAST;
			gbc_jLabel1TMotor.insets = new Insets(0, 0, 5, 5);
			gbc_jLabel1TMotor.gridx = 0;
			gbc_jLabel1TMotor.gridy = 5;
			panelNorEste.add(getJLabel1TMotor(), gbc_jLabel1TMotor);
			GridBagConstraints gbc_jComboBoxTMotor = new GridBagConstraints();
			gbc_jComboBoxTMotor.fill = GridBagConstraints.HORIZONTAL;
			gbc_jComboBoxTMotor.gridwidth = 2;
			gbc_jComboBoxTMotor.insets = new Insets(0, 0, 5, 5);
			gbc_jComboBoxTMotor.gridx = 1;
			gbc_jComboBoxTMotor.gridy = 5;
			panelNorEste.add(getJComboBoxTMotor(), gbc_jComboBoxTMotor);
			GridBagConstraints gbc_jLabel1TReductor = new GridBagConstraints();
			gbc_jLabel1TReductor.anchor = GridBagConstraints.EAST;
			gbc_jLabel1TReductor.insets = new Insets(0, 0, 8, 5);
			gbc_jLabel1TReductor.gridx = 0;
			gbc_jLabel1TReductor.gridy = 6;
			panelNorEste.add(getJLabel1TReductor(), gbc_jLabel1TReductor);
			GridBagConstraints gbc_jComboBoxTReductor = new GridBagConstraints();
			gbc_jComboBoxTReductor.insets = new Insets(0, 0, 8, 5);
			gbc_jComboBoxTReductor.fill = GridBagConstraints.HORIZONTAL;
			gbc_jComboBoxTReductor.gridwidth = 2;
			gbc_jComboBoxTReductor.gridx = 1;
			gbc_jComboBoxTReductor.gridy = 6;
			panelNorEste.add(getJComboBoxTReductor(), gbc_jComboBoxTReductor);
		}
		return panelNorEste;
	}
	private JLabel getJLabel1Transportable() {
		if (jLabel1Transportable == null) {
			jLabel1Transportable = new JLabel();
			jLabel1Transportable.setText("Transportable");
			jLabel1Transportable.setForeground(Color.black);
		}
		return jLabel1Transportable;
	}
	public JCheckBox getJCheckBoxTransportable() {
		if (jCheckBoxTransportable == null) {
			jCheckBoxTransportable = new JCheckBox();
			jCheckBoxTransportable.setBackground(Color.white);
		}
		return jCheckBoxTransportable;
	}
	public JLabel getJLabelVoladizo() {
		if (jLabelVoladizo == null) {
			jLabelVoladizo = new JLabel();
			jLabelVoladizo.setText("Voladizo:");
			jLabelVoladizo.setForeground(Color.black);
		}
		return jLabelVoladizo;
	}
	public JComboBox getJComboBoxVoladizo() {
		if (jComboBoxVoladizo == null) {
			jComboBoxVoladizo = new JComboBox();
			jComboBoxVoladizo.setPreferredSize(new Dimension(75, 20));
			jComboBoxVoladizo.setBackground(Color.white);
			this.cargarJComboVoladizo();
		}
		return jComboBoxVoladizo;
	}
	private JLabel getJLabelVoladizoMts() {
		if (jLabelVoladizoMts == null) {
			jLabelVoladizoMts = new JLabel();
			jLabelVoladizoMts.setText("mts");
			jLabelVoladizoMts.setForeground(Color.black);
		}
		return jLabelVoladizoMts;
	}
	public JLabel getJLabel1CanonFinal() {
		if (jLabel1CanonFinal == null) {
			jLabel1CanonFinal = new JLabel();
			jLabel1CanonFinal.setText("Ca\u00F1\u00F3n final:");
			jLabel1CanonFinal.setForeground(Color.black);
		}
		return jLabel1CanonFinal;
	}
	public JTextField getJTextFieldCanonFinal() {
		if (jTextFieldCanonFinal == null) {
			jTextFieldCanonFinal = new JTextField();
			jTextFieldCanonFinal.setHorizontalAlignment(SwingConstants.CENTER);
			jTextFieldCanonFinal.setPreferredSize(new Dimension(40, 20));
		}
		return jTextFieldCanonFinal;
	}
	public JLabel getJLabel1CanonFinalMts() {
		if (jLabel1CanonFinalMts == null) {
			jLabel1CanonFinalMts = new JLabel();
			jLabel1CanonFinalMts.setText("mts");
			jLabel1CanonFinalMts.setForeground(Color.black);
		}
		return jLabel1CanonFinalMts;
	}
	public JLabel getJLabel1Neumaticos() {
		if (jLabel1Neumaticos == null) {
			jLabel1Neumaticos = new JLabel();
			jLabel1Neumaticos.setText("Neum\u00E1ticos:");
			jLabel1Neumaticos.setForeground(Color.black);
		}
		return jLabel1Neumaticos;
	}
	public JComboBox getJComboBoxNeumaticos() {
		if (jComboBoxNeumaticos == null) {
			jComboBoxNeumaticos = new JComboBox();
			jComboBoxNeumaticos.setPreferredSize(new Dimension(100, 20));
			jComboBoxNeumaticos.setBackground(Color.white);
			this.cargarJComboNeumatico();
		}
		return jComboBoxNeumaticos;
	}
	public JLabel getJLabel1TTablero() {
		if (jLabel1TTablero == null) {
			jLabel1TTablero = new JLabel();
			jLabel1TTablero.setText("Tipo de tablero:");
			jLabel1TTablero.setForeground(Color.black);
		}
		return jLabel1TTablero;
	}
	public JComboBox getJComboBoxTTablero() {
		if (jComboBoxTTablero == null) {
			jComboBoxTTablero = new JComboBox();
			jComboBoxTTablero.setPreferredSize(new Dimension(100, 20));
			jComboBoxTTablero.setBackground(Color.white);
			this.cargarJComboTipoTablero();
		}
		return jComboBoxTTablero;
	}
	public JLabel getJLabel1TMotor() {
		if (jLabel1TMotor == null) {
			jLabel1TMotor = new JLabel();
			jLabel1TMotor.setText("Tipo de motor:");
			jLabel1TMotor.setForeground(Color.black);
		}
		return jLabel1TMotor;
	}
	public JComboBox getJComboBoxTMotor() {
		if (jComboBoxTMotor == null) {
			jComboBoxTMotor = new JComboBox();
			jComboBoxTMotor.setPreferredSize(new Dimension(31, 20));
			jComboBoxTMotor.setBackground(Color.white);
			this.cargarJComboTipoMotor();
		}
		return jComboBoxTMotor;
	}
	public JLabel getJLabel1TReductor() {
		if (jLabel1TReductor == null) {
			jLabel1TReductor = new JLabel();
			jLabel1TReductor.setText("Tipo Reductor:");
			jLabel1TReductor.setForeground(Color.black);
		}
		return jLabel1TReductor;
	}
	public JComboBox getJComboBoxTReductor() {
		if (jComboBoxTReductor == null) {
			jComboBoxTReductor = new JComboBox();
			jComboBoxTReductor.setPreferredSize(new Dimension(31, 20));
			jComboBoxTReductor.setBackground(Color.white);
			this.cargarJComboTipoReductor();
		}
		return jComboBoxTReductor;
	}
	private JPanel getPanelSurOeste() {
		if (panelSurOeste == null) {
			panelSurOeste = new JPanel();
			panelSurOeste.setBorder(new LineBorder(Color.GRAY, 2));
			panelSurOeste.setForeground(Color.black);
			panelSurOeste.setBackground(Color.white);
			GridBagLayout gbl_panelSurOeste = new GridBagLayout();
			gbl_panelSurOeste.columnWidths = new int[]{120, 0, 0, 91, 26, 0};
			gbl_panelSurOeste.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panelSurOeste.columnWeights = new double[]{1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_panelSurOeste.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelSurOeste.setLayout(gbl_panelSurOeste);
			GridBagConstraints gbc_jLabel1DistAspersores = new GridBagConstraints();
			gbc_jLabel1DistAspersores.anchor = GridBagConstraints.EAST;
			gbc_jLabel1DistAspersores.gridwidth = 2;
			gbc_jLabel1DistAspersores.insets = new Insets(0, 0, 5, 5);
			gbc_jLabel1DistAspersores.gridx = 0;
			gbc_jLabel1DistAspersores.gridy = 0;
			panelSurOeste.add(getJLabel1DistAspersores(), gbc_jLabel1DistAspersores);
			GridBagConstraints gbc_jComboBoxDistAspersores = new GridBagConstraints();
			gbc_jComboBoxDistAspersores.fill = GridBagConstraints.HORIZONTAL;
			gbc_jComboBoxDistAspersores.insets = new Insets(6, 0, 5, 5);
			gbc_jComboBoxDistAspersores.gridx = 2;
			gbc_jComboBoxDistAspersores.gridy = 0;
			panelSurOeste.add(getJComboBoxDistAspersores(), gbc_jComboBoxDistAspersores);
			GridBagConstraints gbc_jLabelDistAspMts = new GridBagConstraints();
			gbc_jLabelDistAspMts.anchor = GridBagConstraints.WEST;
			gbc_jLabelDistAspMts.insets = new Insets(0, 0, 5, 5);
			gbc_jLabelDistAspMts.gridx = 3;
			gbc_jLabelDistAspMts.gridy = 0;
			panelSurOeste.add(getJLabelDistAspMts(), gbc_jLabelDistAspMts);
			GridBagConstraints gbc_jLabelPresionAspersor = new GridBagConstraints();
			gbc_jLabelPresionAspersor.anchor = GridBagConstraints.EAST;
			gbc_jLabelPresionAspersor.gridwidth = 2;
			gbc_jLabelPresionAspersor.insets = new Insets(0, 0, 5, 5);
			gbc_jLabelPresionAspersor.gridx = 0;
			gbc_jLabelPresionAspersor.gridy = 1;
			panelSurOeste.add(getJLabelPresionAspersor(), gbc_jLabelPresionAspersor);
			GridBagConstraints gbc_jTextFieldPresionAspersor = new GridBagConstraints();
			gbc_jTextFieldPresionAspersor.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldPresionAspersor.insets = new Insets(0, 0, 5, 5);
			gbc_jTextFieldPresionAspersor.gridx = 2;
			gbc_jTextFieldPresionAspersor.gridy = 1;
			panelSurOeste.add(getJTextFieldPresionAspersor(), gbc_jTextFieldPresionAspersor);
			GridBagConstraints gbc_jLabelPresionAspersorKilo = new GridBagConstraints();
			gbc_jLabelPresionAspersorKilo.anchor = GridBagConstraints.WEST;
			gbc_jLabelPresionAspersorKilo.insets = new Insets(0, 0, 5, 5);
			gbc_jLabelPresionAspersorKilo.gridx = 3;
			gbc_jLabelPresionAspersorKilo.gridy = 1;
			panelSurOeste.add(getJLabelPresionAspersorKilo(), gbc_jLabelPresionAspersorKilo);
			GridBagConstraints gbc_separator_1 = new GridBagConstraints();
			gbc_separator_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_separator_1.anchor = GridBagConstraints.NORTH;
			gbc_separator_1.gridwidth = 5;
			gbc_separator_1.insets = new Insets(0, 0, 5, 0);
			gbc_separator_1.gridx = 0;
			gbc_separator_1.gridy = 2;
			panelSurOeste.add(getSeparator_1_1(), gbc_separator_1);
			GridBagConstraints gbc_jLabel1ReguladorPresion = new GridBagConstraints();
			gbc_jLabel1ReguladorPresion.anchor = GridBagConstraints.EAST;
			gbc_jLabel1ReguladorPresion.gridwidth = 2;
			gbc_jLabel1ReguladorPresion.insets = new Insets(0, 0, 5, 5);
			gbc_jLabel1ReguladorPresion.gridx = 0;
			gbc_jLabel1ReguladorPresion.gridy = 3;
			panelSurOeste.add(getJLabel1ReguladorPresion(), gbc_jLabel1ReguladorPresion);
			GridBagConstraints gbc_jCheckBoxReguladorPresion = new GridBagConstraints();
			gbc_jCheckBoxReguladorPresion.anchor = GridBagConstraints.WEST;
			gbc_jCheckBoxReguladorPresion.insets = new Insets(0, 0, 5, 5);
			gbc_jCheckBoxReguladorPresion.gridx = 2;
			gbc_jCheckBoxReguladorPresion.gridy = 3;
			panelSurOeste.add(getJCheckBoxReguladorPresion(), gbc_jCheckBoxReguladorPresion);
			GridBagConstraints gbc_jLabel1ReguladorPresion0 = new GridBagConstraints();
			gbc_jLabel1ReguladorPresion0.gridwidth = 2;
			gbc_jLabel1ReguladorPresion0.insets = new Insets(0, 5, 5, 0);
			gbc_jLabel1ReguladorPresion0.gridx = 0;
			gbc_jLabel1ReguladorPresion0.gridy = 4;
			panelSurOeste.add(getJLabel1ReguladorPresion0(), gbc_jLabel1ReguladorPresion0);
			GridBagConstraints gbc_jLabel1TAspersor = new GridBagConstraints();
			gbc_jLabel1TAspersor.insets = new Insets(0, 0, 5, 5);
			gbc_jLabel1TAspersor.gridx = 2;
			gbc_jLabel1TAspersor.gridy = 4;
			panelSurOeste.add(getJLabel1TAspersor(), gbc_jLabel1TAspersor);
			GridBagConstraints gbc_jLabel1DistPiso = new GridBagConstraints();
			gbc_jLabel1DistPiso.gridwidth = 2;
			gbc_jLabel1DistPiso.insets = new Insets(0, 0, 5, 0);
			gbc_jLabel1DistPiso.gridx = 3;
			gbc_jLabel1DistPiso.gridy = 4;
			panelSurOeste.add(getJLabel1DistPiso(), gbc_jLabel1DistPiso);
			GridBagConstraints gbc_jComboBoxReguladorPresion = new GridBagConstraints();
			gbc_jComboBoxReguladorPresion.anchor = GridBagConstraints.EAST;
			gbc_jComboBoxReguladorPresion.insets = new Insets(0, 6, 5, 5);
			gbc_jComboBoxReguladorPresion.gridx = 0;
			gbc_jComboBoxReguladorPresion.gridy = 5;
			panelSurOeste.add(getJComboBoxReguladorPresion(), gbc_jComboBoxReguladorPresion);
			GridBagConstraints gbc_jLabelPSI = new GridBagConstraints();
			gbc_jLabelPSI.anchor = GridBagConstraints.WEST;
			gbc_jLabelPSI.insets = new Insets(0, 0, 5, 20);
			gbc_jLabelPSI.gridx = 1;
			gbc_jLabelPSI.gridy = 5;
			panelSurOeste.add(getJLabelPSI(), gbc_jLabelPSI);
			GridBagConstraints gbc_jComboBoxTAspersor = new GridBagConstraints();
			gbc_jComboBoxTAspersor.insets = new Insets(0, 0, 5, 5);
			gbc_jComboBoxTAspersor.gridx = 2;
			gbc_jComboBoxTAspersor.gridy = 5;
			panelSurOeste.add(getJComboBoxTAspersor(), gbc_jComboBoxTAspersor);
			GridBagConstraints gbc_jComboBoxDistanciaPiso = new GridBagConstraints();
			gbc_jComboBoxDistanciaPiso.anchor = GridBagConstraints.EAST;
			gbc_jComboBoxDistanciaPiso.insets = new Insets(0, 0, 5, 5);
			gbc_jComboBoxDistanciaPiso.gridx = 3;
			gbc_jComboBoxDistanciaPiso.gridy = 5;
			panelSurOeste.add(getJComboBoxDistanciaPiso(), gbc_jComboBoxDistanciaPiso);
			GridBagConstraints gbc_jLabelDistPisoMts = new GridBagConstraints();
			gbc_jLabelDistPisoMts.insets = new Insets(0, 0, 5, 0);
			gbc_jLabelDistPisoMts.gridx = 4;
			gbc_jLabelDistPisoMts.gridy = 5;
			panelSurOeste.add(getJLabelDistPisoMts(), gbc_jLabelDistPisoMts);
			GridBagConstraints gbc_separator_2 = new GridBagConstraints();
			gbc_separator_2.fill = GridBagConstraints.HORIZONTAL;
			gbc_separator_2.anchor = GridBagConstraints.NORTH;
			gbc_separator_2.gridwidth = 5;
			gbc_separator_2.insets = new Insets(0, 0, 5, 0);
			gbc_separator_2.gridx = 0;
			gbc_separator_2.gridy = 6;
			panelSurOeste.add(getSeparator_2_1(), gbc_separator_2);
			GridBagConstraints gbc_jLabel1BoquillasAnuladas = new GridBagConstraints();
			gbc_jLabel1BoquillasAnuladas.gridwidth = 2;
			gbc_jLabel1BoquillasAnuladas.anchor = GridBagConstraints.EAST;
			gbc_jLabel1BoquillasAnuladas.insets = new Insets(0, 0, 5, 5);
			gbc_jLabel1BoquillasAnuladas.gridx = 0;
			gbc_jLabel1BoquillasAnuladas.gridy = 7;
			panelSurOeste.add(getJLabel1BoquillasAnuladas(), gbc_jLabel1BoquillasAnuladas);
			GridBagConstraints gbc_jTextFieldBoquillasAnuladas = new GridBagConstraints();
			gbc_jTextFieldBoquillasAnuladas.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldBoquillasAnuladas.insets = new Insets(0, 0, 5, 5);
			gbc_jTextFieldBoquillasAnuladas.gridx = 2;
			gbc_jTextFieldBoquillasAnuladas.gridy = 7;
			panelSurOeste.add(getJTextFieldBoquillasAnuladas(), gbc_jTextFieldBoquillasAnuladas);
			GridBagConstraints gbc_jLabel1HrIrrigacion = new GridBagConstraints();
			gbc_jLabel1HrIrrigacion.gridwidth = 2;
			gbc_jLabel1HrIrrigacion.anchor = GridBagConstraints.EAST;
			gbc_jLabel1HrIrrigacion.insets = new Insets(0, 0, 5, 5);
			gbc_jLabel1HrIrrigacion.gridx = 0;
			gbc_jLabel1HrIrrigacion.gridy = 8;
			panelSurOeste.add(getJLabel1HrIrrigacion(), gbc_jLabel1HrIrrigacion);
			GridBagConstraints gbc_jTextFieldHrIrrigacion = new GridBagConstraints();
			gbc_jTextFieldHrIrrigacion.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldHrIrrigacion.insets = new Insets(0, 0, 5, 5);
			gbc_jTextFieldHrIrrigacion.gridx = 2;
			gbc_jTextFieldHrIrrigacion.gridy = 8;
			panelSurOeste.add(getJTextFieldHrIrrigacion(), gbc_jTextFieldHrIrrigacion);
			GridBagConstraints gbc_jLabel1HrIrrigacionHrs = new GridBagConstraints();
			gbc_jLabel1HrIrrigacionHrs.anchor = GridBagConstraints.WEST;
			gbc_jLabel1HrIrrigacionHrs.insets = new Insets(0, 0, 5, 5);
			gbc_jLabel1HrIrrigacionHrs.gridx = 3;
			gbc_jLabel1HrIrrigacionHrs.gridy = 8;
			panelSurOeste.add(getJLabel1HrIrrigacionHrs(), gbc_jLabel1HrIrrigacionHrs);
			GridBagConstraints gbc_jLabel1AnguloIrrigacion = new GridBagConstraints();
			gbc_jLabel1AnguloIrrigacion.gridwidth = 2;
			gbc_jLabel1AnguloIrrigacion.anchor = GridBagConstraints.EAST;
			gbc_jLabel1AnguloIrrigacion.insets = new Insets(0, 0, 5, 5);
			gbc_jLabel1AnguloIrrigacion.gridx = 0;
			gbc_jLabel1AnguloIrrigacion.gridy = 9;
			panelSurOeste.add(getJLabel1AnguloIrrigacion(), gbc_jLabel1AnguloIrrigacion);
			GridBagConstraints gbc_jTextFieldAnguloIrrigacion = new GridBagConstraints();
			gbc_jTextFieldAnguloIrrigacion.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldAnguloIrrigacion.insets = new Insets(0, 0, 5, 5);
			gbc_jTextFieldAnguloIrrigacion.gridx = 2;
			gbc_jTextFieldAnguloIrrigacion.gridy = 9;
			panelSurOeste.add(getJTextFieldAnguloIrrigacion(), gbc_jTextFieldAnguloIrrigacion);
			GridBagConstraints gbc_jLabel1AnguloIrrigacionº = new GridBagConstraints();
			gbc_jLabel1AnguloIrrigacionº.anchor = GridBagConstraints.WEST;
			gbc_jLabel1AnguloIrrigacionº.insets = new Insets(0, 0, 5, 5);
			gbc_jLabel1AnguloIrrigacionº.gridx = 3;
			gbc_jLabel1AnguloIrrigacionº.gridy = 9;
			panelSurOeste.add(getJLabel1AnguloIrrigacionº(), gbc_jLabel1AnguloIrrigacionº);
			GridBagConstraints gbc_jLabel1Caudal = new GridBagConstraints();
			gbc_jLabel1Caudal.gridwidth = 2;
			gbc_jLabel1Caudal.anchor = GridBagConstraints.EAST;
			gbc_jLabel1Caudal.insets = new Insets(0, 0, 0, 5);
			gbc_jLabel1Caudal.gridx = 0;
			gbc_jLabel1Caudal.gridy = 10;
			panelSurOeste.add(getJLabel1Caudal(), gbc_jLabel1Caudal);
			GridBagConstraints gbc_jTextFieldCaudal = new GridBagConstraints();
			gbc_jTextFieldCaudal.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldCaudal.insets = new Insets(0, 0, 0, 5);
			gbc_jTextFieldCaudal.gridx = 2;
			gbc_jTextFieldCaudal.gridy = 10;
			panelSurOeste.add(getJTextFieldCaudal(), gbc_jTextFieldCaudal);
			GridBagConstraints gbc_jLabel1CaudalM3Hr = new GridBagConstraints();
			gbc_jLabel1CaudalM3Hr.anchor = GridBagConstraints.WEST;
			gbc_jLabel1CaudalM3Hr.insets = new Insets(0, 0, 0, 5);
			gbc_jLabel1CaudalM3Hr.gridx = 3;
			gbc_jLabel1CaudalM3Hr.gridy = 10;
			panelSurOeste.add(getJLabel1CaudalM3Hr(), gbc_jLabel1CaudalM3Hr);
		}
		return panelSurOeste;
	}
	public JLabel getJLabel1DistAspersores() {
		if (jLabel1DistAspersores == null) {
			jLabel1DistAspersores = new JLabel();
			jLabel1DistAspersores.setText("Distancia entre aspersores:");
			jLabel1DistAspersores.setForeground(Color.black);
		}
		return jLabel1DistAspersores;
	}
	public JComboBox getJComboBoxDistAspersores() {
		if (jComboBoxDistAspersores == null) {
			jComboBoxDistAspersores = new JComboBox();
			jComboBoxDistAspersores.setPreferredSize(new Dimension(60, 20));
			jComboBoxDistAspersores.setBackground(Color.white);
			this.cargarJComboDistanciaEntreAspersores();
		}
		return jComboBoxDistAspersores;
	}
	private JLabel getJLabelDistAspMts() {
		if (jLabelDistAspMts == null) {
			jLabelDistAspMts = new JLabel();
			jLabelDistAspMts.setText("mts");
			jLabelDistAspMts.setForeground(Color.black);
		}
		return jLabelDistAspMts;
	}
	public JLabel getJLabelPresionAspersor() {
		if (jLabelPresionAspersor == null) {
			jLabelPresionAspersor = new JLabel();
			jLabelPresionAspersor.setText("Presi\u00F3n del aspersor:");
			jLabelPresionAspersor.setForeground(Color.black);
		}
		return jLabelPresionAspersor;
	}
	public JTextField getJTextFieldPresionAspersor() {
		if (jTextFieldPresionAspersor == null) {
			jTextFieldPresionAspersor = new JTextField();
			jTextFieldPresionAspersor.setHorizontalAlignment(SwingConstants.CENTER);
			jTextFieldPresionAspersor.setPreferredSize(new Dimension(70, 20));
		}
		return jTextFieldPresionAspersor;
	}
	private JLabel getJLabelPresionAspersorKilo() {
		if (jLabelPresionAspersorKilo == null) {
			jLabelPresionAspersorKilo = new JLabel();
			jLabelPresionAspersorKilo.setText("kilo");
			jLabelPresionAspersorKilo.setForeground(Color.black);
		}
		return jLabelPresionAspersorKilo;
	}
	private JSeparator getSeparator_1_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(Color.GRAY);
		}
		return separator_1;
	}
	private JLabel getJLabel1ReguladorPresion() {
		if (jLabel1ReguladorPresion == null) {
			jLabel1ReguladorPresion = new JLabel();
			jLabel1ReguladorPresion.setText("Regulador de Presi\u00F3n:");
			jLabel1ReguladorPresion.setForeground(Color.black);
		}
		return jLabel1ReguladorPresion;
	}
	public JCheckBox getJCheckBoxReguladorPresion() {
		if (jCheckBoxReguladorPresion == null) {
			jCheckBoxReguladorPresion = new JCheckBox();
			jCheckBoxReguladorPresion.setBackground(Color.white);
		}
		return jCheckBoxReguladorPresion;
	}
	public JLabel getJLabel1ReguladorPresion0() {
		if (jLabel1ReguladorPresion0 == null) {
			jLabel1ReguladorPresion0 = new JLabel();
			jLabel1ReguladorPresion0.setText("Regulador de presi\u00F3n");
			jLabel1ReguladorPresion0.setForeground(Color.black);
			jLabel1ReguladorPresion0.setFont(new Font("Tahoma", Font.ITALIC, 11));
		}
		return jLabel1ReguladorPresion0;
	}
	public JLabel getJLabel1TAspersor() {
		if (jLabel1TAspersor == null) {
			jLabel1TAspersor = new JLabel();
			jLabel1TAspersor.setText("Tipo de aspersor");
			jLabel1TAspersor.setForeground(Color.black);
			jLabel1TAspersor.setFont(new Font("Tahoma", Font.ITALIC, 11));
		}
		return jLabel1TAspersor;
	}
	public JLabel getJLabel1DistPiso() {
		if (jLabel1DistPiso == null) {
			jLabel1DistPiso = new JLabel();
			jLabel1DistPiso.setText("Distancia al piso");
			jLabel1DistPiso.setForeground(Color.black);
			jLabel1DistPiso.setFont(new Font("Tahoma", Font.ITALIC, 11));
		}
		return jLabel1DistPiso;
	}
	public JComboBox getJComboBoxReguladorPresion() {
		if (jComboBoxReguladorPresion == null) {
			jComboBoxReguladorPresion = new JComboBox();
			jComboBoxReguladorPresion.setPreferredSize(new Dimension(75, 20));
			jComboBoxReguladorPresion.setBackground(Color.white);
			jComboBoxReguladorPresion.setEnabled(false);
			this.cargarJComboReguladorPresion();
		}
		return jComboBoxReguladorPresion;
	}
	private JLabel getJLabelPSI() {
		if (jLabelPSI == null) {
			jLabelPSI = new JLabel();
			jLabelPSI.setHorizontalAlignment(SwingConstants.LEFT);
			jLabelPSI.setForeground(Color.black);
			jLabelPSI.setText("PSI");
		}
		return jLabelPSI;
	}
	public JComboBox getJComboBoxTAspersor() {
		if (jComboBoxTAspersor == null) {
			jComboBoxTAspersor = new JComboBox();
			jComboBoxTAspersor.setPreferredSize(new Dimension(70, 20));
			jComboBoxTAspersor.setBackground(Color.white);
			this.cargarJComboAspersor();
		}
		return jComboBoxTAspersor;
	}
	public JComboBox getJComboBoxDistanciaPiso() {
		if (jComboBoxDistanciaPiso == null) {
			jComboBoxDistanciaPiso = new JComboBox();
			jComboBoxDistanciaPiso.setPreferredSize(new Dimension(70, 20));
			jComboBoxDistanciaPiso.setBackground(Color.white);
			this.cargarDistanciaPiso();
		}
		return jComboBoxDistanciaPiso;
	}
	private JLabel getJLabelDistPisoMts() {
		if (jLabelDistPisoMts == null) {
			jLabelDistPisoMts = new JLabel();
			jLabelDistPisoMts.setText("mts");
			jLabelDistPisoMts.setForeground(Color.black);
		}
		return jLabelDistPisoMts;
	}
	private JSeparator getSeparator_2_1() {
		if (separator_2 == null) {
			separator_2 = new JSeparator();
			separator_2.setForeground(Color.GRAY);
		}
		return separator_2;
	}
	public JLabel getJLabel1BoquillasAnuladas() {
		if (jLabel1BoquillasAnuladas == null) {
			jLabel1BoquillasAnuladas = new JLabel();
			jLabel1BoquillasAnuladas.setText("Boquillas anuladas:");
			jLabel1BoquillasAnuladas.setForeground(Color.black);
		}
		return jLabel1BoquillasAnuladas;
	}
	public JTextField getJTextFieldBoquillasAnuladas() {
		if (jTextFieldBoquillasAnuladas == null) {
			jTextFieldBoquillasAnuladas = new JTextField();
			jTextFieldBoquillasAnuladas.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return jTextFieldBoquillasAnuladas;
	}
	public JLabel getJLabel1HrIrrigacion() {
		if (jLabel1HrIrrigacion == null) {
			jLabel1HrIrrigacion = new JLabel();
			jLabel1HrIrrigacion.setText("Horas de Irrigaci\u00F3n:");
			jLabel1HrIrrigacion.setForeground(Color.black);
		}
		return jLabel1HrIrrigacion;
	}
	public JTextField getJTextFieldHrIrrigacion() {
		if (jTextFieldHrIrrigacion == null) {
			jTextFieldHrIrrigacion = new JTextField();
			jTextFieldHrIrrigacion.setHorizontalAlignment(SwingConstants.CENTER);
			jTextFieldHrIrrigacion.setPreferredSize(new Dimension(30, 20));
		}
		return jTextFieldHrIrrigacion;
	}
	private JLabel getJLabel1HrIrrigacionHrs() {
		if (jLabel1HrIrrigacionHrs == null) {
			jLabel1HrIrrigacionHrs = new JLabel();
			jLabel1HrIrrigacionHrs.setText("hr/d");
			jLabel1HrIrrigacionHrs.setForeground(Color.black);
		}
		return jLabel1HrIrrigacionHrs;
	}
	public JLabel getJLabel1AnguloIrrigacion() {
		if (jLabel1AnguloIrrigacion == null) {
			jLabel1AnguloIrrigacion = new JLabel();
			jLabel1AnguloIrrigacion.setText("\u00C1ngulo de irrigaci\u00F3n:");
			jLabel1AnguloIrrigacion.setForeground(Color.black);
		}
		return jLabel1AnguloIrrigacion;
	}
	public JTextField getJTextFieldAnguloIrrigacion() {
		if (jTextFieldAnguloIrrigacion == null) {
			jTextFieldAnguloIrrigacion = new JTextField();
			jTextFieldAnguloIrrigacion.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return jTextFieldAnguloIrrigacion;
	}
	private JLabel getJLabel1AnguloIrrigacionº() {
		if (jLabel1AnguloIrrigacionº == null) {
			jLabel1AnguloIrrigacionº = new JLabel();
			jLabel1AnguloIrrigacionº.setText("\u00BA");
			jLabel1AnguloIrrigacionº.setForeground(Color.black);
		}
		return jLabel1AnguloIrrigacionº;
	}
	public JLabel getJLabel1Caudal() {
		if (jLabel1Caudal == null) {
			jLabel1Caudal = new JLabel();
			jLabel1Caudal.setText("Caudal:");
			jLabel1Caudal.setForeground(Color.black);
		}
		return jLabel1Caudal;
	}
	public JTextField getJTextFieldCaudal() {
		if (jTextFieldCaudal == null) {
			jTextFieldCaudal = new JTextField();
			jTextFieldCaudal.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return jTextFieldCaudal;
	}
	private JLabel getJLabel1CaudalM3Hr() {
		if (jLabel1CaudalM3Hr == null) {
			jLabel1CaudalM3Hr = new JLabel();
			jLabel1CaudalM3Hr.setText("m3/hrs");
			jLabel1CaudalM3Hr.setForeground(Color.black);
		}
		return jLabel1CaudalM3Hr;
	}
	private JPanel getPanelSurEste() {
		if (panelSurEste == null) {
			panelSurEste = new JPanel();
			panelSurEste.setBackground(Color.white);
			GridBagLayout gbl_panelSurEste = new GridBagLayout();
			gbl_panelSurEste.columnWidths = new int[]{0, 0, 48, 29, 0};
			gbl_panelSurEste.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
			gbl_panelSurEste.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
			gbl_panelSurEste.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelSurEste.setLayout(gbl_panelSurEste);
			GridBagConstraints gbc_jLabelDatos = new GridBagConstraints();
			gbc_jLabelDatos.insets = new Insets(0, 0, 5, 5);
			gbc_jLabelDatos.gridx = 0;
			gbc_jLabelDatos.gridy = 0;
			panelSurEste.add(getJLabelDatos(), gbc_jLabelDatos);
			GridBagConstraints gbc_jLabel2PrecipitacionMin = new GridBagConstraints();
			gbc_jLabel2PrecipitacionMin.anchor = GridBagConstraints.EAST;
			gbc_jLabel2PrecipitacionMin.insets = new Insets(0, 0, 5, 5);
			gbc_jLabel2PrecipitacionMin.gridx = 1;
			gbc_jLabel2PrecipitacionMin.gridy = 1;
			panelSurEste.add(getJLabel2PrecipitacionMin(), gbc_jLabel2PrecipitacionMin);
			GridBagConstraints gbc_jTextFieldPrecipitacionMin = new GridBagConstraints();
			gbc_jTextFieldPrecipitacionMin.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldPrecipitacionMin.insets = new Insets(0, 0, 5, 5);
			gbc_jTextFieldPrecipitacionMin.gridx = 2;
			gbc_jTextFieldPrecipitacionMin.gridy = 1;
			panelSurEste.add(getJTextFieldPrecipitacionMin(), gbc_jTextFieldPrecipitacionMin);
			GridBagConstraints gbc_jLabelPrecipitacionMinimaMM = new GridBagConstraints();
			gbc_jLabelPrecipitacionMinimaMM.insets = new Insets(0, 0, 5, 0);
			gbc_jLabelPrecipitacionMinimaMM.gridx = 3;
			gbc_jLabelPrecipitacionMinimaMM.gridy = 1;
			panelSurEste.add(getJLabelPrecipitacionMinimaMM(), gbc_jLabelPrecipitacionMinimaMM);
			GridBagConstraints gbc_jLabelLongTotal = new GridBagConstraints();
			gbc_jLabelLongTotal.anchor = GridBagConstraints.EAST;
			gbc_jLabelLongTotal.insets = new Insets(0, 0, 5, 5);
			gbc_jLabelLongTotal.gridx = 1;
			gbc_jLabelLongTotal.gridy = 2;
			panelSurEste.add(getJLabelLongTotal(), gbc_jLabelLongTotal);
			GridBagConstraints gbc_jTextFieldLongTotal = new GridBagConstraints();
			gbc_jTextFieldLongTotal.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldLongTotal.insets = new Insets(0, 0, 5, 5);
			gbc_jTextFieldLongTotal.gridx = 2;
			gbc_jTextFieldLongTotal.gridy = 2;
			panelSurEste.add(getJTextFieldLongTotal(), gbc_jTextFieldLongTotal);
			GridBagConstraints gbc_jLabel = new GridBagConstraints();
			gbc_jLabel.insets = new Insets(0, 0, 5, 0);
			gbc_jLabel.gridx = 3;
			gbc_jLabel.gridy = 2;
			panelSurEste.add(getJLabel(), gbc_jLabel);
			GridBagConstraints gbc_jLabel1HaRegadas = new GridBagConstraints();
			gbc_jLabel1HaRegadas.anchor = GridBagConstraints.EAST;
			gbc_jLabel1HaRegadas.insets = new Insets(0, 0, 5, 5);
			gbc_jLabel1HaRegadas.gridx = 1;
			gbc_jLabel1HaRegadas.gridy = 3;
			panelSurEste.add(getJLabel1HaRegadas(), gbc_jLabel1HaRegadas);
			GridBagConstraints gbc_jTextFieldHaRegadas = new GridBagConstraints();
			gbc_jTextFieldHaRegadas.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldHaRegadas.insets = new Insets(0, 0, 5, 5);
			gbc_jTextFieldHaRegadas.gridx = 2;
			gbc_jTextFieldHaRegadas.gridy = 3;
			panelSurEste.add(getJTextFieldHaRegadas(), gbc_jTextFieldHaRegadas);
			GridBagConstraints gbc_jLabel1HaRiegoHa = new GridBagConstraints();
			gbc_jLabel1HaRiegoHa.insets = new Insets(0, 0, 5, 0);
			gbc_jLabel1HaRiegoHa.gridx = 3;
			gbc_jLabel1HaRiegoHa.gridy = 3;
			panelSurEste.add(getJLabel1HaRiegoHa(), gbc_jLabel1HaRiegoHa);
			GridBagConstraints gbc_jLabel1PresionConexion = new GridBagConstraints();
			gbc_jLabel1PresionConexion.anchor = GridBagConstraints.EAST;
			gbc_jLabel1PresionConexion.insets = new Insets(0, 0, 0, 5);
			gbc_jLabel1PresionConexion.gridx = 1;
			gbc_jLabel1PresionConexion.gridy = 4;
			panelSurEste.add(getJLabel1PresionConexion(), gbc_jLabel1PresionConexion);
			GridBagConstraints gbc_jTextFieldPresionConexion = new GridBagConstraints();
			gbc_jTextFieldPresionConexion.fill = GridBagConstraints.HORIZONTAL;
			gbc_jTextFieldPresionConexion.insets = new Insets(0, 0, 0, 5);
			gbc_jTextFieldPresionConexion.gridx = 2;
			gbc_jTextFieldPresionConexion.gridy = 4;
			panelSurEste.add(getJTextFieldPresionConexion(), gbc_jTextFieldPresionConexion);
			GridBagConstraints gbc_jLabelPresionConexionKilo = new GridBagConstraints();
			gbc_jLabelPresionConexionKilo.insets = new Insets(0, 0, 0, 5);
			gbc_jLabelPresionConexionKilo.gridx = 3;
			gbc_jLabelPresionConexionKilo.gridy = 4;
			panelSurEste.add(getJLabelPresionConexionKilo(), gbc_jLabelPresionConexionKilo);
		}
		return panelSurEste;
	}
	private JLabel getJLabelDatos() {
		if (jLabelDatos == null) {
			jLabelDatos = new JLabel();
			jLabelDatos.setText("Datos:");
			jLabelDatos.setForeground(Color.black);
			jLabelDatos.setFont(new Font("Dialog", Font.BOLD, 14));
		}
		return jLabelDatos;
	}
	public JLabel getJLabel2PrecipitacionMin() {
		if (jLabel2PrecipitacionMin == null) {
			jLabel2PrecipitacionMin = new JLabel();
			jLabel2PrecipitacionMin.setText("Precipitaci\u00F3n m\u00EDnima:");
			jLabel2PrecipitacionMin.setForeground(Color.black);
		}
		return jLabel2PrecipitacionMin;
	}
	public JTextField getJTextFieldPrecipitacionMin() {
		if (jTextFieldPrecipitacionMin == null) {
			jTextFieldPrecipitacionMin = new JTextField();
			jTextFieldPrecipitacionMin.setHorizontalAlignment(SwingConstants.CENTER);
			jTextFieldPrecipitacionMin.setPreferredSize(new Dimension(70, 20));
		}
		return jTextFieldPrecipitacionMin;
	}
	private JLabel getJLabelPrecipitacionMinimaMM() {
		if (jLabelPrecipitacionMinimaMM == null) {
			jLabelPrecipitacionMinimaMM = new JLabel();
			jLabelPrecipitacionMinimaMM.setHorizontalAlignment(SwingConstants.LEFT);
			jLabelPrecipitacionMinimaMM.setForeground(Color.black);
			jLabelPrecipitacionMinimaMM.setText("mm");
		}
		return jLabelPrecipitacionMinimaMM;
	}
	private JLabel getJLabelLongTotal() {
		if (jLabelLongTotal == null) {
			jLabelLongTotal = new JLabel();
			jLabelLongTotal.setText("Longitud Total:");
			jLabelLongTotal.setForeground(Color.black);
		}
		return jLabelLongTotal;
	}
	public JTextField getJTextFieldLongTotal() {
		if (jTextFieldLongTotal == null) {
			jTextFieldLongTotal = new JTextField();
			jTextFieldLongTotal.setHorizontalAlignment(SwingConstants.CENTER);
			jTextFieldLongTotal.setText("");
			jTextFieldLongTotal.setPreferredSize(new Dimension(40, 20));
			jTextFieldLongTotal.setFont(new Font("Dialog", Font.BOLD, 12));
			jTextFieldLongTotal.setEditable(false);
		}
		return jTextFieldLongTotal;
	}
	private JLabel getJLabel() {
		if (jLabel == null) {
			jLabel = new JLabel();
			jLabel.setHorizontalAlignment(SwingConstants.LEFT);
			jLabel.setForeground(Color.black);
			jLabel.setText("mts");
		}
		return jLabel;
	}
	private JLabel getJLabel1HaRegadas() {
		if (jLabel1HaRegadas == null) {
			jLabel1HaRegadas = new JLabel();
			jLabel1HaRegadas.setText("N\u00BA Ha. bajo riego:");
			jLabel1HaRegadas.setForeground(Color.black);
		}
		return jLabel1HaRegadas;
	}
	public JTextField getJTextFieldHaRegadas() {
		if (jTextFieldHaRegadas == null) {
			jTextFieldHaRegadas = new JTextField();
			jTextFieldHaRegadas.setHorizontalAlignment(SwingConstants.CENTER);
			jTextFieldHaRegadas.setPreferredSize(new Dimension(40, 20));
			jTextFieldHaRegadas.setFont(new Font("Dialog", Font.BOLD, 12));
			jTextFieldHaRegadas.setEditable(false);
		}
		return jTextFieldHaRegadas;
	}
	private JLabel getJLabel1HaRiegoHa() {
		if (jLabel1HaRiegoHa == null) {
			jLabel1HaRiegoHa = new JLabel();
			jLabel1HaRiegoHa.setHorizontalAlignment(SwingConstants.LEFT);
			jLabel1HaRiegoHa.setForeground(Color.black);
			jLabel1HaRiegoHa.setText("ha");
		}
		return jLabel1HaRiegoHa;
	}
	private JLabel getJLabel1PresionConexion() {
		if (jLabel1PresionConexion == null) {
			jLabel1PresionConexion = new JLabel();
			jLabel1PresionConexion.setText("Presi\u00F3n a la conexi\u00F3n:");
			jLabel1PresionConexion.setForeground(Color.black);
			jLabel1PresionConexion.setFont(new Font("Dialog", Font.BOLD, 12));
		}
		return jLabel1PresionConexion;
	}
	public JTextField getJTextFieldPresionConexion() {
		if (jTextFieldPresionConexion == null) {
			jTextFieldPresionConexion = new JTextField();
			jTextFieldPresionConexion.setHorizontalAlignment(SwingConstants.CENTER);
			jTextFieldPresionConexion.setPreferredSize(new Dimension(70, 20));
			jTextFieldPresionConexion.setFont(new Font("Dialog", Font.BOLD, 12));
			jTextFieldPresionConexion.setEditable(false);
		}
		return jTextFieldPresionConexion;
	}
	private JLabel getJLabelPresionConexionKilo() {
		if (jLabelPresionConexionKilo == null) {
			jLabelPresionConexionKilo = new JLabel();
			jLabelPresionConexionKilo.setHorizontalAlignment(SwingConstants.LEFT);
			jLabelPresionConexionKilo.setForeground(Color.black);
			jLabelPresionConexionKilo.setText("kilo");
		}
		return jLabelPresionConexionKilo;
	}
	public JPanel getPanelBotones() {
		if (panelBotones == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 1;
			gridBagConstraints.anchor = GridBagConstraints.EAST;
			gridBagConstraints.insets = new Insets(0, 0, 0, 8);
			gridBagConstraints.gridy = 2;
			panelBotones = new JPanel();
			panelBotones.setBackground(Color.white);
			GridBagLayout gbl_panelBotones = new GridBagLayout();
			gbl_panelBotones.columnWidths = new int[]{71, 77, 0, 86, 0};
			gbl_panelBotones.rowHeights = new int[]{0, 0, 23, 0};
			gbl_panelBotones.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panelBotones.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelBotones.setLayout(gbl_panelBotones);
			GridBagConstraints gbc_separator_3 = new GridBagConstraints();
			gbc_separator_3.fill = GridBagConstraints.HORIZONTAL;
			gbc_separator_3.anchor = GridBagConstraints.NORTH;
			gbc_separator_3.gridwidth = 5;
			gbc_separator_3.insets = new Insets(0, 0, 5, 0);
			gbc_separator_3.gridx = 0;
			gbc_separator_3.gridy = 0;
			panelBotones.add(getSeparator_3_1(), gbc_separator_3);
			GridBagConstraints gbc_jButtonDetalletecnico = new GridBagConstraints();
			gbc_jButtonDetalletecnico.anchor = GridBagConstraints.EAST;
			gbc_jButtonDetalletecnico.insets = new Insets(0, 0, 5, 5);
			gbc_jButtonDetalletecnico.gridx = 1;
			gbc_jButtonDetalletecnico.gridy = 1;
			panelBotones.add(getJButtonDetalletecnico(), gbc_jButtonDetalletecnico);
			GridBagConstraints gbc_jButtonReporteBoquilla = new GridBagConstraints();
			gbc_jButtonReporteBoquilla.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonReporteBoquilla.gridwidth = 2;
			gbc_jButtonReporteBoquilla.insets = new Insets(0, 0, 5, 5);
			gbc_jButtonReporteBoquilla.gridx = 2;
			gbc_jButtonReporteBoquilla.gridy = 1;
			panelBotones.add(getJButtonReporteBoquilla(), gbc_jButtonReporteBoquilla);
			GridBagConstraints gbc_jButtonAplicar = new GridBagConstraints();
			gbc_jButtonAplicar.anchor = GridBagConstraints.EAST;
			gbc_jButtonAplicar.insets = new Insets(0, 0, 0, 5);
			gbc_jButtonAplicar.gridx = 2;
			gbc_jButtonAplicar.gridy = 2;
			panelBotones.add(getJButtonAplicar(), gbc_jButtonAplicar);
			GridBagConstraints gbc_jButtonCancelar = new GridBagConstraints();
			gbc_jButtonCancelar.insets = new Insets(0, 0, 0, 5);
			gbc_jButtonCancelar.fill = GridBagConstraints.HORIZONTAL;
			gbc_jButtonCancelar.anchor = GridBagConstraints.NORTH;
			gbc_jButtonCancelar.gridx = 3;
			gbc_jButtonCancelar.gridy = 2;
			panelBotones.add(getJButtonCancelar(), gbc_jButtonCancelar);
			panelBotones.add(getJButtonTerminar(), gridBagConstraints);
		}
		return panelBotones;
	}
	public JButton getJButtonCancelar() {
		if (jButtonCancelar == null) {
			jButtonCancelar = new JButton();
			jButtonCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			jButtonCancelar.setText("Cancelar");
			jButtonCancelar.setForeground(Color.black);
		}
		return jButtonCancelar;
	}
	
	public void cargarJComboDiamTuberia(){
		this.getJComboBoxDiamTuberia().addItem("");
		this.getJComboBoxDiamTuberia().addItem(168);
		this.getJComboBoxDiamTuberia().addItem(219);
	}
	
	public void cargarJComboLongTramo0(){
		this.getJComboBoxLongTramo0().addItem("");
		this.getJComboBoxLongTramo0().addItem("48.5");
		this.getJComboBoxLongTramo0().addItem("54");
		this.getJComboBoxLongTramo0().addItem("61");		
	}
	
	public void cargarJComboLongTramo1(){
		this.getJComboBoxLongTramo1().addItem("");
		this.getJComboBoxLongTramo1().addItem("48.5");
		this.getJComboBoxLongTramo1().addItem("54");
		this.getJComboBoxLongTramo1().addItem("61");		
	}
	
	public void cargarJComboLongTramo2(){
		this.getJComboBoxLongTramo2().addItem("");
		this.getJComboBoxLongTramo2().addItem("48.5");
		this.getJComboBoxLongTramo2().addItem("54");
		this.getJComboBoxLongTramo2().addItem("61");		
	}
	
	public void cargarJComboVoladizo(){
		this.getJComboBoxVoladizo().addItem("");
		this.getJComboBoxVoladizo().addItem(0);
		this.getJComboBoxVoladizo().addItem(6);
		this.getJComboBoxVoladizo().addItem(12);
		this.getJComboBoxVoladizo().addItem(18);
		this.getJComboBoxVoladizo().addItem(24);
	}
	
	public void cargarJComboNeumatico(){
		this.getJComboBoxNeumaticos().addItem("");
		this.getJComboBoxNeumaticos().addItem("12,9-24");
		this.getJComboBoxNeumaticos().addItem("14,9-24");
		this.getJComboBoxNeumaticos().addItem("16,9-24");
	}
	
	public void cargarJComboTipoTablero(){
		this.getJComboBoxTTablero().addItem("");
		this.getJComboBoxTTablero().addItem("Electromecánico");
		this.getJComboBoxTTablero().addItem("Electrico-Digital");
	}
	
	public void cargarJComboTipoMotor(){
		this.getJComboBoxTMotor().addItem("");
		this.getJComboBoxTMotor().addItem("1/2 hp");
		this.getJComboBoxTMotor().addItem("3/4 hp");
	}
	
	public void cargarJComboTipoReductor(){
		this.getJComboBoxTReductor().addItem("");
		this.getJComboBoxTReductor().addItem("740 (UMC) 800");
		this.getJComboBoxTReductor().addItem("725 (UMC) 700");
	}
	
	public void cargarJComboDistanciaEntreAspersores(){
		this.getJComboBoxDistAspersores().addItem("");
		this.getJComboBoxDistAspersores().addItem("2.25");
		this.getJComboBoxDistAspersores().addItem("3.00");
	}
	
	public void cargarJComboReguladorPresion(){
		this.getJComboBoxReguladorPresion().addItem("");
		this.getJComboBoxReguladorPresion().addItem("6");
		this.getJComboBoxReguladorPresion().addItem("10");
		this.getJComboBoxReguladorPresion().addItem("15");
		this.getJComboBoxReguladorPresion().addItem("20");
	}
	
	public void cargarJComboAspersor(){
		this.getJComboBoxTAspersor().addItem("");
		this.getJComboBoxTAspersor().addItem("Rotator");
		this.getJComboBoxTAspersor().addItem("I-wob");
		this.getJComboBoxTAspersor().addItem("LDN");
	}
	
	public void cargarDistanciaPiso(){
		this.getJComboBoxDistanciaPiso().addItem("");
		this.getJComboBoxDistanciaPiso().addItem("1.20");
		this.getJComboBoxDistanciaPiso().addItem("1.80");
		this.getJComboBoxDistanciaPiso().addItem("2.40");
	}
	public JButton getJButtonAplicar() {
		if (jButtonAplicar == null) {
			jButtonAplicar = new JButton("Aplicar");
			jButtonAplicar.setHorizontalAlignment(SwingConstants.LEFT);
			jButtonAplicar.setForeground(Color.black);
			jButtonAplicar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
		}
		return jButtonAplicar;
	}
	public JButton getJButtonDetalletecnico() {
		if (jButtonDetalletecnico == null) {
			jButtonDetalletecnico = new JButton("Detalles técnicos");
			jButtonDetalletecnico.setForeground(Color.black);
			jButtonDetalletecnico.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
		}
		return jButtonDetalletecnico;
	}
	public JButton getJButtonReporteBoquilla() {
		if (jButtonReporteBoquilla == null) {
			jButtonReporteBoquilla = new JButton("Inventario de boquillas");
			jButtonReporteBoquilla.setForeground(Color.black);
			jButtonReporteBoquilla.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
		}
		return jButtonReporteBoquilla;
	}
	private JSeparator getSeparator_3_1() {
		if (separator_3 == null) {
			separator_3 = new JSeparator();
			separator_3.setBackground(Color.GRAY);
		}
		return separator_3;
	}

	/**
	 * This method initializes jButtonTerminar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonTerminar() {
		if (jButtonTerminar == null) {
			jButtonTerminar = new JButton("Terminar");
			jButtonTerminar.setPreferredSize(new Dimension(88, 26));	
			jButtonTerminar.setForeground(Color.black);
			jButtonTerminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
		}
		return jButtonTerminar;
	}
}  //  @jve:decl-index=0:visual-constraint="6,7"
