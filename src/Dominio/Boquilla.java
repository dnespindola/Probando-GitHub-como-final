package Dominio;

public class Boquilla {
	
	private Long id = null;
 
	private String tipo;
	 
	private int boquillasAnuladas;
	 
	private Aspersor aspersor;
	
	
	
	public Boquilla() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param aspersor
	 * @param anuladas
	 * @param id
	 * @param presupuesto
	 * @param tipo
	 */
	public Boquilla(Aspersor aspersor, int anuladas, String tipo) {
		// TODO Auto-generated constructor stub
		this.aspersor = aspersor;
		boquillasAnuladas = anuladas;
		id=OidGenerator.getNewId();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getBoquillasAnuladas() {
		return boquillasAnuladas;
	}

	public void setBoquillasAnuladas(int boquillasAnuladas) {
		this.boquillasAnuladas = boquillasAnuladas;
	}

	public Aspersor getAspersor() {
		return aspersor;
	}

	public void setAspersor(Aspersor aspersor) {
		this.aspersor = aspersor;
	}
	
	
	 
}
 
