package Dominio;
 
import java.util.HashSet;
import java.util.Set;

/**
 * @author RiegosCentro 
 *
 */
public class Cliente extends Persona {
	
	private Long id = null;
 
	private String mail;
	

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	private Set campo;
	
	private String telefono=null;

	public Cliente (){
		super();
		campo = new HashSet();
		id=OidGenerator.getNewId();
	}
	
	/**
	 * @param campo
	 * @param mail
	 */
	public Cliente(String mail, String tel) {
		// TODO Auto-generated constructor stub
		this.campo = campo;
		campo = new HashSet();
		id=OidGenerator.getNewId();
		this.mail = mail;
		this.telefono = tel; 
	}

	/**
	 * @return Returns the campo.
	 */
	public Set getCampo() {
		return campo;
	}

	/**
	 * @param campo The campo to set.
	 */
	public void setCampo(Set campo) {
		this.campo = campo;
	}

	/**
	 * @return Returns the mail.
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail The mail to set.
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public void addCampo(Campo camp){
        campo.add(camp);
    }
	
	/**
	 * Metodo que elimina una persona dell conjunto de personas que pertenecen a una misma localidad.
	 */
    public void removeCampo(Campo camp){
    	campo.remove(camp);
    }

    /**
	 * @return Returns the telefono.
	 */
	public String getTel() {
		return telefono;
	}

	/**
	 * @param tel The tel to set.
	 */
	public void setTel(String tel) {
		this.telefono = tel;
	}	
}
 
