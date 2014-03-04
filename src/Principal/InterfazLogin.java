package Principal;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.WindowConstants;

import java.awt.Color;
import java.awt.Insets;


public class InterfazLogin extends JFrame {

	private JPanel jContentPane = null;
	private JLabel jLabelUsuario = null;
	private JLabel jLabelContrasena = null;
	private JTextField jTextFieldUsuario = null;
	private JPasswordField jPasswordFieldContrasena = null;
	private JButton jButtonAceptar = null;

	/**
	 * This is the default constructor
	 */
	public InterfazLogin() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:/trabajos java POO/RiegosCentro/Imagenes/gota.png"));
		this.setResizable(false);
		this.setTitle("Login");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.gridx = 1;
			gridBagConstraints11.insets = new Insets(12, 0, 0, 0);
			gridBagConstraints11.fill = GridBagConstraints.NONE;
			gridBagConstraints11.gridy = 2;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints3.gridy = 1;
			gridBagConstraints3.weightx = 1.0;
			gridBagConstraints3.insets = new Insets(0, 28, 0, 40);
			gridBagConstraints3.gridx = 1;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints2.gridy = 0;
			gridBagConstraints2.weightx = 1.0;
			gridBagConstraints2.insets = new Insets(0, 28, 0, 40);
			gridBagConstraints2.anchor = GridBagConstraints.NORTH;
			gridBagConstraints2.gridx = 1;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.insets = new java.awt.Insets(0,14,0,0);
			gridBagConstraints1.gridy = 1;
			jLabelContrasena = new JLabel();
			jLabelContrasena.setText("Contraseña");
			jLabelContrasena.setForeground(Color.black);
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.insets = new java.awt.Insets(0,38,0,0);
			gridBagConstraints.gridy = 0;
			jLabelUsuario = new JLabel();
			jLabelUsuario.setText("Usuario");
			jLabelUsuario.setForeground(Color.black);
			jContentPane = new JPanel();
			jContentPane.setLayout(new GridBagLayout());
			jContentPane.setBackground(Color.white);
			jContentPane.add(jLabelUsuario, gridBagConstraints);
			jContentPane.add(jLabelContrasena, gridBagConstraints1);
			jContentPane.add(getJTextFieldUsuario(), gridBagConstraints2);
			jContentPane.add(getJPasswordFieldContrasena(), gridBagConstraints3);
			jContentPane.add(getJButtonAceptar(), gridBagConstraints11);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTextFieldUsuario	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextFieldUsuario() {
		if (jTextFieldUsuario == null) {
			jTextFieldUsuario = new JTextField();
		}
		return jTextFieldUsuario;
	}

	/**
	 * This method initializes jPasswordFieldContrasena	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	public JPasswordField getJPasswordFieldContrasena() {
		if (jPasswordFieldContrasena == null) {
			jPasswordFieldContrasena = new JPasswordField();
		}
		return jPasswordFieldContrasena;
	}

	public void setListenerButtons (ActionListener al) {
		this.jButtonAceptar.addActionListener(al);
	}

	/**
	 * This method initializes jButtonAceptar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonAceptar() {
		if (jButtonAceptar == null) {
			jButtonAceptar = new JButton();
			jButtonAceptar.setText("Iniciar");
			jButtonAceptar.setForeground(Color.black);
		}
		return jButtonAceptar;
	}

	/**
	 * @return the jLabelUsuario
	 */
	public JLabel getjLabelUsuario() {
		return jLabelUsuario;
	}

	/**
	 * @param jLabelUsuario the jLabelUsuario to set
	 */
	public void setjLabelUsuario(JLabel jLabelUsuario) {
		this.jLabelUsuario = jLabelUsuario;
	}

	/**
	 * @return the jLabelContrasena
	 */
	public JLabel getjLabelContrasena() {
		return jLabelContrasena;
	}

	/**
	 * @param jLabelContrasena the jLabelContrasena to set
	 */
	public void setjLabelContrasena(JLabel jLabelContrasena) {
		this.jLabelContrasena = jLabelContrasena;
	}

	/**
	 * @return the jPasswordFieldContrasena
	 */
	public JPasswordField getjPasswordFieldContrasena() {
		return jPasswordFieldContrasena;
	}

	/**
	 * @param jPasswordFieldContrasena the jPasswordFieldContrasena to set
	 */
	public void setjPasswordFieldContrasena(JPasswordField jPasswordFieldContrasena) {
		this.jPasswordFieldContrasena = jPasswordFieldContrasena;
	}

	/**
	 * @return the jButtonAceptar
	 */
	public JButton getjButtonAceptar() {
		return jButtonAceptar;
	}

	/**
	 * @param jButtonAceptar the jButtonAceptar to set
	 */
	public void setjButtonAceptar(JButton jButtonAceptar) {
		this.jButtonAceptar = jButtonAceptar;
	}
	
}
