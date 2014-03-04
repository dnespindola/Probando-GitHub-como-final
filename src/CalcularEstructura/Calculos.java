package CalcularEstructura;
import java.text.DecimalFormat;
//import java.util.Vector;
import CalcularEstructura.InterfazCalcularEstructura;


/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 *
 */

public class Calculos { 
	
	InterfazCalcularEstructura ice;
	
	/**
	 * calcuarLongitud: Calcula la longitud del sistema de riego
	 * @param ice interfa del calculo de la estructura
	 * @return la longitud total del sistema
	 */
	public Double calcularLongitud( InterfazCalcularEstructura ice){
		//Double aux =null;//Double.parseDouble(ice.getJTextFieldCantTramos0().getText());
		Double long1erTramo= (Double.parseDouble(ice.getJTextFieldCantTramos0().getText()))* (Double.parseDouble((String)ice.getJComboBoxLongTramo0().getSelectedItem()));
		Double long2doTramo= (Double.parseDouble(ice.getJTextFieldCantTramo1().getText()))*(Double.parseDouble((String)ice.getJComboBoxLongTramo1().getSelectedItem()));
		Double long3erTramo= (Double.parseDouble(ice.getJTextFieldCantTramos2().getText()))*(Double.parseDouble((String)ice.getJComboBoxLongTramo2().getSelectedItem()));
		//int aux1=(Integer) (ice.getJComboBoxVoladizo().getSelectedItem());
		//aux=Double.parseDouble(ice.getJTextFieldCanonFinal().getText());
		Double longTotal= long1erTramo+long2doTramo+long3erTramo + ((Integer)ice.getJComboBoxVoladizo().getSelectedItem())+Double.parseDouble(ice.getJTextFieldCanonFinal().getText());
		return longTotal;
	}
	
	
	/**
	 * calcularHectariasBajoRiego: Calcula las hecatrias bajo riego
	 * @param radio la longitud del sistema de riego
	 * @param ice interface calculas estructura
	 * @return el area regada por el sistema de riego
	 */
	public double calcularHectariasBajoRiego(Double radio,InterfazCalcularEstructura ice){
		double area = ((Math.PI * Math.pow(radio,2))/10000);
		DecimalFormat df = new  DecimalFormat ("0.##");
		String d = df.format (area);
		ice.getJTextFieldHaRegadas().setText(d.replaceAll (",", "."));
		return area;
	}
	
}// Fin calse Calculos
