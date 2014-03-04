package Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import BaseDeDatos.Persistencia;
import CalcularEstructura.Validar;
import Dominio.DirectorTecnico;
import Dominio.OidGenerator;

/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 * 
 */

public class MediadorLogin implements ActionListener{

	private InterfazLogin il=null;
	private Persistencia obP=null;
	private Validar va=new Validar();
	
	/**
	 * Constructor de la clase
	 */
	public MediadorLogin() { 
		il = new InterfazLogin();
		il.setLocationRelativeTo(null);
		il.setListenerButtons(this); 
		il.setVisible(true);
		obP = new Persistencia();
		OidGenerator.init(obP.getPm().getPersistenceManagerFactory());
	}

	/**
	 * Llama a la interfaz principal en caso de que el login sea correcto,
	 * caso contrario arroja un error
	 */
	public void actionPerformed(ActionEvent arg0) {
		Object source = arg0.getSource();
		if (this.il.getJButtonAceptar() == source){
			if(va.validarLogin(il)){
				String usuario=this.il.getJTextFieldUsuario().getText();
				String contrasena=this.il.getJPasswordFieldContrasena().getText();
				DirectorTecnico director=null;
				try{
					director =(DirectorTecnico)this.obP.getObjeto(DirectorTecnico.class, "usuario==\""+usuario+"\"");
				}
				catch(Exception e){
					e.printStackTrace();
					this.obP.rollback();
					this.obP.close();
				}
				if (director!=null && director.getContrasena().equals(contrasena)){
					this.il.dispose();
					new MediadorInterfazPrincipal();
				}
				else {
					JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}
}
