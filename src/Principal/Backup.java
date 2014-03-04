package Principal;


import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 * 
 * @author Nicolas Chialvo, Damián Espindola, Maria Eugenia Peña 
 */


public class Backup extends JPanel{
	
	public Backup(){
		this.realizarBackup();
	}
	
	/**
	 * 
	 * @return backUpPath con el path del archivo elegido
	 */
	
	public String getBackUpPath() {
        String backUpPath = "";
        JFileChooser fc = null;
        if (fc == null) {
               fc = new JFileChooser();
               fc.setAcceptAllFileFilterUsed(false);
               ExampleFileFilter filter = new ExampleFileFilter("sql", "Archivos sql");
               fc.addChoosableFileFilter(filter);
       }
       int returnVal = fc.showSaveDialog(this);
       if (returnVal == JFileChooser.APPROVE_OPTION) {
           File file = fc.getSelectedFile();
           backUpPath = file.getAbsolutePath();
           if (!(backUpPath.endsWith(".sql"))){
        	   backUpPath+=".sql";
           }
       }
       else {
    	   backUpPath="cancelar";
       }
       System.out.println(backUpPath);
       return backUpPath;
	}
	
	/**
	 * Realiza el backup
	 */
	private void realizarBackup(){
		String usuario="root";
		String password="";
		String dbName="riego";
		Runtime rt = Runtime.getRuntime(); 
		try { 
			if (!(this.getBackUpPath().equals("cancelar"))){ 
			String command = "mysqldump --opt -u "+usuario+" --password="+password+" "+dbName+"  -r "+"\""+this.getBackUpPath()+"\""; 
			rt.exec(command);
			JOptionPane. showMessageDialog (this, "Backup realizado con éxito", "Backup", JOptionPane.INFORMATION_MESSAGE);
			}
			else{
				this.disable();
			}
		} catch (IOException ex) { 
			ex.printStackTrace(); 
			JOptionPane. showMessageDialog (this, "Error al realizar el backup", "Backup", JOptionPane.ERROR_MESSAGE);
		} 
	}
}
