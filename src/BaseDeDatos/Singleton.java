package BaseDeDatos;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;
/**
 * clase Singleton 
 */
public class Singleton {
	private static PersistenceManagerFactory pmf = null;
	public static PersistenceManagerFactory getPmf() {
		if (pmf==null){	   
		    pmf = JDOHelper.getPersistenceManagerFactory("jpox.properties");		     
		}	     
		return pmf;   
	}
}
/**
 * end de la clase Singleton
 */
