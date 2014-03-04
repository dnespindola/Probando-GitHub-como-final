package Dominio;

public class Factura {
	
	private Long id = null;
 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private float precio;
	
	private Presupuesto presupuesto;
	

	public Factura() {
		id=OidGenerator.getNewId();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numero
	 * @param presupuesto
	 */
	public Factura(float precio, Presupuesto presupuesto) {
		// TODO Auto-generated constructor stub
		this.precio = precio;
		id=OidGenerator.getNewId();
		this.presupuesto=presupuesto;
		
	}

	/**
	 * @return Returns the numero.
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * @param numero The numero to set.
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/**
	 * @return Returns the presupuesto.
	 */
	public Presupuesto getPresupuesto() {
		return presupuesto;
	}

	/**
	 * @param presupuesto The presupuesto to set.
	 */
	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}

	
}
 
