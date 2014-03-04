package CalcularEstructura;

import java.util.Vector;

import javax.swing.JOptionPane;

import Dominio.Motor;
import Dominio.Neumatico;
import Dominio.EstructuraDeTuberia;
import Dominio.Equipo;

/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 *
 */
public class MediadorDisenoEquipo {
	 

	private Neumatico n;
	private Motor m;
	private Validar va=new Validar();
	
	public MediadorDisenoEquipo (){ 
		
	}
	
	/**
	 * SeteaTramo: guarda los datos de los tramos
	 * @param ice
	 * @param t
	 */
	public void setearTramo (InterfazCalcularEstructura ice,EstructuraDeTuberia t){
		boolean ver=va.validarComboBox(ice.getJComboBoxDiamTuberia().getSelectedItem(),"");
		int diamTuberia= (Integer)ice.getJComboBoxDiamTuberia().getSelectedItem();
		t.setLongitud1(Double.parseDouble((String)ice.getJComboBoxLongTramo0().getSelectedItem()));
		t.setLongitud2(Double.parseDouble((String)ice.getJComboBoxLongTramo1().getSelectedItem()));
		t.setLongitud3(Double.parseDouble((String)ice.getJComboBoxLongTramo2().getSelectedItem()));
		t.setCantidad1((Integer.parseInt(ice.getJTextFieldCantTramos0().getText())));
		t.setCantidad2((Integer.parseInt(ice.getJTextFieldCantTramo1().getText())));
		t.setCantidad3((Integer.parseInt(ice.getJTextFieldCantTramos2().getText())));
		t.setVoladizo((Integer)ice.getJComboBoxVoladizo().getSelectedItem());
		double longitudTotal= this.calcularLongitud(t.getLongitud1(), t.getCantidad1(),t.getLongitud2(), t.getCantidad2(),t.getLongitud3(), t.getCantidad3(), t.getVoladizo(), t.getCanon(),ice);
		t.setLongitudTotal(longitudTotal);
		t.setCanon(Integer.parseInt(ice.getJTextFieldCanonFinal().getText()));

	}
	
	/**
	 * seteaNeumatico: guarda los datos del neumatico
	 * @param ice
	 * @param e
	 */
	public void setearNeumatico(InterfazCalcularEstructura ice, Equipo e){
		n= new Neumatico();
		n.setDiametro((String)ice.getJComboBoxNeumaticos().getSelectedItem());	
	}
	
	/**
	 * 
	 * @return devuelve el neumatico
	 */
	public Neumatico getNeumatico(){
		return n;
	}
	
	/**
	 * setearMotor:guarda los datos del motor
	 * @param ice
	 * @param e
	 */
	public void setearMotor(InterfazCalcularEstructura ice, Equipo e){
		m= new Motor();
		m.setTipo((String)ice.getJComboBoxTMotor().getSelectedItem());	
	}
	
	/**
	 * 
	 * @return devuelve el motor
	 */
	public Motor getMotor(){
		return m;
	}
	
	/**
	 * calcularLongitud: Calcula la longitud total del sistema de riego y lo ingresa en la interfaz
	 * @param longitud
	 * @param cantidad
	 * @param voladizo
	 * @param canon
	 * @param ice
	 * @return longitud total del sistema de riego
	 */
	public double calcularLongitud( double longitud1 ,int cantidad1, double longitud2, int cantidad2, double longitud3 ,int cantidad3, int voladizo, int canon,InterfazCalcularEstructura ice){
		double long1erTramo= longitud1*cantidad1;
		double long2doTramo= longitud2*cantidad2;
		double long3erTramo= longitud3*cantidad3;
		double longTotal= long1erTramo+long2doTramo+long3erTramo+voladizo+canon;
		ice.getJTextFieldLongTotal().setText(Double.toString(longTotal));
		return longTotal;		
	}
	
	/**
	 * calculardiametroRiego Calcula el area regada de una boquilla
	 * @param numBoquilla
	 * @param distBoquilla
	 * @return area regada de la boquilla pasada como parametro
	 */
	public double calculardiametroRiego(int numBoquilla, double distBoquilla){
		double radio= numBoquilla*distBoquilla;
		double area = Math.PI * Math.pow(radio,2);
		return area;
	}
	
	/**
	 * calcularBoquillaReal: Calcula en numero de las boquillas reales 
	 * @param longTotal
	 * @param canon
	 * @param distAspersores
	 * @param caudal
	 * @param hora
	 * @param haBajoRiego
	 * @return un vector con que contiene un listado de las boquillas reales
	 */
	public Vector calcularBoquillaReal(double longTotal,int canon, double distAspersores,int caudal, int hora, double haBajoRiego){
		Vector tablaBoquillaReal=new Vector();
		double longTotalSinCanon= longTotal-canon;
		double cantBoquillas= longTotalSinCanon/distAspersores;
		double mmRegados = (((caudal*1000)*hora)/haBajoRiego)/10000;
		double boquilla1=0;
		double boquilla2=0;
		int cant=1;
		while(cant<=cantBoquillas){
			double radio= cant*distAspersores;
			boquilla2 = Math.PI * Math.pow(radio,2);
			double aux= boquilla2;
			boquilla2=boquilla2-boquilla1;
			double boquillaReal=(boquilla2*mmRegados)/1440;
			tablaBoquillaReal.addElement(boquillaReal);
			boquilla1=aux;
			cant++;
		}		
		return tablaBoquillaReal;
	}
}//Fin Clase MediadorDisenoEquipo
