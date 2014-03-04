package Dominio;

public class IwobDatos {
	private int nroBoquilla;
	private double diam;
	private String color;
	private double psi6;
	private double psi10;
	private double psi15;
	private double psi20;
	private double psi0;

	
	
	/**
	 * @return Returns the psi0.
	 */
	public double getPsi0() {
		return psi0;
	}

	/**
	 * @param psi0 The psi0 to set.
	 */
	public void setPsi0(double psi0) {
		this.psi0 = psi0;
	}

	public IwobDatos(String color, int boquilla) {
		// TODO Auto-generated constructor stub
		this.color = color;
		nroBoquilla = boquilla;
	}

	public int getNroBoquilla() {
		return nroBoquilla;
	}

	public void setNroBoquilla(int nroBoquilla) {
		this.nroBoquilla = nroBoquilla;
	}

	public double getDiam() {
		return diam;
	}

	public void setDiam(double diam) {
		this.diam = diam;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPsi6() {
		return psi6;
	}

	public void setPsi6(double psi6) {
		this.psi6 = psi6;
	}

	public double getPsi10() {
		return psi10;
	}

	public void setPsi10(double psi10) {
		this.psi10 = psi10;
	}

	public double getPsi15() {
		return psi15;
	}

	public void setPsi15(double psi15) {
		this.psi15 = psi15;
	}

	public double getPsi20() {
		return psi20;
	}

	public void setPsi20(double psi20) {
		this.psi20 = psi20;
	}

}



