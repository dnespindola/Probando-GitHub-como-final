package EmitirFactura;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import BaseDeDatos.Persistencia;
import Dominio.*;

/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 * 
 */

public class MediadorEmitirFactura implements ActionListener {
	 
	private Persistencia obP;  
	private InterfazEmitirFactura ief = null;
	private String tipoMotor;
	private String tipoAspersor;
	private String tipoTablero;
	private String tipoNeumatico;
	private double longtotal=0;
	private String tipoReductor;
	private int cantBajadas=0;
	private float precioPresup=0;
	private int botonActivado=0; //0-->boton calcular, 1-->boton aceptar
	private Float precioFinal;
	private Presupuesto p=null;
	private Equipo eq=null;
	
	/**
	 * @since Metodo constructor de la clase MediadorEmitirFactura
	 */
	public MediadorEmitirFactura(){
		this.ief = new InterfazEmitirFactura();
		this.ief.setVisible(true);
		this.ief.setLocationRelativeTo(null);
	}
	
	/**
	 * @since Metodo que es utilizado para mostrar los detalles de la factura en la interfaz
	 */
	public void detallar(){
		String text=" Tipo de aspersor: "+tipoAspersor+"\n";
		text +=" Tipo de motor: "+tipoMotor+"\n";
		text +=" Tipo de tablero: "+tipoTablero+"\n";
		text +=" Tipo de neumatico: "+tipoNeumatico+"\n";
		text +=" Longitud total del sistema: "+longtotal+"\n";
		text +=" Tipo de reductor: "+tipoReductor+"\n";
		text +=" Cantidad de bajadas: "+cantBajadas+"\n";
		text +=" Precio presupuestado: "+precioPresup+"\n";
		this.ief.getJTextAreaFactura().setText(text);
	}
	
	/**
	 * @since Metodo que obtiene los datos necesarios de un equipo almacenado en la BD
	 * @param eq
	 * @param obP
	 */
	public void obtenerDatos (Equipo eq, Persistencia obP){
		this.obP=obP;
		this.eq=eq;
		tipoAspersor=eq.getTipoBoquilla();
		tipoMotor=eq.getMotor().getTipo();
		tipoTablero=eq.getTablero();
		tipoNeumatico=eq.getRodado().getDiametro();
		longtotal=eq.getEstructuraDeTuberia().getLongitudTotal();
		tipoReductor=eq.getValvula().getTipoReductor();
		cantBajadas=obtenerCantBajadas(eq);
		try{
			p=(Presupuesto)obP.getObjeto(Presupuesto.class,"equipo.id=="+eq.getId());
		}
		catch(Exception e){
			e.printStackTrace();
			this.obP.rollback();
		}
		precioPresup=p.getTotal();
		detallar();
		this.ief.setListenerButtons(this);
	}
	
	/**
	 * @since Metodo que calacula la cantidad de bajadas totales del equipo
	 * @param eq
	 * @return cantidadBajadas
	 */
	public int obtenerCantBajadas(Equipo eq){		
		double longTotalSinCanon= eq.getEstructuraDeTuberia().getLongitudTotal()-eq.getEstructuraDeTuberia().getCanon();
		double cantBajadasDouble= longTotalSinCanon/eq.getAspersor().getDistanciaEntreAspersor();
		String cadena = Double.toString(cantBajadasDouble);
		int punto = cadena.indexOf('.');
		int cantidadBajadas = Integer.parseInt(cadena.substring(0,punto))-eq.getBoquillasAnuladas();
		return cantidadBajadas;
	}
	
	/**
	 * @since Metodo que captura los eventos del botón: "Aceptar"
	 */
	public void actionPerformed(ActionEvent arg1) {
		if (botonActivado==0){
			botonActivado=1;
			String costoExtra=this.ief.getJTextFieldCostosExtras().getText();
			float costo=0;
			if (!costoExtra.equals("")){
				costo=Long.parseLong(costoExtra);
			}
			else{
				costo=0;
			}
			precioFinal=(precioPresup+costo)*21/100+(precioPresup+costo);
			this.ief.getJTextFieldPrecioFinal().setText(precioFinal.toString());
			this.ief.getJButtonAceptar().setText("Aceptar");
		}
		else{
			Factura fac=new Factura();
			fac.setPrecio(precioFinal);
			fac.setPresupuesto(p);			
			try{
				this.obP.insertar(fac);
				this.obP.commit();
				Long auxIdFac = fac.getId();
				ReporteFactura rf= new ReporteFactura();
				rf.startReport(auxIdFac);
			}
			catch(Exception e){
				e.printStackTrace();
				this.obP.rollback();
			}
			finally{
				 this.obP.close();				 
			}
		}
	}
}
