package CalcularEstructura;

import javax.swing.JPanel;
import java.awt.Frame;
import java.awt.BorderLayout;
import javax.swing.JDialog;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;

public class InterfazEliminarEstructura extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JScrollPane jScrollPane = null;
	private JTable jTable = null;
	private JButton jButton1ElimTodo = null;
	private JButton jButtonElimSelec = null;
	private JButton jButtonCanelar;
	/**
	 * @param owner
	 */
	public InterfazEliminarEstructura() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\trabajos java POO\\riegoscentro\\Imagenes\\gota.png"));
		setTitle("Eliminar estructura/s");
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(662, 500);
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 1;
			gridBagConstraints.insets = new Insets(0, 148, 0, 5);
			gridBagConstraints.gridy = 2;
			GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
			gridBagConstraints9.anchor = GridBagConstraints.WEST;
			gridBagConstraints9.gridx = 3;
			gridBagConstraints9.insets = new Insets(0, 0, 0, 88);
			gridBagConstraints9.gridy = 2;
			GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
			gridBagConstraints8.insets = new Insets(0, 0, 5, 5);
			gridBagConstraints8.fill = GridBagConstraints.BOTH;
			gridBagConstraints8.gridy = 1;
			gridBagConstraints8.ipadx = 146;
			gridBagConstraints8.ipady = -173;
			gridBagConstraints8.weightx = 1.0;
			gridBagConstraints8.weighty = 1.0;
			gridBagConstraints8.gridwidth = 4;
			gridBagConstraints8.gridx = 1;
			jContentPane = new JPanel();
			jContentPane.setBackground(Color.WHITE);
			jContentPane.setLayout(new GridBagLayout());
			jContentPane.add(getJScrollPane(), gridBagConstraints8);
			jContentPane.add(getJButton1ElimTodo(), gridBagConstraints9);
			jContentPane.add(getJButtonElimSelec(), gridBagConstraints);
			GridBagConstraints gbc_jButtonCanelar = new GridBagConstraints();
			gbc_jButtonCanelar.gridx = 4;
			gbc_jButtonCanelar.gridy = 2;
			jContentPane.add(getJButtonCanelar(), gbc_jButtonCanelar);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getJTable());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTable	
	 * 	
	 * @return javax.swing.JTable	
	 */
	public JTable getJTable() {
		if (jTable == null) {
			jTable = new JTable();
		}
		return jTable;
	}

	/**
	 * This method initializes jButton1ElimTodo	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButton1ElimTodo() {
		if (jButton1ElimTodo == null) {
			jButton1ElimTodo = new JButton();
			jButton1ElimTodo.setIcon(new ImageIcon(InterfazEliminarEstructura.class.getResource("/org/jdesktop/application/resources/icons/delete.png")));
			jButton1ElimTodo.setFont(new Font("Tahoma", Font.BOLD, 11));
			jButton1ElimTodo.setText("Eliminar todo");
		}
		return jButton1ElimTodo;
	}

	/**
	 * This method initializes jButtonElimSelec	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonElimSelec() {
		if (jButtonElimSelec == null) {
			jButtonElimSelec = new JButton();
			jButtonElimSelec.setIcon(new ImageIcon(InterfazEliminarEstructura.class.getResource("/org/hsqldb/util/Clear.png")));
			jButtonElimSelec.setText("Eliminar selección");
		}
		return jButtonElimSelec;
	}

	public void setListenerButtons (ActionListener al) {
		this.jButtonElimSelec.addActionListener(al);
		this.jButton1ElimTodo.addActionListener(al);
		this.jButtonCanelar.addActionListener(al);
	}
	
	public JButton getJButtonCanelar() {
		if (jButtonCanelar == null) {
			jButtonCanelar = new JButton("Canelar");
		}
		return jButtonCanelar;
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"
