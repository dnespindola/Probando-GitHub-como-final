package Dominio;

import java.util.Vector;

public class EstructuraDeTuberia {
	
	private Long id = null;
	
	private int diamTuberia1;
	
	private int diamTuberia2 = 168;
	
	private int diamTuberia3 = 168;

	private int cantidad1;

	private int cantidad2;

	private int cantidad3;
	 
	private double longitud1;
	 
	private double longitud2;
	 
	private double longitud3;
	
	private double longitudTotal;
	 
	private String tipo;
	 
	private int voladizo;
	
	private int canon;
	
	public EstructuraDeTuberia (){
		id=OidGenerator.getNewId();
	}
	
	/**
	 * @param canon
	 * @param cantidad
	 * @param tuberia
	 * @param longitud
	 * @param total
	 * @param presupuesto
	 * @param canon2
	 * @param tipo
	 * @param voladizo
	 */
	public EstructuraDeTuberia(int canon, int cantidad1, int cantidad2,int cantidad3, int tuberia1, double longitud1, double longitud2, double longitud3, double total, String tipo, int voladizo) {
		// TODO Auto-generated constructor stub
		this.canon = canon;
		this.cantidad1 = cantidad1;
		this.cantidad2 = cantidad2;
		this.cantidad2 = cantidad2;
		this.diamTuberia1 = tuberia1;
		this.longitud1 = longitud1;
		this.longitud2 = longitud2;
		this.longitud3 = longitud3;
		longitudTotal = total;
		id=OidGenerator.getNewId();
		this.tipo = tipo;
		this.voladizo = voladizo;
	}

	public int getDiamTuberia1() {
		return diamTuberia1;
	}

	public void setDiamTuberia1(int diamTuberia) {
		this.diamTuberia1 = diamTuberia;
	}

	public int getDiamTuberia2() {
		return diamTuberia2;
	}

	/*public void setDiamTuberia2(int diamTuberia) {
		this.diamTuberia2 = diamTuberia;
	}*/
	public int getDiamTuberia3() {
		return diamTuberia3;
	}

	/*public void setDiamTuberia3(int diamTuberia) {
		this.diamTuberia3 = diamTuberia;
	}*/
	
	public int getCantidad1() {		
		return cantidad1;
	}
	
	public void setCantidad1(int cantidad) {
		this.cantidad1 = cantidad;
	}
	
	public int getCantidad2() {		
		return cantidad2;
	}
	
	public void setCantidad2(int cantidad) {
		this.cantidad2 = cantidad;
	}
	
	public int getCantidad3() {		
		return cantidad3;
	}
	
	public void setCantidad3(int cantidad) {
		this.cantidad3 = cantidad;
	}

	public double getLongitud1() {		
		return longitud1;		
	}

	public void setLongitud1(double longitud) {
		this.longitud1 = longitud;
	}
	
	public double getLongitud2() {		
		return longitud2;		
	}

	public void setLongitud2(double longitud) {
		this.longitud2 = longitud;
	}
	
	public double getLongitud3() {		
		return longitud3;		
	}

	public void setLongitud3(double longitud) {
		this.longitud3 = longitud;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getVoladizo() {
		return voladizo;
	}

	public void setVoladizo(int voladizo) {
		this.voladizo = voladizo;
	}

	public double getLongitudTotal() {
		return longitudTotal;
	}

	public void setLongitudTotal(double longitudTotal) {
		this.longitudTotal = longitudTotal;
	}

	public int getCanon() {
		return canon;
	}

	public void setCanon(int canon) {
		this.canon = canon;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	 
	
}
 
