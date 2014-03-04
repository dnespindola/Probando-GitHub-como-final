package EmitirFactura;

import java.awt.BorderLayout;  
import javax.swing.JPanel; 
import javax.swing.JDialog;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JTextPane;
import java.awt.GridBagConstraints;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 * 
 */

public class InterfazEmitirFactura extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JTextArea jTextAreaFactura = null;
	private JLabel jLabelCostosExtras = null;
	private JTextField jTextFieldCostosExtras = null;
	private JButton jButtonAceptar = null;
	private JLabel jLabelPrecioFinal = null;
	private JTextField jTextFieldPrecioFinal = null;
	private JLabel jLabelAclaracion = null;
	/**
	 * This is the default constructor
	 */
	public InterfazEmitirFactura() {
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
		this.setSize(416, 338);
		this.setForeground(Color.black);
		this.setResizable(false);
		this.setContentPane(getJContentPane());
		this.setTitle("Detalles del presupuesto");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
			gridBagConstraints31.gridx = 0;
			gridBagConstraints31.anchor = java.awt.GridBagConstraints.SOUTHWEST;
			gridBagConstraints31.insets = new java.awt.Insets(0,3,6,0);
			gridBagConstraints31.gridy = 3;
			jLabelAclaracion = new JLabel();
			jLabelAclaracion.setText("* Precio final con IVA al 21%");
			jLabelAclaracion.setForeground(Color.black);
			jLabelAclaracion.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints2.gridy = 2;
			gridBagConstraints2.weightx = 1.0;
			gridBagConstraints2.insets = new java.awt.Insets(3,0,3,0);
			gridBagConstraints2.gridx = 1;
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.gridx = 0;
			gridBagConstraints11.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints11.insets = new java.awt.Insets(3,200,3,5);
			gridBagConstraints11.gridy = 2;
			jLabelPrecioFinal = new JLabel();
			jLabelPrecioFinal.setText("Precio final *:");
			jLabelPrecioFinal.setForeground(Color.black);
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.gridx = 1;
			gridBagConstraints5.anchor = GridBagConstraints.EAST;
			gridBagConstraints5.insets = new Insets(15, 0, 5, 4);
			gridBagConstraints5.gridy = 3;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints4.gridy = 1;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.insets = new java.awt.Insets(3,0,3,0);
			gridBagConstraints4.gridx = 1;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 0;
			gridBagConstraints3.insets = new java.awt.Insets(3,200,3,5);
			gridBagConstraints3.gridy = 1;
			jLabelCostosExtras = new JLabel();
			jLabelCostosExtras.setText("Costos extras:");
			jLabelCostosExtras.setForeground(Color.black);
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.fill = GridBagConstraints.BOTH;
			gridBagConstraints1.gridy = 0;
			gridBagConstraints1.weightx = 1.0;
			gridBagConstraints1.weighty = 1.0;
			gridBagConstraints1.gridheight = 1;
			gridBagConstraints1.gridwidth = 3;
			gridBagConstraints1.gridx = 0;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.BOTH;
			gridBagConstraints.gridy = 0;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.gridx = 0;
			jContentPane = new JPanel();
			jContentPane.setLayout(new GridBagLayout());
			jContentPane.setBackground(Color.white);
			jContentPane.add(getJTextAreaFactura(), gridBagConstraints1);
			jContentPane.add(jLabelCostosExtras, gridBagConstraints3);
			jContentPane.add(getJTextFieldCostosExtras(), gridBagConstraints4);
			jContentPane.add(getJButtonAceptar(), gridBagConstraints5);
			jContentPane.add(jLabelPrecioFinal, gridBagConstraints11);
			jContentPane.add(getJTextFieldPrecioFinal(), gridBagConstraints2);
			jContentPane.add(jLabelAclaracion, gridBagConstraints31);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTextAreaFactura	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	public JTextArea getJTextAreaFactura() {
		if (jTextAreaFactura == null) {
			jTextAreaFactura = new JTextArea();
			jTextAreaFactura.setFont(new Font("Dialog", Font.BOLD, 14));
			jTextAreaFactura.setForeground(Color.black);
			jTextAreaFactura.setBackground(Color.white);
		}
		return jTextAreaFactura;
	}

	/**
	 * This method initializes jTextFieldCostosExtras	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldCostosExtras() {
		if (jTextFieldCostosExtras == null) {
			jTextFieldCostosExtras = new JTextField();
			jTextFieldCostosExtras.setPreferredSize(new java.awt.Dimension(100,20));
		}
		return jTextFieldCostosExtras;
	}

	/**
	 * This method initializes jButtonAceptar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonAceptar() {
		if (jButtonAceptar == null) {
			jButtonAceptar = new JButton();
			jButtonAceptar.setText("Calcular");
			jButtonAceptar.setForeground(Color.black);
		}
		return jButtonAceptar;
	}

	/**
	 * This method initializes jTextFieldPrecioFinal	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldPrecioFinal() {
		if (jTextFieldPrecioFinal == null) {
			jTextFieldPrecioFinal = new JTextField();
		}
		return jTextFieldPrecioFinal;
	}
	
	public void setListenerButtons (ActionListener al) {
		this.jButtonAceptar.addActionListener(al);
	}

}  //  @jve:decl-index=0:visual-constraint="41,21"
