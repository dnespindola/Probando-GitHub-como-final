package Principal;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;

public class InterfazPrincipal extends JFrame {

	private JPanel jContentPane = null;
	private JButton jButtonGestionCliente = null;
	private JButton jButtonCalcularEquipo = null;
	private JButton jButtonPresupuesto = null;
	private JButton jButtonEmitirFactura = null;
	private JButton jButtonGestionPrecios = null;
	private JButton jButtonElimEstructura = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JButton jButtonBackUp = null;
	private JLabel jLabelBackup = null;
	private JLabel jLabelFondo = null;
	/**
	 * This is the default constructor
	 */
	public InterfazPrincipal() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(520, 553);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:/trabajos java POO/RiegosCentro/Imagenes/gota.png"));
		this.setContentPane(getJContentPane());
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setTitle("Riegos del centro");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelFondo = new JLabel();
			jLabelFondo.setBounds(new java.awt.Rectangle(1,1,502,513));
			jLabelFondo.setIcon(new ImageIcon("D:/trabajos java POO/riegoscentro/Imagenes/fondo.png"));
			jLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			jLabelFondo.setForeground(Color.black);
			jLabelFondo.setText("");
			jLabelBackup = new JLabel();
			jLabelBackup.setBounds(new java.awt.Rectangle(50,470,91,16));
			jLabelBackup.setText("Backup");
			jLabelBackup.setFont(new Font("Dialog", Font.BOLD, 12));
			jLabelBackup.setVisible(false);
			jLabel5 = new JLabel();
			jLabel5.setBounds(new java.awt.Rectangle(317,319,113,16));
			jLabel5.setText("Eliminar Estructura");
			jLabel5.setVisible(false);
			jLabel4 = new JLabel();
			jLabel4.setBounds(new java.awt.Rectangle(187,319,98,16));
			jLabel4.setText("Gestión Precios");
			jLabel4.setVisible(false);
			jLabel3 = new JLabel();
			jLabel3.setBounds(new java.awt.Rectangle(45,319,98,16));
			jLabel3.setText("Emitir Factura");
			jLabel3.setVisible(false);
			jLabel2 = new JLabel();
			jLabel2.setBounds(new java.awt.Rectangle(316,168,117,16));
			jLabel2.setText("Emitir Presupuesto");
			jLabel2.setVisible(false);
			jLabel1 = new JLabel();
			jLabel1.setBounds(new java.awt.Rectangle(187,168,98,16));
			jLabel1.setText("Calcular Equipo");
			jLabel1.setVisible(false);
			jLabel = new JLabel();
			jLabel.setBounds(new java.awt.Rectangle(45,168,98,16));
			jLabel.setText("Gestión Cliente");
			jLabel.setVisible(false);
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(java.awt.Color.white);
			jContentPane.add(getJButtonGestionCliente(), null);
			jContentPane.add(getJButtonCalcularEquipo(), null);
			jContentPane.add(getJButtonPresupuesto(), null);
			jContentPane.add(getJButtonEmitirFactura(), null);
			jContentPane.add(getJButtonGestionPrecios(), null);
			jContentPane.add(getJButtonElimEstructura(), null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabel5, null);
			jContentPane.setVisible(true);
			jContentPane.add(getJButtonBackUp(), null);
			jContentPane.add(jLabelBackup, null);
			jContentPane.add(jLabelFondo, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jButtonGestionCliente	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonGestionCliente() {
		if (jButtonGestionCliente == null) {
			jButtonGestionCliente = new JButton();
			jButtonGestionCliente.setIcon(new ImageIcon("D:/trabajos java POO/riegoscentro/Imagenes/clientes2.png"));
			jButtonGestionCliente.setSize(new java.awt.Dimension(116,123));
			jButtonGestionCliente.setLocation(new java.awt.Point(32,40));
			jButtonGestionCliente.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mouseExited(java.awt.event.MouseEvent e) {    
					jLabel.setVisible(false); 
				}
				public void mouseEntered(java.awt.event.MouseEvent e) {
					jLabel.setVisible(true); 
				}
			});			
		}
		return jButtonGestionCliente;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonCalcularEquipo() {
		if (jButtonCalcularEquipo == null) {
			jButtonCalcularEquipo = new JButton();
			jButtonCalcularEquipo.setLocation(new java.awt.Point(175,40));
			jButtonCalcularEquipo.setIcon(new ImageIcon("D:/trabajos java POO/riegoscentro/Imagenes/calcular est2.png"));
			jButtonCalcularEquipo.setSize(new java.awt.Dimension(116,123));
			jButtonCalcularEquipo.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mouseExited(java.awt.event.MouseEvent e) {    
					jLabel1.setVisible(false); 
				}
				public void mouseEntered(java.awt.event.MouseEvent e) {
					jLabel1.setVisible(true); 
				}
			});
		}
		return jButtonCalcularEquipo;
	}

	/**
	 * This method initializes jButtonPresupuesto	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonPresupuesto() {
		if (jButtonPresupuesto == null) {
			jButtonPresupuesto = new JButton();
			jButtonPresupuesto.setLocation(new java.awt.Point(315,40));
			jButtonPresupuesto.setIcon(new ImageIcon("D:/trabajos java POO/riegoscentro/Imagenes/presupuesto2.png"));
			jButtonPresupuesto.setSize(new java.awt.Dimension(116,123));
			jButtonPresupuesto.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mouseExited(java.awt.event.MouseEvent e) {    
					jLabel2.setVisible(false); 
				}
				public void mouseEntered(java.awt.event.MouseEvent e) {
					jLabel2.setVisible(true); 
				}
			});
		}
		return jButtonPresupuesto;
	}

	/**
	 * This method initializes jButtonEmitirFactura	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonEmitirFactura() {
		if (jButtonEmitirFactura == null) {
			jButtonEmitirFactura = new JButton();
			jButtonEmitirFactura.setLocation(new java.awt.Point(32,191));
			jButtonEmitirFactura.setIcon(new ImageIcon("D:/trabajos java POO/riegoscentro/Imagenes/factura2.png"));
			jButtonEmitirFactura.setSize(new java.awt.Dimension(116,123));
			jButtonEmitirFactura.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mouseExited(java.awt.event.MouseEvent e) {    
					jLabel3.setVisible(false); 
				}
				public void mouseEntered(java.awt.event.MouseEvent e) {
					jLabel3.setVisible(true); 
				}
			});
		}
		return jButtonEmitirFactura;
	}

	/**
	 * This method initializes jButtonGestionPrecios	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonGestionPrecios() {
		if (jButtonGestionPrecios == null) {
			jButtonGestionPrecios = new JButton();
			jButtonGestionPrecios.setPreferredSize(new java.awt.Dimension(123,85));
			jButtonGestionPrecios.setIcon(new ImageIcon("D:/trabajos java POO/riegoscentro/Imagenes/precios2.png"));
			jButtonGestionPrecios.setBounds(new java.awt.Rectangle(175,191,116,123));
			jButtonGestionPrecios.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mouseExited(java.awt.event.MouseEvent e) {    
					jLabel4.setVisible(false); 
				}
				public void mouseEntered(java.awt.event.MouseEvent e) {
					jLabel4.setVisible(true); 
				}
			});
		}
		return jButtonGestionPrecios;
	}

	/**
	 * This method initializes jButtonElimEstructura	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonElimEstructura() {
		if (jButtonElimEstructura == null) {
			jButtonElimEstructura = new JButton();
			jButtonElimEstructura.setBounds(new java.awt.Rectangle(316,191,116,123));
			jButtonElimEstructura.setIcon(new ImageIcon("D:/trabajos java POO/riegoscentro/Imagenes/eliminar est2.png"));
			jButtonElimEstructura.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mouseExited(java.awt.event.MouseEvent e) {    
					jLabel5.setVisible(false); 
				}
				public void mouseEntered(java.awt.event.MouseEvent e) {
					jLabel5.setVisible(true); 
				}
			});
		}
		return jButtonElimEstructura;
	}
	
	public void setListenerButtons (ActionListener al) {
		this.jButtonGestionCliente.addActionListener(al);
		this.jButtonCalcularEquipo.addActionListener(al);
		this.jButtonPresupuesto.addActionListener(al);
		this.jButtonEmitirFactura.addActionListener(al);
		this.jButtonGestionPrecios.addActionListener(al);
		this.jButtonElimEstructura.addActionListener(al);
		this.jButtonBackUp.addActionListener(al);
	}

	/**
	 * This method initializes jButtonBackUp	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButtonBackUp() {
		if (jButtonBackUp == null) {
			jButtonBackUp = new JButton();
			jButtonBackUp.setBounds(new java.awt.Rectangle(32,342,116,123));
			jButtonBackUp.setIcon(new ImageIcon("D:/trabajos java POO/riegoscentro/Imagenes/back up2.png"));
			jButtonBackUp.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mouseExited(java.awt.event.MouseEvent e) {    
					jLabelBackup.setVisible(false); 
				}
				public void mouseEntered(java.awt.event.MouseEvent e) {
					jLabelBackup.setVisible(true); 
				}
			});
		}
		return jButtonBackUp;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
