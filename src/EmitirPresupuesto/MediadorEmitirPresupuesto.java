package EmitirPresupuesto;

import BaseDeDatos.Persistencia;
import Dominio.*;
import java.util.Vector;

/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 * 
 */
public class MediadorEmitirPresupuesto {
	private Persistencia p;
	Vector <String> tipoElemento = new Vector<String>();
	Vector <Float> precios = new Vector<Float>();
	Presupuesto pres= new Presupuesto();
	int cantTramos = 0;
	int cantBajadas = 0;
	
	/**
	 * Constructor de la clase en donde se calcula la longitud de la estructura sin el cañon
	 * y la cantidad de bajadas
	 * @param eq
	 * @param p
	 */
	public MediadorEmitirPresupuesto(Equipo eq,Persistencia p){
		this.p=p;
		cantTramos=((Integer)eq.getEstructuraDeTuberia().getCantidad1())+((Integer)eq.getEstructuraDeTuberia().getCantidad2())+((Integer)eq.getEstructuraDeTuberia().getCantidad3());
		double longTotalSinCanon= eq.getEstructuraDeTuberia().getLongitudTotal()-eq.getEstructuraDeTuberia().getCanon();
		double cantBajadasDouble= longTotalSinCanon/eq.getAspersor().getDistanciaEntreAspersor();
		String cadena = Double.toString(cantBajadasDouble);
		int punto = cadena.indexOf('.');
		cantBajadas = Integer.parseInt(cadena.substring(0,punto))-eq.getBoquillasAnuladas();
		pres.setTotal(precioFinal(eq));
		pres.setEquipo(eq);
		System.out.println("Insercion");
		try{
			this.p.insertar(pres);
			this.p.commit();
		}catch (Exception e){
			e.printStackTrace();
			this.p.rollback();
		}
		 finally{
			 this.p.close();
		 }
	}
	
	/**
	 * Calcula el precio de los tramos
	 * @param eq
	 * @return precio del tramo
	 */
	public float precioTramo(Equipo eq){			
		String longitud0=Double.toString((Double)eq.getEstructuraDeTuberia().getLongitud1());
		String longitud1=Double.toString((Double)eq.getEstructuraDeTuberia().getLongitud2());
		String longitud2=Double.toString((Double)eq.getEstructuraDeTuberia().getLongitud3());
		String diametro=Integer.toString(eq.getEstructuraDeTuberia().getDiamTuberia1())+" mm-"+longitud0+" m";
		int i=0;
		float precioT=0;
		for (i=0;i<tipoElemento.size();i++){
			if (diametro.equals(tipoElemento.elementAt(i)))
			{
				precioT=((Integer)eq.getEstructuraDeTuberia().getCantidad1())*(precios.elementAt(i));
				i=tipoElemento.size()-1;
			}
		}
		for (i=0;i<tipoElemento.size();i++){
			if (tipoElemento.elementAt(i).equals("168 mm-"+longitud1+" m"))
			{
				precioT= precioT+((Integer)eq.getEstructuraDeTuberia().getCantidad2())*(precios.elementAt(i));
				i=tipoElemento.size()-1;
			}
		}
		for (i=0;i<tipoElemento.size();i++){
			if (tipoElemento.elementAt(i).equals("168 mm-"+longitud2+" m"))
			{
				precioT= precioT+((Integer)eq.getEstructuraDeTuberia().getCantidad3())*(precios.elementAt(i));
				i=tipoElemento.size()-1;
			}
		}
		return precioT;
	}
	
	/**
	 * @param eq
	 * @return precio del voladizo
	 */
	public float precioVoladizo(Equipo eq){	
		float precioVoladizo=0;
		int i=0;
		int voladizo=eq.getEstructuraDeTuberia().getVoladizo();
		for (i=0;i<tipoElemento.size();i++){
			if ((Integer.toString(voladizo)).equals(tipoElemento.elementAt(i))){
				precioVoladizo=precios.elementAt(i);
				i=tipoElemento.size()-1;
			}
		}
		return precioVoladizo;
	}
	
	/**
	 * @param eq
	 * @return precio de los neumaticos
	 */
	public float precioNeumatico(Equipo eq){	
		float precioNeumatico=0;
		int i=0;
		String neumatico=eq.getRodado().getDiametro();
		for (i=0;i<tipoElemento.size();i++){
			if (neumatico.equals(tipoElemento.elementAt(i))){
				precioNeumatico=precios.elementAt(i);
				i=tipoElemento.size()-1;
			}
		}
		return precioNeumatico*2*cantTramos;
	}
	
	/**
	 * @param eq
	 * @return el precio del tablero
	 */
	public float precioTablero(Equipo eq){	
		float precioTablero=0;
		int i=0;
		String tablero=eq.getTablero();
		for (i=0;i<tipoElemento.size();i++){
			if (tablero.equals(tipoElemento.elementAt(i))){
				precioTablero=precios.elementAt(i);
				i=tipoElemento.size()-1;
			}
		}
		return precioTablero;
	}
	
	/**
	 * @param eq
	 * @return el precio del motor
	 */
	public float precioMotor(Equipo eq){	
		float precioMotor=0;
		int i=0;
		String motor=eq.getMotor().getTipo();
		for (i=0;i<tipoElemento.size();i++){
			if (motor.equals(tipoElemento.elementAt(i))){
				precioMotor=precios.elementAt(i);
				i=tipoElemento.size()-1;
			}
		}
		return precioMotor*2*cantTramos;
	}
	
	/**
	 * @param eq
	 * @return el precio del regulador
	 */
	public float precioRegulador(Equipo eq){	
		float precioRegulador=0;
		int i=0;
		for (i=0;i<tipoElemento.size();i++){
			if ("regulador".equals(tipoElemento.elementAt(i))){
				precioRegulador=precios.elementAt(i);
				i=tipoElemento.size()-1;
			}
		}
		return precioRegulador*cantBajadas;
	}
	
	/**
	 * @param eq
	 * @return precio total de los reproductores
	 */
	public float precioReductor(Equipo eq){	
		float precioReductor=0;
		int i=0;
		String reductor=eq.getValvula().getTipoReductor();
		for (i=0;i<tipoElemento.size();i++){
			if (reductor.equals(tipoElemento.elementAt(i))){
				precioReductor=precios.elementAt(i);
				i=tipoElemento.size()-1;
			}
		}
		return precioReductor*2*cantTramos;
	}
	
	/**
	 * @param eq
	 * @return el precio de los aspersores
	 */
	public float precioAspersor(Equipo eq){	
		float precioAspersor=0;
		int i=0;
		String aspersor=eq.getTipoBoquilla();
		for (i=0;i<tipoElemento.size();i++){
			if (aspersor.equals(tipoElemento.elementAt(i))){
				precioAspersor=precios.elementAt(i);
				i=tipoElemento.size()-1;
			}
		}
		return precioAspersor*cantBajadas;
	}
	
	/**
	 * @param eq
	 * @return la suma de los precios de otros componentes
	 */
	public float otrosPrecios(Equipo eq){	
		float otrosPrecios=0;
		int i=0;
		String transportable="no";
		String piramide="fija";
		transportable=(eq.isTransportable()==true?"si":"no");
		if (eq.isTransportable()==true){
			transportable="si";
			piramide="movil";
		}
		for (i=0;i<tipoElemento.size();i++){
			if (transportable.equals(tipoElemento.elementAt(i))){
				otrosPrecios=precios.elementAt(i);//precio transportable o fijo
				i=tipoElemento.size()-1;
			}
		}
		if ((eq.getEstructuraDeTuberia().getCanon())!=0){
			for (i=0;i<tipoElemento.size();i++){
				if ("canon".equals(tipoElemento.elementAt(i))){//precio canon
					otrosPrecios=precios.elementAt(i)+otrosPrecios;
					i=tipoElemento.size()-1;
				}
			}
		}	
		for (i=0;i<tipoElemento.size();i++){
			if (piramide.equals(tipoElemento.elementAt(i))){//precio piramide
				otrosPrecios=precios.elementAt(i)+otrosPrecios;
				i=tipoElemento.size()-1;
			}
		}
			
		
		return otrosPrecios;
	}
	
	/**
	 * @param eq
	 * @return el precio final del equipo
	 */
	public float precioFinal (Equipo eq){
		float precioFinal=0;
		try{
			tipoElemento=this.p.filtrarColumna(Precio.class, "","tipo");
			precios=this.p.filtrarColumna (Precio.class, "", "precio");			
			precioFinal=precioTramo(eq)+precioVoladizo(eq)+precioNeumatico(eq)+precioTablero(eq)+precioRegulador(eq)+precioReductor(eq)+precioAspersor(eq)+otrosPrecios(eq)+precioMotor(eq);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return precioFinal;
	}	
}
