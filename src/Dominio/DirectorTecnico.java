package Dominio;
public class DirectorTecnico extends Persona {
		private String usuario=null;
		private String contrasena=null;
		private String admin=null; 
		
		public DirectorTecnico(String usuario,String contrasena,String admin){
			this.usuario=usuario;
			this.contrasena=contrasena;
			this.admin=admin;
		}

		/**
		 * @return Returns the admin.
		 */
		public String getAdmin() {
			return admin;
		}

		/**
		 * @param admin The admin to set.
		 */
		public void setAdmin(String admin) {
			this.admin = admin;
		}

		/**
		 * @return Returns the contrasena.
		 */
		public String getContrasena() {
			return contrasena;
		}

		/**
		 * @param contrasena The contrasena to set.
		 */
		public void setContrasena(String contrasena) {
			this.contrasena = contrasena;
		}

		/**
		 * @return Returns the usuario.
		 */
		public String getUsuario() {
			return usuario;
		}

		/**
		 * @param usuario The usuario to set.
		 */
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		
		
		
}
 
