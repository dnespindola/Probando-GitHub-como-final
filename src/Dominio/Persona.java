package Dominio;
 
public class Persona {
	
	private Long id = null;
 
	private String nombre;
	 
	private String apellido;
	
	private String tipo;
	 
	private String dni;
	
	private int localidadId=0;
	
	 
	public int getLocalidadId() {
		return localidadId;
	}

	public void setLocalidadId(int localidadId) {
		this.localidadId = localidadId;
	}


	/**
	 * @param apellido
	 * @param dni
	 * @param localidad
	 * @param nombre
	 * @param tipo
	 */
	public Persona() {
		id=OidGenerator.getNewId();
	}

	/**
	 * @return Returns the apellido.
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido The apellido to set.
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return Returns the dni.
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni The dni to set.
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return Returns the nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre The nombre to set.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return Returns the tipo.
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo The tipo to set.
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return Returns the id.
	 */
	public Long getId() {
		return id;
	}
	 
}
 
