package Dominio;
import java.util.HashSet;
import java.util.Set;
  
public class Presupuesto {
	
	private Long id = null;
	 
	private float total;
	
	private Equipo equipo;
	
	
	public Presupuesto(){
		id=OidGenerator.getNewId();
	}
	/**
	 * @param terciarizada
	 * @param pago
	 * @param total
	 */
	public Presupuesto(float total,Equipo equipo) {
		// TODO Auto-generated constructor stub
		this.total = total;
		this.equipo = equipo;
		id=OidGenerator.getNewId();
	}

	/**
	 * @return Returns the equipo.
	 */

	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	/**
	 * @return Returns the equipo.
	 */
	public Equipo getEquipo() {
		return equipo;
	}
	/**
	 * @param equipo The equipo to set.
	 */
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
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
 
