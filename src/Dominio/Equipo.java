package Dominio;
import java.util.HashSet;
import java.util.Set;

public class Equipo {
	
	private Long id = null; 
	
	private int horasIrrigacion;	
	
	private int consumoAgua;	
	
	private int anguloIrrigacion;	
	
	private int precipitacionMinima;	
	
	private double presionConexion;	
	
	private double bajoRiego;	 
	
	private int caudal;	
	
	private Campo campo;	
	
	private String tablero;	
	
	private boolean transportable;	
	
	private String tipoBoquilla;	 
	
	private int boquillasAnuladas;	
	
	private Neumatico rodado;	
	
	private Aspersor aspersor;	
	
	private EstructuraDeTuberia estructuraDeTuberia;	
	
	private Motor motor;	
	
	private Valvula valvula;	
	
	private Set inventario;
	
	
	
	public Equipo() {
		inventario = new HashSet();
		id=OidGenerator.getNewId();
		// TODO Auto-generated constructor stub
	}
	
	public void addInventario(InventarioBoquilla inv){
        inventario.add(inv);
    }
	
	public int getHorasIrrigacion() {
		return horasIrrigacion;
	}

	public void setHorasIrrigacion(int horasIrrigacion) {
		this.horasIrrigacion = horasIrrigacion;
	}

	public int getConsumoAgua() {
		return consumoAgua;
	}

	public void setConsumoAgua(int consumoAgua) {
		this.consumoAgua = consumoAgua;
	}

	public int getAnguloIrrigacion() {
		return anguloIrrigacion;
	}

	public void setAnguloIrrigacion(int anguloIrrigacion) {
		this.anguloIrrigacion = anguloIrrigacion;
	}

	public int getPrecipitacionMinima() {
		return precipitacionMinima;
	}

	public void setPrecipitacionMinima(int precipitacionMinima) {
		this.precipitacionMinima = precipitacionMinima;
	}

	public double getPresionConexion() {
		return presionConexion;
	}

	public void setPresionConexion(double presionConexion) {
		this.presionConexion = presionConexion;
	}

	public double getBajoRiego() {
		return bajoRiego;
	}

	public void setBajoRiego(double bajoRiego) {
		this.bajoRiego = bajoRiego;
	}

	public int getCaudal() {
		return caudal;
	}

	public void setCaudal(int caudal) {
		this.caudal = caudal;
	}
	
	public String getTablero(){
		return tablero;
	}
	
	public void setTablero(String tablero){
		this.tablero = tablero;
	}

	/**
	 * @return Returns the transportable.
	 */
	public boolean isTransportable() {
		return transportable;
	}

	/**
	 * @param transportable The transportable to set.
	 */
	public void setTransportable(boolean transportable) {
		this.transportable = transportable;
	}
	
	public String getTipoBoquilla() {
		return tipoBoquilla;
	}

	public void setTipoBoquilla(String tipoBoquilla) {
		this.tipoBoquilla = tipoBoquilla;
	}

	public int getBoquillasAnuladas() {
		return boquillasAnuladas;
	}

	public void setBoquillasAnuladas(int boquillasAnuladas) {
		this.boquillasAnuladas = boquillasAnuladas;
	}


	/**
	 * @return Returns the motor.
	 */
	public Motor getMotor() {
		return motor;
	}

	/**
	 * @param motor The motor to set.
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Neumatico getRodado() {
		return rodado;
	}

	public void setRodado(Neumatico rodado) {
		this.rodado = rodado;
	}

	public Aspersor getAspersor() {
		return aspersor;
	}

	public void setAspersor(Aspersor aspersor) {
		this.aspersor = aspersor;
	}

	public EstructuraDeTuberia getEstructuraDeTuberia() {
		return estructuraDeTuberia;
	}

	public void setEstructuraDeTuberia(EstructuraDeTuberia estructuraDeTuberia) {
		this.estructuraDeTuberia = estructuraDeTuberia;
	}

	public Valvula getValvula() {
		return valvula;
	}

	public void setValvula(Valvula valvula) {
		this.valvula = valvula;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return Returns the campo.
	 */
	public Campo getCampo() {
		return campo;
	}

	/**
	 * @param campo The campo to set.
	 */
	public void setCampo(Campo campo) {
		this.campo = campo;
	}
	
	
	
	
}
 
