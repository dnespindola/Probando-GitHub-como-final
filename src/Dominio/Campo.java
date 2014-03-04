package Dominio; 
 
public class Campo {
	
	private Long id = null;
 
	private int hectareas;
	 
	private String direccion;	
	 
	private Cliente cliente;
	 
	private int localidadId=0;
		
	public Campo (){
		super();
		id=OidGenerator.getNewId();
	}
	
	public Campo( Cliente cliente, String direccion, int hectareas, int localidad) {
		this.cliente = cliente;
		this.direccion = direccion;
		id=OidGenerator.getNewId();
		this.hectareas = hectareas;
		this.localidadId = localidad;
	}

	/**
	 * @return Returns the cliente.
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente The cliente to set.
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return Returns the direccion.
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion The direccion to set.
	 */ 
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return Returns the hectareas.
	 */
	public int getHectareas() {
		return hectareas;
	}

	/**
	 * @param hectareas The hectareas to set.
	 */
	public void setHectareas(int hectareas) {
		this.hectareas = hectareas;
	}

	/**
	 * @return Returns the localidad.
	 */
	public int getLocalidadId() {
		return localidadId;
	}

	/**
	 * @param localidad The localidad to set.
	 */
	public void setLocalidad(int localidadId) {
		this.localidadId = localidadId;
	}

	/**
	 * @return Returns the id.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id The id to set.
	 */
	public void setId(Long id) {
		this.id = id;
	}	 
}


 
