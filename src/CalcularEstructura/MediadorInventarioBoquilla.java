package CalcularEstructura;
import java.util.Vector;
import BaseDeDatos.Persistencia;
import Dominio.*;

/**
 * 
 * @author Nicolas Chialvo, Damian Espindola y Maria Eugenia Peña
 *
 */

public class MediadorInventarioBoquilla {

	int pos=0;
	
	public MediadorInventarioBoquilla(){}
	
	/**
	 * setaerBoquillasNominal: guarda las boquillas Nelson Datos que el equipo necesita
	 * @param v vector con las boquillas nominal
	 * @param p 
	 * @param regulador
	 * @param eq 
	 */
	public void setearBoquillaNominal(Vector <Double>v,Persistencia p,int regulador,Equipo eq){
		Vector<Double> vnd = null;
		Vector<String> vndColor = null;
		Vector<Integer> vndBoquilla = null;
		InventarioBoquilla ib = null;
		double nom=0;
		try{
			if (eq.getTipoBoquilla().equals("Rotator")){
				NelsonDatos nd = null; 
				vnd = p.filtrarColumna(NelsonDatos.class,"","psi"+regulador);
				vndColor = p.filtrarColumna(NelsonDatos.class,"","color");
				vndBoquilla = p.filtrarColumna(NelsonDatos.class,"","nroBoquilla");
				Vector<NelsonDatos> baseDatos = p.filtrarDatos(NelsonDatos.class,"psi"+regulador+">=0");	
				for (int i=0;i<v.size();i++){
					if (v.elementAt(i)<vnd.elementAt(0)){
						nd = new NelsonDatos(vndColor.elementAt(0), vndBoquilla.elementAt(0));
						nom= (vnd.elementAt(0));
					}
					else {
						nom = (busquedaBoquilla(v.get(i),vnd));
						nd = new NelsonDatos(vndColor.elementAt(pos), vndBoquilla.elementAt(pos));				
					}
					ib = new InventarioBoquilla(nd.getColor(),i+1,nd.getNroBoquilla(),nom,v.elementAt(i),eq);
					eq.addInventario(ib);
				}
			}
			else{
				if (eq.getTipoBoquilla().equals("I-wob")){
					IwobDatos idw = null;
					vnd = p.filtrarColumna(IwobDatos.class,"","psi"+regulador); 
					vndColor = p.filtrarColumna(IwobDatos.class,"","color");
					vndBoquilla = p.filtrarColumna(IwobDatos.class,"","nroBoquilla");
					Vector<IwobDatos> baseDatos = p.filtrarDatos(IwobDatos.class,"psi"+regulador+">0");	
					for (int i=0;i<v.size();i++){
						if (v.elementAt(i)<vnd.elementAt(0)){
							idw = new IwobDatos(vndColor.elementAt(0), vndBoquilla.elementAt(0));
							nom = (vnd.elementAt(0));
						}
						else {
							nom = (busquedaBoquilla(v.get(i),vnd));
							idw = new IwobDatos(vndColor.elementAt(pos), vndBoquilla.elementAt(pos));				
						}
						ib = new InventarioBoquilla(idw.getColor(),i+1,idw.getNroBoquilla(),nom,v.elementAt(i),eq);
						eq.addInventario(ib);
					}
				}
				else{
					if(eq.getTipoBoquilla().equals("LDN")){
						LdnDatos ildn = null;
						vnd = p.filtrarColumna(LdnDatos.class,"","psi"+regulador); 
						vndColor = p.filtrarColumna(LdnDatos.class,"","color");
						vndBoquilla = p.filtrarColumna(LdnDatos.class,"","nroBoquilla");
						Vector<LdnDatos> baseDatos=p.filtrarDatos(LdnDatos.class,"psi"+regulador+">0");	
						for (int i = 0;i<v.size();i++){
							if (v.elementAt(i)<vnd.elementAt(0)){
								ildn = new LdnDatos(vndColor.elementAt(0), vndBoquilla.elementAt(0));
								nom = (vnd.elementAt(0));
							}
							else {
								nom = (busquedaBoquilla(v.get(i),vnd));
								ildn = new LdnDatos(vndColor.elementAt(pos), vndBoquilla.elementAt(pos));				
							}
							ib = new InventarioBoquilla(ildn.getColor(),i+1,ildn.getNroBoquilla(),nom,v.elementAt(i),eq);
							eq.addInventario(ib);
						}
					}
				}
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * busquedaBoquillas busca las boquillas que le corresponde con la boquilla de la tabla Nelson Datos
	 * @param boqReal
	 * @param boqNominal
	 * @return la boquilla nominal mas cercana a la boquilla real
	 */
	public Double busquedaBoquilla(double boqReal, Vector <Double> boqNominal){
		double boquilla = 0;
		double min = 100;
		int i = 0;
		for (i = 0;i<boqNominal.size();i++){
			if (Math.abs(boqReal-boqNominal.elementAt(i))<min){
				min = Math.abs(boqReal-boqNominal.elementAt(i));
				boquilla = boqNominal.elementAt(i);
				pos=i;
			}
		}
		return boquilla;
	}
	
}// Fin clase MediadorInventarioBoquilla
