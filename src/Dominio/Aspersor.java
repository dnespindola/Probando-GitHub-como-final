package Dominio;
 
public class Aspersor {
	
	private Long id = null;
	
	private double distanciaEntreAspersor;
	
	private double distanciaPiso;
	
	private double presionAspersor;	
	
	public Aspersor() {	
		super();	
		id=OidGenerator.getNewId();
	}

	/**
	 * @param boquilla
	 * @param aspersor
	 * @param piso
	 * @param id
	 * @param tipo
	 */
	public Aspersor(/*Boquilla boquilla,*/ int aspersor, int piso) {
		// TODO Auto-generated constructor stub
		//this.boquilla = boquilla;
		distanciaEntreAspersor = aspersor;
		distanciaPiso = piso;
		id=OidGenerator.getNewId();
		//this.tipo = tipo;
	}

	public double getDistanciaEntreAspersor() {
		return distanciaEntreAspersor;
	}

	public void setDistanciaEntreAspersor(double distanciaEntreAspersor) {
		this.distanciaEntreAspersor = distanciaEntreAspersor;
	}

	public double getDistanciaPiso() {
		return distanciaPiso;
	}

	public void setDistanciaPiso(double distanciaPiso) {
		this.distanciaPiso = distanciaPiso;
	}
	
	public double getPresionAspersor(){
		return presionAspersor;
	}
	
	public void setPresionAspersor(double presionAspersor){
		this.presionAspersor=presionAspersor;
	}

	/*public Boquilla getBoquilla() {
		return boquilla;
	}

	public void setBoquilla(Boquilla boquilla) {
		this.boquilla = boquilla;
	}*/
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	 
}
 
