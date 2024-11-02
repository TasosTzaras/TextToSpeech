package commands;

import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditDocument implements ActionListener {
	
	static String docName = windowPack.Edit.docName;
	
	
	public int file(String file) {
		File fr = new File(file);
		if(fr.exists() == true) {
			return 0;
		}else{
			return 1;
		}
	}
	
	
	public EditDocument() {
		
	}

	public void actionPerformed(ActionEvent event) {
		Runtime runtime = Runtime.getRuntime();     
		File fr=new File(docName);
		fr.setWritable(true);
		     
        try{
			runtime.exec("notepad.exe" + " " + docName); 
		}
		catch (IOException o){
			o.printStackTrace();
		}
		System.out.println(docName);	
	}
}
