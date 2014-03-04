package CalcularEstructura;
import java.util.Vector;
import BaseDeDatos.Persistencia;
import Dominio.*;

/**
 * 
 * @author Nicolas Chailvo, Damian Espindola y Maria Eugenia Peña
 *
 */
public class MediadorInventarioBoquillaLDN {
	int pos=0;
	public MediadorInventarioBoquillaLDN(){
		
	}
	
	/**
	 * setearBoquillaNominal: guarda las boquillas LDN Dato que el equipo necesita
	 * @param v
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
		LdnDatos ildn = null; 
		try{
			vnd=p.filtrarColumna(LdnDatos.class,"","psi"+regulador); 
			vndColor=p.filtrarColumna(LdnDatos.class,"","color");
			vndBoquilla=p.filtrarColumna(LdnDatos.class,"","nroBoquilla");
			Vector <LdnDatos> baseDatos=p.filtrarDatos(LdnDatos.class,"psi"+regulador+">0");	
			for (int i=0;i<v.size();i++){
				if (v.elementAt(i)<vnd.elementAt(0)){
					ildn = new LdnDatos(vndColor.elementAt(0), vndBoquilla.elementAt(0));
					nom= (vnd.elementAt(0));
				}
				else {
					nom=(busquedaBoquilla(v.get(i),vnd));
					ildn = new LdnDatos(vndColor.elementAt(pos), vndBoquilla.elementAt(pos));				
				}
				ib= new InventarioBoquilla(ildn.getColor(),i+1,ildn.getNroBoquilla(),nom,v.elementAt(i),eq);
				eq.addInventario(ib);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	/*public LdnDatos busquedaFila(Vector <Double> v,Vector <Double> vnd,Vector <LdnDatos> baseDatos, LdnDatos ildn,Double psi){
		for (int j=0;j<baseDatos.size()&& psi!=(busquedaBoquilla(v.elementAt(j),vnd)) ;j++){
			if (psi==(busquedaBoquilla(v.elementAt(j),vnd))){
				ildn =new LdnDatos (baseDatos.elementAt(j).getColor(),baseDatos.elementAt(j).getNroBoquilla());
			}
		}
		return ildn;
	}*/
	
	/**
	 * busquedaBoquilla: busca las boquillas que le corresponde con la boquilla de la tabla LDN Datos
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
}//Fin clase MediadorInventarioBoquillaLDN
