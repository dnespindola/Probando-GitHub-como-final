package BaseDeDatos;


import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;


public class Persistencia {
	
	PersistenceManager pm ;
	Transaction tx; 
	
	
	/**
	 * @since Metodo constructor de la clase. 
	 */
	public Persistencia(){
		pm = Singleton.getPmf().getPersistenceManager();
	    tx = pm.currentTransaction();
	    tx.begin();
	}
	
	
	/**
	 * @throws Metodo que se encarga de realizar el commit.
	 */
    public void commit() throws Exception {
    	try {
    		tx.commit(); 
    	} 
    	catch (Exception e) {
    		throw e;	
    	}
    }
    
    
	/**
	 * @throws Metodo que se encarga de realizar de cerrar la conexion.
	 */
    public void close() {
    	try {
    		pm.close();
		} 
    	catch (RuntimeException e) {
			e.printStackTrace();
		}
    }
    
    
	/**
	 * @throws Metodo que se encarga de realizar el rollback.
	 */
    public void rollback() { 
    	if (tx.isActive()) {
    		tx.rollback();
    	}
    }
    
    
    /**
     * @since Metodo que se encarga de hacer un objeto persistente.
     */
    public void insertar(Object objeto) throws Exception {
		try {
			this.pm.makePersistent(objeto); //se hace persistente al objeto pasado como parámetro//
		}
		catch  (Exception e){
			System.out.println ("Error al insertar objeto persistente");
			throw e;
		}    
	}
    
    
	/**
	 * @throws Metodo que se encarga de eliminar un objeto persistente.
	 */
    public void eliminar(Class clase, Long id) throws Exception {
		try {
	        Extent coleccionObjeto = pm.getExtent(clase, false);
	        String filtro = new String("id=="+id);
	        Query query = pm.newQuery(coleccionObjeto,filtro);
	        Collection objetos = (Collection)query.execute();
	        Iterator i = objetos.iterator();
	        Object objeto = null;
	        objeto = (Object)i.next();
	        pm.deletePersistent(objeto);
        }
        catch (Exception e) {
        	System.out.println ("Error al eliminar objeto persistente");
        	throw e;
        }
	}
    
    
	/**
	 * @throws Metodo que se encarga de realizar un filtrado de objetos persistentes teniendo en cuenta el filtro.
	 */
    public  Vector filtrarDatos(Class clase,String filtro)throws Exception {			
		Object objeto = null;
		Vector vector = new Vector();
	    try {
	        Extent coleccionObjeto = pm.getExtent(clase, false);
	        Query query = pm.newQuery(coleccionObjeto,filtro);
	        Collection objetos = (Collection)query.execute();
	        for (Iterator i = objetos.iterator(); i.hasNext(); ) {
	        	objeto = i.next();
	        	vector.add(objeto); 
	        }
	        //System.out.println(vector.get(0));
	    }
	    catch (Exception ex) {
	    	System.out.println("Error en filtrarDatos");
	    	throw ex;
	    }
	    return vector;
	}
    
    
	/**
	 * @throws Metodo que se encarga de obtener un objeto persistente teniendo en cuenta el filtro.
	 */
    public Object getObjeto(Class clase,String filtro) throws Exception{
		Object objeto = null;
        try {
        	//Extent coleccionObjeto = pm.getExtent(clase, true);
        	Extent coleccionObjeto = pm.getExtent(clase, false);
	        Query query = pm.newQuery(coleccionObjeto,filtro);
	        Collection objetos = (Collection)query.execute();
	        Iterator i = objetos.iterator();
	        objeto = i.next();
        }
        catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
        return objeto;
	}
    
    //------------
    /*public Object getObjeto(Class clase, String filtro) throws Exception {
		Object objeto = null;
		try {
			Extent coleccionObjeto = pm.getExtent(clase, false);
			Query query = pm.newQuery(coleccionObjeto, filtro);
			Collection objetos = (Collection) query.execute();
			if(objetos.size() > 0){
				Iterator i = objetos.iterator();
				objeto = i.next();
			}			
		} catch (Exception e) {
			System.out
					.println("Error clase_ManejadorPersistencia proc_getObjeto");
			e.printStackTrace();
			throw e;
		}
		return objeto;
	}*/
    
	/**
	 * @throws Metodo que se encarga de realizar un filtrado de objetos persistentes teniendo en cuenta el filtro.
	 */
    public  Vector filtrarColumna(Class clase,String filtro, String filtro1)throws Exception {			
		Object objeto = null;
		Vector vector = new Vector();
	    try {
	        Extent coleccionObjeto = pm.getExtent(clase, false);
	        Query query = pm.newQuery(coleccionObjeto,filtro);
	        query.setResult(filtro1);
	        Collection objetos = (Collection)query.execute();
	        for (Iterator i = objetos.iterator(); i.hasNext(); ) {
	        	objeto = i.next();
	        	vector.add(objeto); 
	        }
	        System.out.println(vector.get(0));
	    }
	    catch (Exception ex) {
	    	System.out.println("Error en filtrarDatos");
	    	throw ex;
	    }
	    return vector;
	}
    
	/**
	 * @throws Metodo que se encarga de obtener una collecion  de objetos persistentes teniendo en cuenta el filtro.
	 */
    public Collection getColeccion(Class clase, String filtro) throws Exception{
		Collection resultado = null;
    	try{
            
            Extent coleccionObjeto = pm.getExtent(clase, true);
            Query query = pm.newQuery(coleccionObjeto,filtro);
            resultado = (Collection)query.execute();
    	} catch(Exception e) {
            throw e;
    	}
    	return resultado;
	}
    
    
	/*public Set getSet(Class clase, Set objetos){
    
		Set resultado = null;
		for (Iterator iter = objetos.iterator(); iter.hasNext();) {
			Class element = (Class) iter.next();
			Class x = element.getComponentType();
			Class objeto = (Class)pm.getObjeto(x.class , "id=="+x.getName().);
			resultado.add(objeto);
		}
		return resultado;
	}
    */
   
    
	/**
	 * @throws Metodo que se encarga de obtener un objeto persistente teniendo en cuenta el filtro.
	 */
    public Object getObjetoId(Class clase,Long id) throws Exception {
		Object objeto = null;
        try {
        	Extent coleccionObjeto = pm.getExtent(clase, false);
	        String filtro = new String("id=="+id);
	        Query query = pm.newQuery(coleccionObjeto,filtro);
	        Collection objetos = (Collection)query.execute();
	        Iterator i = objetos.iterator();
	        objeto = i.next();
        }
        catch (Exception e) {
            e.printStackTrace();
        	return null;
        }
        return objeto;
	}
 

	/**
	 * @return Returns the pm.
	 */
	public PersistenceManager getPm() {
		return pm;
	}


	/**
	 * @param pm The pm to set.
	 */
	public void setPm(PersistenceManager pm) {
		this.pm = pm;
	}
	
    
}
