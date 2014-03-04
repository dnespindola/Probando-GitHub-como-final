package Principal;

import javax.swing.JPanel;
import javax.swing.JDialog;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.Color;

public class InterfazPrecios extends JDialog {

	private JPanel jContentPane = null;
	private JButton jButtonModificar = null;
	private JButton jButtonCancelar = null;
	private JScrollPane jScrollPane = null;
	private JTable jTablePrecios = null;
	private JLabel jLabelPrecio = null;
	private JTextField jTextFieldPrecio = null;
	/**
	 * This is the default constructor
	 */
	public InterfazPrecios() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(547, 534);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:/trabajos java POO/RiegosCentro/Imagenes/gota.png"));
		this.setContentPane(getJContentPane());
		this.setTitle("Precios");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints4.gridy = 1;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.insets = new java.awt.Insets(0,7,0,144);
			gridBagConstraints4.gridx = 2;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.insets = new java.awt.Insets(0,133,0,0);
			gridBagConstraints1.gridy = 1;
			jLabelPrecio = new JLabel();
			jLabelPrecio.setText("Nuevo precio");
			jLabelPrecio.setVisible(false);
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
			gridBagConstraints.gridy = 0;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.weighty = 1.0;
			gridBagConstraints.gridwidth = 3;
			gridBagConstraints.gridx = 0;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 2;
			gridBagConstraints3.insets = new java.awt.Insets(0,0,2,135);
			gridBagConstraints3.gridy = 2;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 0;
			gridBagConstraints2.insets = new java.awt.Insets(0,153,2,26);
			gridBagConstraints2.gridy = 2;
			jContentPane = new JPanel();
			jContentPane.setLayout(new GridBagLayout());
			jContentPane.setBackground(Color.white);
			jContentPane.add(getJButtonModificar(), gridBagConstraints2);
			jContentPane.add(getJButtonCancelar(), gridBagConstraints3);
			jContentPane.add(getJScrollPane(), gridBagConstraints);
			jContentPane.add(jLabelPrecio, gridBagConstraints1);
			jContentPane.add(getJTextFieldPrecio(), gridBagConstraints4);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTablePrecios	
	 * 	
	 * @return javax.swing.JTable	
	 */
	public JTable getJTablePrecios() {
		if (jTablePrecios == null) {
			jTablePrecios = new JTable();
			jTablePrecios.setPreferredSize(new java.awt.Dimension(360,80));
			jTablePrecios.setForeground(Color.black);
		}
		return jTablePrecios;
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
	
	public void setListenerButtons (ActionListener al) {
		this.jButtonModificar.addActionListener(al);
		this.jButtonCancelar.addActionListener(al);	
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getJTablePrecios2());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTablePrecios	
	 * 	
	 * @return javax.swing.JTable	
	 */
	public JTable getJTablePrecios2() {
		if (jTablePrecios == null) {
			jTablePrecios = new JTable();
			jTablePrecios.setForeground(Color.black);
		}
		return jTablePrecios;
	}

	/**
	 * This method initializes jTextFieldPrecio	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldPrecio() {
		if (jTextFieldPrecio == null) {
			jTextFieldPrecio = new JTextField();
			jTextFieldPrecio.setVisible(false);
		}
		return jTextFieldPrecio;
	}
	
	public JLabel getJLabelPrecio(){
		if (jLabelPrecio == null) {
			jLabelPrecio = new JLabel();
		}	
		return jLabelPrecio;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
