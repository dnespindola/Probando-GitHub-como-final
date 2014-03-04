package Dominio;

public class InventarioBoquilla {

	private Long id = null;
	private int numBoquilla;
	private int nroPico;
	private String color;
	private double precipReal;
	private double precipNominal;
	private Equipo equipo;
	
	public InventarioBoquilla(String color, int pico, int boquilla, double nominal, double real, Equipo equipo) {
		id=OidGenerator.getNewId();
		this.color = color;
		nroPico = pico;
		numBoquilla = boquilla;
		precipNominal = nominal;
		precipReal = real;
		this.equipo=equipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNroPico() {
		return nroPico;
	}

	public void setNroPico(int nroPico) {
		this.nroPico = nroPico;
	}

	public int getNumBoquilla() {
		return numBoquilla;
	}

	public void setNumBoquilla(int numBoquilla) {
		this.numBoquilla = numBoquilla;
	}

	public double getPrecipNominal() {
		return precipNominal;
	}

	public void setPrecipNominal(double precipNominal) {
		this.precipNominal = precipNominal;
	}

	public double getPrecipReal() {
		return precipReal;
	}

	public void setPrecipReal(double precipReal) {
		this.precipReal = precipReal;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
