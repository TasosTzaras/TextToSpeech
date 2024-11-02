package commands;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;




public class OpenDocument {

	public static String docName = windowPack.Open.docName;
	
	
	public int file(String file) {
		File fr = new File(file);
		if(fr.exists() == true) {
			return 0;
		}else{
			return 1;
		}
	}
	
	
	public OpenDocument(){}

	
	
	public void actionPerformed(ActionEvent event) throws IOException{     
		File fr = new File(docName);
		if(!Desktop.isDesktopSupported()) {  
			System.out.println("not supported");  
			return;  
		}
		if(fr.exists() && fr.length() != 0){
			System.out.println("File " + docName + " is not empty and is ready for reading");
		}else if(fr.exists() && fr.length() == 0) {
			System.out.println("File " + docName + " is empty");
		}else if (fr.exists() == false) {
			System.out.println(docName + " does not exist. Check your path or create a new file.");
		}
	}
	
	public void actionPerformed(KeyEvent event) throws IOException{
	     
		File fr = new File(docName);
		if(!Desktop.isDesktopSupported()) {  
			System.out.println("not supported");  
			return;  
		}
		if(fr.length() != 0) {
			System.out.println("File " + docName + " is not empty and is ready for reading");
		}else {
			System.out.println("File " + docName + " is empty");
		}	
	}
}