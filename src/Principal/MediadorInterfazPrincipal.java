package Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import CalcularEstructura.MediadorCalcularEstructura;
import CalcularEstructura.MediadorEliminarEstructura;
import GestionarPersona.MediadorBuscarPersona;
import GestionarPersona.MediadorGestionarCliente;


/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 * 
 */

public class MediadorInterfazPrincipal implements ActionListener {
	
	private InterfazPrincipal ip = null;

	/**
	 * @param args
	 */
	public MediadorInterfazPrincipal() {
		super();
		this.ip= new InterfazPrincipal();
		this.ip.setListenerButtons(this);
		this.ip.show();
		this.ip.setLocationRelativeTo(null);
	}


	public void actionPerformed (ActionEvent arg0) {
		Object source = arg0.getSource();
		if (this.ip.getJButtonGestionCliente() == source)   {			
			//System.out.println("Cliente");
			this.cliente();
		}
		if (this.ip.getJButtonCalcularEquipo() == source)   {			
			//System.out.println("Equipo");
			this.equipo();
		}
		if (this.ip.getJButtonPresupuesto() == source){
			//System.out.println("Presupuesto");
			this.presupuesto();
		}
		if (this.ip.getJButtonEmitirFactura() == source){
			//System.out.println("Factura");
			this.factura();
		}
		if (this.ip.getJButtonGestionPrecios()== source){
			//System.out.println("Precios");
			this.precio();
		}
		if (this.ip.getJButtonElimEstructura() == source){
			//System.out.println("Eliminar Estructura");
			this.eliminar();
		}
		if (this.ip.getJButtonBackUp()== source){
			//System.out.println("Backup");
			this.backup();
		}
	}
	
	/**
	 * Llama al calculo de la estructura
	 */
	public void equipo(){
		new MediadorCalcularEstructura();
	}
	
	/**
	 * Llama al gestor de clientes
	 */
	public void cliente(){
		new MediadorGestionarCliente();
	}
	
	/**
	 * Llama al buscador de personas con parametro 1
	 */
	public void factura(){
		new MediadorBuscarPersona(1);
	}
	
	/**
	 * Llama al buscador de personas con parametro 2
	 */
	public void presupuesto(){
		new MediadorBuscarPersona(2);
	}
	
	/**
	 * Llama al mediador precios
	 */
	public void precio(){
		new MediadorPrecios();
	}
	
	/**
	 * Llama al mediador para eliminar estructuras
	 */
	public void eliminar(){
		new MediadorEliminarEstructura();
	}
	
	/**
	 * Llama a la clase que realiza el backup
	 */
	public void backup(){
		new Backup();
	}
}
