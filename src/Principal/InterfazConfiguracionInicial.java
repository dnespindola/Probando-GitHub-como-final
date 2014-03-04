package Principal;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Toolkit;

public class InterfazConfiguracionInicial extends JFrame {

	private JPanel jContentPane = null;
	private JLabel jLabelUsuario = null;
	private JLabel jLabelContrasena = null;
	private JLabel jLabelConfirmarContr = null;
	private JTextField jTextFieldUsuario = null;
	private JPasswordField jPasswordFieldContrasena = null;
	private JPasswordField jPasswordFieldRepetir = null;
	private JButton jButtonAceptar = null;
	private JButton jButtonCancelar = null;
	/**
	 * This is the default constructor
	 */
	public InterfazConfiguracionInicial() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(307, 160);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:/trabajos java POO/RiegosCentro/Imagenes/gota.png"));
		this.setTitle("Configuración inicial");
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.gridx = 1;
			gridBagConstraints7.insets = new Insets(11, 0, 0, 0);
			gridBagConstraints7.gridy = 3;
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.gridx = 0;
			gridBagConstraints6.insets = new Insets(11, 0, 0, 0);
			gridBagConstraints6.gridy = 3;
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints5.gridy = 2;
			gridBagConstraints5.weightx = 1.0;
			gridBagConstraints5.insets = new java.awt.Insets(0,2,0,0);
			gridBagConstraints5.gridx = 1;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints4.gridy = 1;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.insets = new java.awt.Insets(0,2,0,0);
			gridBagConstraints4.gridx = 1;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints3.gridy = 0;
			gridBagConstraints3.weightx = 1.0;
			gridBagConstraints3.insets = new java.awt.Insets(0,2,0,0);
			gridBagConstraints3.gridx = 1;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 0;
			gridBagConstraints2.insets = new java.awt.Insets(0,1,0,1);
			gridBagConstraints2.gridy = 2;
			jLabelConfirmarContr = new JLabel();
			jLabelConfirmarContr.setText("Confirmar contraseña");
			jLabelConfirmarContr.setForeground(Color.black);
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints1.insets = new java.awt.Insets(0,1,0,1);
			gridBagConstraints1.gridy = 1;
			jLabelContrasena = new JLabel();
			jLabelContrasena.setText("Contraseña");
			jLabelContrasena.setForeground(Color.black);
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints.insets = new java.awt.Insets(0,1,0,1);
			gridBagConstraints.gridy = 0;
			jLabelUsuario = new JLabel();
			jLabelUsuario.setText("Usuario");
			jLabelUsuario.setForeground(Color.black);
			jContentPane = new JPanel();
			jContentPane.setLayout(new GridBagLayout());
			jContentPane.setBackground(Color.white);
			jContentPane.add(jLabelUsuario, gridBagConstraints);
			jContentPane.add(jLabelContrasena, gridBagConstraints1);
			jContentPane.add(jLabelConfirmarContr, gridBagConstraints2);
			jContentPane.add(getJTextFieldUsuario(), gridBagConstraints3);
			jContentPane.add(getJPasswordFieldContrasena(), gridBagConstraints4);
			jContentPane.add(getJPasswordFieldRepetir(), gridBagConstraints5);
			jContentPane.add(getJButtonAceptar(), gridBagConstraints6);
			jContentPane.add(getJButtonCancelar(), gridBagConstraints7);
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

	/**
	 * This method initializes jPasswordFieldRepetir	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	public JPasswordField getJPasswordFieldRepetir() {
		if (jPasswordFieldRepetir == null) {
			jPasswordFieldRepetir = new JPasswordField();
		}
		return jPasswordFieldRepetir;
	}

	/**
	 * This method initializes jButtonAceptar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonAceptar() {
		if (jButtonAceptar == null) {
			jButtonAceptar = new JButton();
			jButtonAceptar.setText("Confirmar");
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
	 * Pone los botones en escucha
	 * 
	 * @param al
	 */
	public void setListenerButtons (ActionListener al) {
		this.jButtonAceptar.addActionListener(al);
		this.jButtonCancelar.addActionListener(al);	
	}

	public JLabel getJLabelUsuario() {
		return jLabelUsuario;
	}

	public void setJLabelUsuario(JLabel labelUsuario) {
		jLabelUsuario = labelUsuario;
	}

	public JLabel getJLabelContrasena() {
		return jLabelContrasena;
	}

	public void setJLabelContrasena(JLabel labelContrasena) {
		jLabelContrasena = labelContrasena;
	}

	public JLabel getJLabelConfirmarContr() {
		return jLabelConfirmarContr;
	}

	public void setJLabelConfirmarContr(JLabel labelConfirmarContr) {
		jLabelConfirmarContr = labelConfirmarContr;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
