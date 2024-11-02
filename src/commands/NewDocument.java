package commands;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class NewDocument implements ActionListener{
	
	static String docName = windowPack.Create.docName;
	

	public int file(String file) {
		File fr = new File(file);
		if(fr.exists() == false) {
			return 0;
		}else{
			return 1;
		}
	}
	
	
	public NewDocument() {
		
	}

	
	public void actionPerformed(ActionEvent event) {
		try {
		      File myObj = new File(docName);
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName() + " and you can edit it.");
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}
