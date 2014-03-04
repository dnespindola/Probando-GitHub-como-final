package EmitirPresupuesto;
import java.sql.*;

import java.util.Map;
import java.util.HashMap;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.*;
import net.sf.jasperreports.view.save.JRPdfSaveContributor.*;
import net.sf.jasperreports.view.JRViewer.*;
import net.sf.jasperreports.view.save.JRMultipleSheetsXlsSaveContributor.*;

/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 * 
 */

public class ReportePresupuesto {
	public static final String DRIVER="com.mysql.jdbc.Driver";
    public static final String RUTA="jdbc:mysql://localhost/riego";
    public static final String USER="root";
    public static final String PASSWORD=""; 
    public static Connection CONEXION;
   
    /**
     * Metodo que inicia el reporte del presupuesto
     * @param id
     */
    public void startReport(Long id){ 
        try{
            Class.forName(DRIVER);
            CONEXION = DriverManager.getConnection(RUTA,USER,PASSWORD);         
            String template="Reportes/PresupuestoFinal.jasper";
            JasperReport reporte=null;
            reporte=(JasperReport) JRLoader.loadObject(template);
            Map param=new HashMap();
            param.put("id", id);           
            JasperPrint jasperprint= JasperFillManager.fillReport(reporte,param,CONEXION);
            JasperViewer visor=new JasperViewer(jasperprint,false);
            visor.setTitle("Presupuesto");
            visor.setVisible(true);
        }catch(Exception e){
        	System.out.println(e.getMessage());
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
}