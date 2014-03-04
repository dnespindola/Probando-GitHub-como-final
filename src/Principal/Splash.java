package Principal;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.Toolkit;

public class Splash extends JFrame implements Runnable {

	private Thread t;
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JProgressBar jProgressBar = null;

	/**
	 * This is the default constructor
	 */
	public Splash() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(923, 531);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:/trabajos java POO/RiegosCentro/Imagenes/gota.png"));
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
		this.setUndecorated(true);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(1, 1, 923, 531));
			jLabel.setIcon(new ImageIcon("D:/trabajos java POO/riegoscentro/Imagenes/riego1.PNG"));
			jLabel.setText("");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getJProgressBar(), null);
		}
		return jContentPane;
	}

	/**
	 * Permite cargar la barra de progreso en el splash de entrada
	 */
	public void run() {
		try{
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			MediadorAdministracion ma=new MediadorAdministracion();
			for(int i=1;i<=100;i++)
		        {
				 	getJProgressBar().setValue(i);
		            pausa(50);
		        }
			//t.sleep(5000);
			
			this.dispose();
			ma.login();
			//new MediadorInterfazPrincipal();
			
			// TODO Auto-generated method stub
		}
		catch(Exception e){
		}
		
	}
	
	 public void pausa(int mlSeg)
	    {
	        try
	        {
	            // pausa para el splash
	            Thread.sleep(mlSeg);
	        }catch(Exception e){}
	    }

	/**
	 * This method initializes jProgressBar	
	 * 	
	 * @return javax.swing.JProgressBar	
	 */
	private JProgressBar getJProgressBar() {
		if (jProgressBar == null) {
			jProgressBar = new JProgressBar();
			jProgressBar.setBounds(new Rectangle(2, 500, 921, 20));
			jProgressBar.setStringPainted(true);
		}
		return jProgressBar;
	}

}  //  @jve:decl-index=0:visual-constraint="2,3"
