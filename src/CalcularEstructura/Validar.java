package CalcularEstructura;

import java.awt.Color;
import GestionarPersona.*;
import Principal.*;



/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 */

public class Validar {	
	
	/**
	 *Contructor de la Clase 
	 */
	public Validar(){
		
	}
	
	/**
	 * validarNoNull: compara si dos String son iguales
	 * @param ver
	 * @return false si el string es vacio, caso contrario retorna true
	 */
	public boolean validarNoNull(String ver){ 
		if (ver.equals("")){
			return false;
		}
		else{
			return true;
		}
	}
	
	/**
	 * validarComboBox: comprueba que el comboBox no este sin rellenar
	 * @param ver
	 * @param textoAValidar
	 * @return false si el comboBox es vacio, true en caso contrario
	 */
	public boolean validarComboBox(Object ver, String textoAValidar){
		if (ver.equals(textoAValidar)){
			return false;
		}
		else{
			return true;
		}
	}
			
	/**
	 * validarNumeros: comprueba que el String pasado como parametro sea un numero
	 * @param ver
	 * @return true si el String pasado como parametro es un numero, false en caso contario
	 */
	public boolean validarNumeros(String ver){
		if(this.isNumeric(ver)){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * isNumeric: comprueba que el String sea un numero perteneciente  a los enteros
	 * @param ver
	 * @return true si el String pasado como parametro es un numero, false en caso contario
	 */
	 public boolean isNumeric(String cadena){
		 try {
			 Integer.parseInt(cadena);
			 return true;
	     }catch (NumberFormatException nfe){
	    	 return false;
	     }
	 }
	 
	 /**
	  * validarHora: comprueba que el string sea una hora valida
	  * @param ver
	  * @return true si el string pasado como parametro en un numero y ademas esta comprendido entre 0 y 24 (horas)
	  * 		false en caso contrario
	  */
	 public boolean validarHora(String ver){
		if(this.isNumeric(ver)){
			if ((Integer.parseInt(ver)>0)&&(Integer.parseInt(ver)<=24)){
				return true; 
			}
			else{
				return false;
			}
		}
		else{
			 return false;
		}
	 }
	 
	 /**
	  * validarDni: comprueba que el string sea un dni, viendo que este formado por numeros solamente 
	  * @param ver
	  * @return true si el string pasado como parametro es un caracter y ademas esta comprendido entre 0 y 9 (numeros)
	  * 		false en caso contrario
	  */
	 public boolean validarDni(String ver){
		boolean format=true;
			for (int i = 0; i < ver.length()&&format==true; i++) {
				if (!(ver.charAt(i) >= '0' && ver.charAt(i) <= '9')) {
					format = false;
				}	
			}
		return format;
	 }
	 
	/**
	 * validarCliente: dado la interfaz se fija que todos los campo de esa interfaz esten rellenos
	 * y que a su vez estos tengan textos validos
	 * @param igp
	 * @return true si los campos estan llenos en su totalidad y con datos validos, 
	 * en caso contrario retorna falso
	 */
	public boolean validarCliente(InterfazInsertarCliente igp){
		boolean bool=true;
		if (!validarNoNull(igp.getJTextFieldApellido().getText())){
			igp.getJLabelApellido().setForeground(Color.red);
			bool=false;
		}
		else{
			igp.getJLabelApellido().setForeground(Color.black);
		}
		if(!validarNoNull(igp.getJTextFieldNombre().getText())){
			igp.getJLabelNombre().setForeground(Color.red);
			bool=false;
		}
		else{
			igp.getJLabelNombre().setForeground(Color.black);
		}
		if(!validarNoNull(igp.getJTextFieldTelContacto().getText())){
			igp.getJLabelTelContacto().setForeground(Color.red);
			bool=false;
		}
		else{
			igp.getJLabelTelContacto().setForeground(Color.black);
		}
		if (!validarNoNull(igp.getJTextFieldMail().getText())){
			igp.getJLabelMail().setForeground(Color.red);
			bool=false;
		}
		else{
			igp.getJLabelMail().setForeground(Color.black);
		}
		if(!validarDni(igp.getJTextFieldDni().getText())||(!validarComboBox(igp.getJComboBoxTDni().getSelectedItem().toString(),"<Selec Tipo>") )){
			igp.getJLabelTDni().setForeground(Color.red);
			bool=false;
		}
		else{
			igp.getJLabelTDni().setForeground(Color.black);
		}
		if(!validarComboBox(igp.getJComboBoxPais().getSelectedItem().toString(),"<Selec Tipo>")){
			igp.getJLabelPais().setForeground(Color.red);
			bool=false;
		}
		else{
			igp.getJLabelPais().setForeground(Color.black);
		}
		if (!validarComboBox(igp.getJComboBoxProvinciaCliente().getSelectedItem(),"<Selec Tipo>")){ 
			igp.getJLabelProvincia().setForeground(Color.red);
			bool=false;
		}
		else{
			igp.getJLabelProvincia().setForeground(Color.black);
		}
		if(!validarComboBox(igp.getJComboBoxDptoCliente().toString(),"<Selec Tipo>")){
			igp.getJLabelDptoCliente().setForeground(Color.red);
			bool=false;
		}
		else{
			igp.getJLabelDptoCliente().setForeground(Color.black);
		}
		if (!validarComboBox(igp.getJComboBoxLocalidadCliente().toString(),"<Selec Tipo>")){
			igp.getJLabelLocalidad().setForeground(Color.red);
			bool=false;
		}
		else{
			igp.getJLabelLocalidad().setForeground(Color.black);
		}
		return bool;
	}
	
	/**
	 * validarCampo: dado la interfaz se fija que todos los campo de esa interfaz esten rellenos
	 * y que a su vez estos tengan textos validos
	 * @param igp
	 * @return true si los campos estan llenos en su totalidad y con datos validos, 
	 * en caso contrario retorna falso
	 */
	public boolean validarCampo(InterfazInsertarCliente igp){
		boolean bool=true;
		if(!validarNoNull(igp.getJTextFieldDireccion().getText())){
			igp.getJLabelDireccion().setForeground(Color.red);
			bool=false;
		}
		else{
			igp.getJLabelDireccion().setForeground(Color.black);
		}
		if(!validarNumeros(igp.getJTextFieldCantHa().getText())){
			igp.getJLabelCantHa().setForeground(Color.red);
			bool=false;
		}
		else{
			igp.getJLabelCantHa().setForeground(Color.black);
		}
		if(!validarComboBox(igp.getJComboBoxPaisCampo().toString(),"<Selec Tipo>")){
			igp.getJLabelPaisCampo().setForeground(Color.red);
			bool=false;
		}
		else{
			igp.getJLabelPaisCampo().setForeground(Color.black);
		}
		if(!validarComboBox(igp.getJComboBoxProvinciaCampo().toString(),"<Selec Tipo>")){
			igp.getJLabelProvinciaCampo().setForeground(Color.red);
			bool=false;
		}
		else{
			igp.getJLabelProvinciaCampo().setForeground(Color.black);
		}
		if( !validarComboBox(igp.getJComboBoxDptoCampo().toString(),"<Selec Tipo>")){
			igp.getJLabelDptoCampo().setForeground(Color.red);
			bool=false;
		}
		else{
			igp.getJLabelDptoCampo().setForeground(Color.black);
		}
		if(!validarComboBox(igp.getJComboBoxLocalidadCampo().toString(),"<Selec Tipo>")){
			igp.getJLabelLocalidadCampo().setForeground(Color.red);
			bool=false;
		}
		else{
			igp.getJLabelLocalidadCampo().setForeground(Color.black);
		}
		return bool;		
	}
	
	/**
	 * validarEstructura: dado la interfaz se fija que todos los campo de esa interfaz esten rellenos
	 * y que a su vez estos tengan textos validos
	 * @param ice
	 * @return true si los campos estan llenos en su totalidad y con datos validos, 
	 * en caso contrario retorna falso
	 */
	public boolean validarEstructura(InterfazCalcularEstructura ice){
		boolean flag=true;
		if (!validarComboBox(ice.getJComboBoxDiamTuberia().getSelectedItem(),"")){
			ice.getJLabelDiametroDTuberia().setForeground(Color.red);
			flag=false;
		}
		else{
			ice.getJLabelDiametroDTuberia().setForeground(Color.black);
		}
		if ((!validarComboBox(ice.getJComboBoxLongTramo0().getSelectedItem(),""))){
			ice.getJLabelLongTramo().setForeground(Color.red);
			flag=false;
		}
		else{
			if ((!validarComboBox(ice.getJComboBoxLongTramo1().getSelectedItem(),""))){
				ice.getJLabelLongTramo().setForeground(Color.red);
				flag=false;
			}
			else{
				if ((!validarComboBox(ice.getJComboBoxLongTramo2().getSelectedItem(),""))){
					ice.getJLabelLongTramo().setForeground(Color.red);
					flag=false;
				}
				else{
					ice.getJLabelLongTramo().setForeground(Color.black);	
				}	
			}	
		}
		if ((!validarNoNull((String)ice.getJTextFieldCantTramos0().getText()))&&((!validarNumeros((String)ice.getJTextFieldCantTramos0().getText())))){
			ice.getJLabelCantTramos().setForeground(Color.red);
			flag=false;
		}
		else{
			if ((!validarNoNull((String)ice.getJTextFieldCantTramo1().getText()))&&((!validarNumeros((String)ice.getJTextFieldCantTramo1().getText())))){
				ice.getJLabelCantTramos().setForeground(Color.red);
				flag=false;
			}
			else{
				if ((!validarNoNull((String)ice.getJTextFieldCantTramos2().getText()))&&((!validarNumeros((String)ice.getJTextFieldCantTramos2().getText())))){
					ice.getJLabelCantTramos().setForeground(Color.red);
					flag=false;
				}
				else{
					ice.getJLabelCantTramos().setForeground(Color.black);
				}
			}
			
		}
		if (!validarComboBox(ice.getJComboBoxVoladizo().getSelectedItem(),"")){
			ice.getJLabelVoladizo().setForeground(Color.red);
			flag=false;
		}
		else{
			ice.getJLabelVoladizo().setForeground(Color.black);
		}
		if (!validarNoNull(ice.getJTextFieldCanonFinal().getText())||(!validarNumeros(ice.getJTextFieldCanonFinal().getText()))){
			ice.getJLabel1CanonFinal().setForeground(Color.red);
			flag=false;
		}
		else{
			ice.getJLabel1CanonFinal().setForeground(Color.black);
		}
		if (!validarComboBox(ice.getJComboBoxNeumaticos().getSelectedItem(),"")){
			ice.getJLabel1Neumaticos().setForeground(Color.red);
			flag=false;
		}
		else{
			ice.getJLabel1Neumaticos().setForeground(Color.black);
		}
		if (!validarComboBox(ice.getJComboBoxTTablero().getSelectedItem(),"")){
			ice.getJLabel1TTablero().setForeground(Color.red);
			flag=false;
		}
		else{
			ice.getJLabel1TTablero().setForeground(Color.black);
		}
		if (!validarComboBox(ice.getJComboBoxTMotor().getSelectedItem(),"")){
			ice.getJLabel1TMotor().setForeground(Color.red);
			flag=false;
		}
		else{
			ice.getJLabel1TMotor().setForeground(Color.black);
		}
		
		if (!validarComboBox(ice.getJComboBoxTReductor().getSelectedItem(),"")){
			ice.getJLabel1TReductor().setForeground(Color.red);
			flag=false;
		}
		else{
			ice.getJLabel1TReductor().setForeground(Color.black);
		}
		if(!validarComboBox(ice.getJComboBoxDistAspersores().getSelectedItem(), "")){
			ice.getJLabel1DistAspersores().setForeground(Color.red);
			flag=false;
		}
		else{
			ice.getJLabel1DistAspersores().setForeground(Color.black);
		}
		if (!validarNoNull(ice.getJTextFieldPresionAspersor().getText())||(!validarNumeros(ice.getJTextFieldPresionAspersor().getText()))){
			ice.getJLabelPresionAspersor().setForeground(Color.red);
			flag=false;
		}
		else{
			ice.getJLabelPresionAspersor().setForeground(Color.black);
		}
		if(ice.getJCheckBoxReguladorPresion().isSelected()){
			if (!validarComboBox(ice.getJComboBoxReguladorPresion().getSelectedItem(),"")){
				ice.getJLabel1ReguladorPresion0().setForeground(Color.red);
				flag=false;
			}
			else{
				ice.getJLabel1ReguladorPresion0().setForeground(Color.black);
			}
		}
		if (!validarComboBox(ice.getJComboBoxTAspersor().getSelectedItem(),"")){
			ice.getJLabel1TAspersor().setForeground(Color.red);
			flag=false;
		}
		else{
			ice.getJLabel1TAspersor().setForeground(Color.black);
		}
		if (!validarComboBox(ice.getJComboBoxDistAspersores().getSelectedItem(),"")){
			ice.getJLabel1DistPiso().setForeground(Color.red);
			flag=false;
		}
		else{
			ice.getJLabel1DistPiso().setForeground(Color.black);
		}
		if (!validarNoNull(ice.getJTextFieldBoquillasAnuladas().getText())||(!validarNumeros(ice.getJTextFieldBoquillasAnuladas().getText()))){
			ice.getJLabel1BoquillasAnuladas().setForeground(Color.red);
			flag=false;
		}
		else{
			ice.getJLabel1BoquillasAnuladas().setForeground(Color.black);
		}
		if (!validarNoNull(ice.getJTextFieldHrIrrigacion().getText())|| (!validarHora(ice.getJTextFieldHrIrrigacion().getText()))){
			ice.getJLabel1HrIrrigacion().setForeground(Color.red);
			flag=false;
		}
		else{
			ice.getJLabel1HrIrrigacion().setForeground(Color.black);
		}
		if (!validarNoNull(ice.getJTextFieldAnguloIrrigacion().getText())||(!validarNumeros(ice.getJTextFieldAnguloIrrigacion().getText()))){
			ice.getJLabel1AnguloIrrigacion().setForeground(Color.red);
			flag=false;
		}
		else{
			ice.getJLabel1AnguloIrrigacion().setForeground(Color.black);
		}
		if (!validarNoNull(ice.getJTextFieldCaudal().getText())|| (!validarNumeros(ice.getJTextFieldCaudal().getText()))){
			ice.getJLabel1Caudal().setForeground(Color.red);
			flag=false;
		}
		else{
			ice.getJLabel1Caudal().setForeground(Color.black);
		}
		if (!validarNoNull(ice.getJTextFieldPrecipitacionMin().getText())|| (!validarNumeros(ice.getJTextFieldPrecipitacionMin().getText()))){
			ice.getJLabel2PrecipitacionMin().setForeground(Color.red);
			flag=false;
		}
		else{
			ice.getJLabel2PrecipitacionMin().setForeground(Color.black);
		}
		if(!validarComboBox(ice.getJComboBoxDistanciaPiso().getSelectedItem(),"")){
			ice.getJLabel1DistPiso().setForeground(Color.red);
			flag=false;
		}
		else{
			ice.getJLabel1DistPiso().setForeground(Color.black);
		}
		return flag;
	}
	
	/**
	 * validarAdministrador: dado la interfaz se fija que todos los campo de esa interfaz esten rellenos
	 * y que a su vez estos tengan textos validos
	 * @param ici
	 * @return true si los campos estan llenos en su totalidad y con datos validos, 
	 * en caso contrario retorna falso
	 */
	public boolean validarAdministrador(InterfazConfiguracionInicial ici){
		boolean flag = true;
		if (!validarNoNull(ici.getJTextFieldUsuario().getText())){
			flag = false;
			ici.getJLabelUsuario().setForeground(Color.red);
		}
		else{
			ici.getJLabelUsuario().setForeground(Color.black);
		}
		if (!validarNoNull(ici.getJPasswordFieldContrasena().getText())){
			flag = false;
			ici.getJLabelContrasena().setForeground(Color.red);
		}
		else{
			ici.getJLabelContrasena().setForeground(Color.black);
		}
		if (!validarNoNull(ici.getJPasswordFieldRepetir().getText())){
			ici.getJLabelConfirmarContr().setForeground(Color.red);
			flag = false;
		}
		else{
			ici.getJLabelConfirmarContr().setForeground(Color.black);
		}
		return flag;
	}
	
	/**
	 * validarLogin: dado la interfaz se fija que todos los campo de esa interfaz esten rellenos
	 * y que a su vez estos tengan textos validos
	 * @param il
	 * @return true si los campos estan llenos en su totalidad y con datos validos, 
	 * en caso contrario retorna falso
	 */
	public boolean validarLogin(InterfazLogin il){
		boolean flag=true;
		if(!validarNoNull(il.getJPasswordFieldContrasena().getText())){
			il.getjLabelContrasena().setForeground(Color.red);
			flag=false;
		}
		else{
			il.getjLabelContrasena().setForeground(Color.black);
		}
		if(!validarNoNull(il.getJTextFieldUsuario().getText())){
			il.getjLabelUsuario().setForeground(Color.red);
			flag= false;
		}
		else{
			il.getjLabelUsuario().setForeground(Color.black);
		}
		
		return flag;
	}
		 
}//Fin clase Validar
