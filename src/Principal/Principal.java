package Principal;

public class Principal {

	/**
	 * @param args Clase Principal, llama al thread y al mediador de administracion
	 */
	public static void main(String[] args) {
		new Thread (new Splash()).start();
		//new MediadorAdministracion();
		//MediadorMenuPrincipal imp=new MediadorMenuPrincipal();
		// TODO Auto-generated method stub
	}
}
