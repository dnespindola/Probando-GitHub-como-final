package Dominio;
  
public class Valvula {
	
	private Long id = null;
	
	//private boolean reductora;
	
	private int reguladorPresion;
	private String tipoReductor;
	
	
	public Valvula() {
		id=OidGenerator.getNewId();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param equipo	
	 * @param presion
	 */
	public Valvula(int presion, String reductor) {
		// TODO Auto-generated constructor stub
		id=OidGenerator.getNewId();
		this.reguladorPresion = presion;
		this.tipoReductor=reductor;
	}

	public int getReguladorPresion() {
		return reguladorPresion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setReguladorPresion(int reguladorPresion) {
		this.reguladorPresion = reguladorPresion;
	}

	public String getTipoReductor() {
		return tipoReductor;
	}

	public void setTipoReductor(String tipoReductor) {
		this.tipoReductor = tipoReductor;
	}
	
	
	
}
 
