package CalcularEstructura;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import BaseDeDatos.*;
import Dominio.*;

import java.text.DecimalFormat;
import EmitirPresupuesto.MediadorEmitirPresupuesto;
import EmitirPresupuesto.ReportePresupuesto;

/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 *
 */

public class MediadorCalcularEstructura implements ActionListener,ItemListener {
	
	private InterfazCalcularEstructura ice=new InterfazCalcularEstructura();
	private Calculos cal=new Calculos();
	private MediadorDisenoPluviometria mdp;
	private MediadorDisenoEquipo mde;
	private Persistencia obP;
	private boolean reguladorPresion = false;
	private EstructuraDeTuberia t=null;
	private Equipo eq=null;
	private Validar va=new Validar();
	private boolean clienteCargado=false;
	private Campo camp=null;
	private long auxIdEq=0;
	
	/**
	 * Constructor de la clase
	 */
	public MediadorCalcularEstructura(){
		this.ice.setListenerButtons(this);
		this.ice.setChecked(this);	
		this.ice.pack();
		this.ice.getJButtonDetalletecnico().setEnabled(false);
		this.ice.getJButtonReporteBoquilla().setEnabled(false);
		this.ice.getJButtonTerminar().setEnabled(false);
		this.ice.show();
		this.ice.setLocationRelativeTo(null);
		clienteCargado=false;
		obP = new Persistencia();
		OidGenerator.init(obP.getPm().getPersistenceManagerFactory());
		t=new EstructuraDeTuberia();
		mde = new MediadorDisenoEquipo();
		eq= new Equipo(); 
	}
	
	/**
	 * Constructor de la clase con parametros
	 * @param c
	 * @param cl
	 * @param obP
	 */
	public MediadorCalcularEstructura(Campo c,Cliente cl,Persistencia obP){
		this.ice.setListenerButtons(this);
		this.ice.setChecked(this);	
		this.ice.pack();
		this.ice.getJButtonDetalletecnico().setEnabled(false);
		this.ice.getJButtonReporteBoquilla().setEnabled(false);
		this.ice.getJButtonTerminar().setEnabled(false);
		this.ice.show();
		this.ice.setLocationRelativeTo(null);
		clienteCargado=true;
		this.obP = obP;
		OidGenerator.init(obP.getPm().getPersistenceManagerFactory());
		t=new EstructuraDeTuberia(); 
		eq= new Equipo(); 
		camp=c;
	}
	
	/**
	 * actionPerformed: captura los eventos de los botones "Aplicar", "Terminar", "Cancelar", "Detalle Tecnico" y "Reporte de Boquillas"
	 */
	public void actionPerformed (ActionEvent arg0) {
		Object source = arg0.getSource();
		if (this.ice.getJButtonAplicar() == source)   {	
			if(va.validarEstructura(ice)){
				this.aplicar();
			}
		}
		if (this.ice.getJButtonTerminar()== source){
			if(va.validarEstructura(ice)){	
				this.terminar();
				this.ice.getJButtonDetalletecnico().setEnabled(true);
				this.ice.getJButtonReporteBoquilla().setEnabled(true);
				this.ice.getJButtonCancelar().setText("Cerrar");
				this.ice.getJButtonAplicar().setEnabled(false);
				this.ice.getJButtonTerminar().setEnabled(false);
			}
		}
		if (this.ice.getJButtonCancelar() == source)   {			
			this.cancelar();
		}
		if(this.ice.getJButtonDetalletecnico()== source){
			if (clienteCargado == true){
				ReporteDetallesTecnicos rdt= new ReporteDetallesTecnicos();
				rdt.startReport(auxIdEq);
			}
			else{
				ReporteDetalleSinCliente rdsc= new ReporteDetalleSinCliente();
				rdsc.startReport(auxIdEq);
			}
		}
		if(this.ice.getJButtonReporteBoquilla()== source){
			ReporteInventarioBoquilla rib= new ReporteInventarioBoquilla();
			rib.startReport(auxIdEq);
		}		
	}
	/**
	 * calcelar: cierra la ventana Calcular Estructura
	 */
	private void cancelar (){
		this.ice.dispose();
	}
	
	/**
	 * itemStateChanged: si el checkbox es clickeado activa el textfield Valvula Reductora de Presion y Transportable,
	 */
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getItemSelectable();
		 if (source == ice.getJCheckBoxReguladorPresion() && ice.getJCheckBoxReguladorPresion().isSelected()==true){
			 this.reguladorPresion = true;
			 this.ice.getJComboBoxReguladorPresion().setEnabled(true);		 
		 }
		 if (source == ice.getJCheckBoxTransportable() && ice.getJCheckBoxTransportable().isSelected()==true){
			 eq.setTransportable(true);
			 ice.getJComboBoxTReductor().removeAllItems();
			 ice.getJComboBoxTReductor().addItem("");
			 ice.getJComboBoxTReductor().addItem("740 TNT (UMC) 800");
			 ice.getJComboBoxTReductor().addItem("725 TNT (UMC) 700");
		 }
		 if (source == ice.getJCheckBoxReguladorPresion() && ice.getJCheckBoxReguladorPresion().isSelected()==false){
			 this.reguladorPresion = false;
			 this.ice.getJComboBoxReguladorPresion().setEnabled(false);		 
		 }
		 if (source == ice.getJCheckBoxTransportable() && ice.getJCheckBoxTransportable().isSelected()==false){
			 eq.setTransportable(false);
			 ice.getJComboBoxTReductor().removeAllItems();
			 ice.getJComboBoxTReductor().addItem("");
			 ice.getJComboBoxTReductor().addItem("740 (UMC) 800");
			 ice.getJComboBoxTReductor().addItem("725 (UMC) 700");
		 }
	}
	
	/**
	 * setearEquipo: guarda los datos del equipo
	 */
	public void setearEquipo(){
		eq.setHorasIrrigacion(Integer.parseInt(this.ice.getJTextFieldHrIrrigacion().getText()));
		eq.setAnguloIrrigacion(Integer.parseInt((this.ice.getJTextFieldAnguloIrrigacion().getText())));
		eq.setCaudal(Integer.parseInt(this.ice.getJTextFieldCaudal().getText()));
		double haBajoRiego=this.calcularHectariasBajoRiego(this.t.getLongitudTotal(),ice);
		eq.setBajoRiego(haBajoRiego);
		eq.setPrecipitacionMinima(Integer.parseInt(this.ice.getJTextFieldPrecipitacionMin().getText()));
		eq.setPresionConexion(Double.parseDouble(this.ice.getJTextFieldPresionConexion().getText()));
		eq.setTablero((String)this.ice.getJComboBoxTTablero().getSelectedItem());
		eq.setAspersor(mdp.getAspersor());
		eq.setValvula(mdp.getValvula());
		eq.setEstructuraDeTuberia(t);
		eq.setMotor(mde.getMotor());
		eq.setRodado(mde.getNeumatico());
		eq.setBoquillasAnuladas(Integer.parseInt(ice.getJTextFieldBoquillasAnuladas().getText()));
		eq.setTipoBoquilla((String)ice.getJComboBoxTAspersor().getSelectedItem());
		if (clienteCargado == true){
			eq.setCampo(camp);
		}
	}
	
	/**
	 * calcularHectariasBajoRiego: calcula las hectarias bajo riego de la estructura
	 * @param radio 
	 * @param ice 
	 * @return el area regada por el sistema de riego
	 */
	public double calcularHectariasBajoRiego(double radio,InterfazCalcularEstructura ice){
		double area = ((Math.PI * Math.pow(radio,2))/10000);
		DecimalFormat df = new  DecimalFormat ("0.##");
		String d = df.format (area);
		ice.getJTextFieldHaRegadas().setText(d.replaceAll (",", "."));
		return area;
	}
	
	/**
	 * casiTermino: permite que se pueda realizar modificaciones de los calculos ya obtenidos.
	 */
	public void aplicar(){
		MediadorDisenoPluviometria md= new MediadorDisenoPluviometria();
		Double longitud = cal.calcularLongitud(ice);
		String aux=longitud+"";
		ice.getJTextFieldLongTotal().setText(aux);
		cal.calcularHectariasBajoRiego(longitud,ice);
		md.calcularPresionALaconexion(ice);
		this.ice.getJButtonTerminar().setEnabled(true);
	}

	/**
	 * terminar: guarda todos los datos relacionados con la estrucutra y realiza el presupuesto del mismo, en caso que el equipo 
	 * 			 no este relacionado con un campo se calcula en presupuesto pero no se guarda ni el presupuesto y la estructura.
	 */
	public void terminar (){
		mde = new MediadorDisenoEquipo();
		mde.setearTramo(ice,t); 
		mde.setearNeumatico(ice,eq); 
		mde.setearMotor(ice,eq);
		mdp= new MediadorDisenoPluviometria(); 
		mdp.setearAspersor(ice,eq);
		mdp.calcularPresionALaconexion(ice);
		mdp.setearValvula(ice,eq);
		this.setearEquipo();
		Vector boquillareal;
		boquillareal=mde.calcularBoquillaReal(eq.getEstructuraDeTuberia().getLongitudTotal(),eq.getEstructuraDeTuberia().getCanon(),eq.getAspersor().getDistanciaEntreAspersor(), eq.getCaudal(), eq.getHorasIrrigacion(), eq.getBajoRiego());
		if (eq.getTipoBoquilla().equals("Rotator")){
			MediadorInventarioBoquillaNelson mib=new MediadorInventarioBoquillaNelson();
			mib.setearBoquillaNominal(boquillareal,obP,eq.getValvula().getReguladorPresion(),eq);
		}
		else {
			if (eq.getTipoBoquilla().equals("I-wob")){
				MediadorInventarioBoquillaIwob mibi=new MediadorInventarioBoquillaIwob();

				mibi.setearBoquillaNominal(boquillareal,obP,eq.getValvula().getReguladorPresion(),eq);
				
			}
			else {
				MediadorInventarioBoquillaLDN mibldn=new MediadorInventarioBoquillaLDN();
				mibldn.setearBoquillaNominal(boquillareal,obP,eq.getValvula().getReguladorPresion(),eq);
				
			}
		}	
		MediadorEmitirPresupuesto mep=new MediadorEmitirPresupuesto(eq,obP); 
		if (eq.getCampo()==null){
			obP=new Persistencia();
			new ReportePresupuesto().startReport(eq.getId());
			Long id=eq.getId();
			try {
				Presupuesto p=(Presupuesto)obP.getObjeto(Presupuesto.class,"equipo.id=="+id);
				Equipo e=p.getEquipo();
				Valvula v=e.getValvula();
				Aspersor a=e.getAspersor();
				EstructuraDeTuberia edt=e.getEstructuraDeTuberia();
				Motor m=e.getMotor();
				Neumatico n=e.getRodado();
				obP.eliminar(Presupuesto.class, p.getId());
				obP.eliminar(Equipo.class,id);
				obP.eliminar(InventarioBoquilla.class, id);
				obP.eliminar(Aspersor.class, a.getId());
				obP.eliminar(Valvula.class, v.getId());
				obP.eliminar(EstructuraDeTuberia.class, edt.getId());
				obP.eliminar(Motor.class, m.getId());
				obP.eliminar(Neumatico.class, n.getId());
			    obP.commit();
			}
			catch (Exception e) {
				obP.rollback();
			}
			finally {
				obP.close();
			}
			
		}
		auxIdEq = eq.getId();
	}
}// Fin Clase MediadorCalcularEstructura
