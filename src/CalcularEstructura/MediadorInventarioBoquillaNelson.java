package CalcularEstructura;
import java.util.Vector;
import BaseDeDatos.Persistencia;
import Dominio.*;

/**
 * 
 * @author Nicolas Chailvo, Damian Espindola y Maria Eugenia Peña
 *
 */
public class MediadorInventarioBoquillaNelson {
	int pos=0;
	public MediadorInventarioBoquillaNelson(){		
	}
	
	/**
	 * setaerBoquillasNominal: guarda las boquillas Nelson Datos que el equipo necesita
	 * @param v vector con las boquillas nominal
	 * @param p 
	 * @param regulador
	 * @param eq 
	 */
	public void setearBoquillaNominal(Vector <Double>v,Persistencia p,int regulador,Equipo eq){
		Vector <Double> vnd=null;
		Vector <String> vndColor=null;
		Vector <Integer> vndBoquilla=null;
		InventarioBoquilla ib= null;
		double nom=0;
		NelsonDatos nd = null; 
		try{
			vnd=p.filtrarColumna(NelsonDatos.class,"","psi"+regulador); 
			vndColor=p.filtrarColumna(NelsonDatos.class,"","color");
			vndBoquilla=p.filtrarColumna(NelsonDatos.class,"","nroBoquilla");
			Vector <NelsonDatos> baseDatos=p.filtrarDatos(NelsonDatos.class,"psi"+regulador+">0");	
			for (int i=0;i<v.size();i++){
				if (v.elementAt(i)<vnd.elementAt(0)){
					nd = new NelsonDatos(vndColor.elementAt(0), vndBoquilla.elementAt(0));
					nom= (vnd.elementAt(0));
				}
				else {
					nom=(busquedaBoquilla(v.get(i),vnd));
					nd = new NelsonDatos(vndColor.elementAt(pos), vndBoquilla.elementAt(pos));				
				}
				ib= new InventarioBoquilla(nd.getColor(),i+1,nd.getNroBoquilla(),nom,v.elementAt(i),eq);
				//p.insertar(ib);
				eq.addInventario(ib);
			}
		//p.commit();
		//p.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	/*public NelsonDatos busquedaFila(Vector <Double> v,Vector <Double> vnd,Vector <NelsonDatos> baseDatos, NelsonDatos nd,Double psi){
		for (int j=0;j<baseDatos.size()&& psi!=(busquedaBoquilla(v.elementAt(j),vnd)) ;j++){
			if (psi==(busquedaBoquilla(v.elementAt(j),vnd))){
				nd=new NelsonDatos (baseDatos.elementAt(j).getColor(),baseDatos.elementAt(j).getNroBoquilla());
			}
		}
		return nd;
	}*/
	
	/**
	 * busquedaBoquillas busca las boquillas que le corresponde con la boquilla de la tabla Nelson Datos
	 * @param boqReal
	 * @param boqNominal
	 * @return la boquilla nominal mas cercana a la boquilla real
	 */
	public Double busquedaBoquilla(double boqReal, Vector <Double> boqNominal){
		double boquilla=0;
		double min=100;
		int i=0;
		for (i=0;i<boqNominal.size();i++){
			if (Math.abs(boqReal-boqNominal.elementAt(i))<min){
				min=Math.abs(boqReal-boqNominal.elementAt(i));
				boquilla=boqNominal.elementAt(i);
				pos=i;
			}
		}
		return boquilla;
	}
	
}//Fin clase MediadorInventarioBoquillaNelson
