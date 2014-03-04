package Dominio;

public class Motor {
	
	private Long id = null;
 
	private String tipo;
	
	
	
	public Motor() {
		id=OidGenerator.getNewId();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param equipo
	 * @param presupuesto
	 * @param tipo
	 */
	public Motor(String tipo) {
		// TODO Auto-generated constructor stub
		id=OidGenerator.getNewId();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
 
