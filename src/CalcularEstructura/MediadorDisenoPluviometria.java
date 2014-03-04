package CalcularEstructura;

import Dominio.Aspersor;

import Dominio.Valvula;
//import Dominio.Boquilla;
import Dominio.Equipo;
//import java.math.*;
import java.text.DecimalFormat;

/**
 * 
 * @author Nicolas Chailvo, Damian Espindola y Maria Eugenia Peña
 *
 */
public class MediadorDisenoPluviometria {
	
	private Aspersor a;
	private Valvula v;
	
	/**
	 * setearAspersor: guarda los datos del aspersor
	 * @param ice
	 * @param e
	 */
	public void setearAspersor(InterfazCalcularEstructura ice, Equipo e){
		a=new Aspersor();
		a.setDistanciaEntreAspersor(Double.parseDouble((String)ice.getJComboBoxDistAspersores().getSelectedItem()));
		a.setDistanciaPiso(Double.parseDouble((String)ice.getJComboBoxDistanciaPiso().getSelectedItem()));
		a.setPresionAspersor(Double.parseDouble((String)ice.getJTextFieldPresionAspersor().getText()));
	}
	
	/**
	 * 
	 * @return devuelve el aspersor
	 */
	public Aspersor getAspersor(){
		return a;
	}
	
	/**
	 * 
	 * @return devuelve la valvula
	 */
	public Valvula getValvula(){
		return v;
	}
	
	/**
	 * setearValvula: guarda los datos de la valvula
	 * @param ice
	 * @param e
	 */
	public void setearValvula (InterfazCalcularEstructura ice, Equipo e){	
		v = new Valvula();
		if(ice.getJCheckBoxReguladorPresion().isSelected()){
			v.setReguladorPresion(Integer.parseInt((String)ice.getJComboBoxReguladorPresion().getSelectedItem()));
		}
		else{
			v.setReguladorPresion(0);
		}
		
		v.setTipoReductor((String)ice.getJComboBoxTReductor().getSelectedItem());
	}
	
	/**
	 * calcularPresionALaConexion: calcula la presion a la conexion dependiendo del caudal, del diametro de la tuberia,
	 * de la longitud y cantidad de los tramos
	 * @param ice
	 */
	public void calcularPresionALaconexion(InterfazCalcularEstructura ice){
		double aux1 = (Double.parseDouble((String)ice.getJTextFieldCaudal().getText()))/ 3.6;
		double c4 = Math.pow(10,12);
		double f4 = aux1 /140;
		double g4 = Math.pow(f4, 1.852);
		int diam = (Integer)ice.getJComboBoxDiamTuberia().getSelectedItem();
		double diamFin0 = Math.pow(diam, 4.857);
		double result0 = 1.22*c4*g4/diamFin0;
		double longiTramo0 = Double.parseDouble((String)ice.getJComboBoxLongTramo0().getSelectedItem());
		double cantTramo0 = Double.parseDouble(ice.getJTextFieldCantTramos0().getText()); 
		double longiTramo1 = Double.parseDouble((String)ice.getJComboBoxLongTramo1().getSelectedItem());
		double cantTramo1 = Integer.parseInt(ice.getJTextFieldCantTramo1().getText());
		double longiTramo2 = Double.parseDouble((String)ice.getJComboBoxLongTramo2().getSelectedItem());
		double cantTramo2 = Integer.parseInt(ice.getJTextFieldCantTramos2().getText());
		double resultParcial0 = (longiTramo0*cantTramo0/100)*result0;
		double diamFin1 =Math.pow(168, 4.857);
		double result1=1.22*c4*g4/diamFin1;
		double resultParcial1= (longiTramo1*cantTramo1/100)*result1;
		double resultParcial2 =(longiTramo2*cantTramo2/100)*result1;
		Double resultFinal = resultParcial0+resultParcial1+resultParcial2;
		DecimalFormat df = new  DecimalFormat ("0.##");
		String d = df.format (resultFinal);
		ice.getJTextFieldPresionConexion().setText(d.replaceAll (",", "."));
	}
}
// Fin clase MediadorDisenoPluviometria
