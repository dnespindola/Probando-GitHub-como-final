package Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import CalcularEstructura.Validar;
import BaseDeDatos.*;
import Dominio.DirectorTecnico;
import Dominio.OidGenerator;
import java.awt.Dimension;


/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 * 
 */

public class MediadorAdministracion implements ActionListener{
	
	private Persistencia obP=null;
	private InterfazConfiguracionInicial ici=null;  //  @jve:decl-index=0:visual-constraint="153,18"
	private Validar va=new Validar();  //  @jve:decl-index=0:
	
	public MediadorAdministracion(){
		obP = new Persistencia();
		OidGenerator.init(obP.getPm().getPersistenceManagerFactory());
	}
	/**
	 * Abre la ventana de configuracion inicial si no esta el admin agregado
	 * en caso contrario abre la ventana para loguearse.
	 */
	public void login(){
		Vector director=null;
		try{
			director =this.obP.filtrarDatos(DirectorTecnico.class, "admin==\"si\"");
		}
		catch(Exception e){
			e.printStackTrace();
			this.obP.rollback();
			this.obP.close();
		}
		if (director.size()==0){ //configuracion inicial
			ici = new InterfazConfiguracionInicial();
			ici.setLocationRelativeTo(null);
			ici.setListenerButtons(this);
			ici.setSize(new Dimension(235, 136));
			ici.setVisible(true);
		}
		else{ //login usuario
			new MediadorLogin();
		}
	}
	
	/**
	 * Si es "aceptar" crea el admin y abre la interfaz principal
	 */
	public void actionPerformed(ActionEvent arg0) {
		Object source = arg0.getSource();
		if (this.ici.getJButtonAceptar() == source){
			if(va.validarAdministrador(ici)){
				this.crearAdmin();
				//Modi Spin 24-08-2012 - Carga interfaz principal sin estar correcto el administrador
				//new MediadorInterfazPrincipal();
			}	
		}	
		if (this.ici.getJButtonCancelar() == source){
			this.ici.dispose();
		}
	}
	
	/**
	 * Realiza los controles de los datos del admin en la configuracion inicial
	 * y lo inserta en la base de datos
	 */
	public void crearAdmin(){
		String usuario=this.ici.getJTextFieldUsuario().getText();
		String contrasena=this.ici.getJPasswordFieldContrasena().getText();
		String repcontrasena=this.ici.getJPasswordFieldRepetir().getText();
		if (!(contrasena.equalsIgnoreCase(repcontrasena))){
			JOptionPane.showMessageDialog(null,"Las contraseñas ingresadas son distintas","Error",JOptionPane.ERROR_MESSAGE);
		}
		else{
			DirectorTecnico dt=new DirectorTecnico(usuario,contrasena,"si");
			try{
				obP.insertar(dt);
				obP.commit();
			}
			catch(Exception e){
				e.printStackTrace();
				this.obP.rollback();
			}
			finally{
				obP.close();
			}
			//Modi Spin 24-08-2012 - Carga interfaz principal sin estar correcto el administrador
			this.ici.dispose();
			new MediadorInterfazPrincipal();
		}		
	}
}
