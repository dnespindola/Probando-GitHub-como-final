package Dominio;

public class Neumatico {
	
	private Long id = null;
 
	private String diametro;
	
	
	public Neumatico() {
		id=OidGenerator.getNewId();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param diametro
	 * @param equipo
	 * @param presupuesto
	 */
	public Neumatico(String diametro) {
		// TODO Auto-generated constructor stub
		this.diametro = diametro;
		id=OidGenerator.getNewId();
	}

	public String getDiametro() {
		return diametro;
	}

	public void setDiametro(String diametro) {
		this.diametro = diametro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
 
