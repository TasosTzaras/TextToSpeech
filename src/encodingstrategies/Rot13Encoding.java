package encodingstrategies;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;


public class Rot13Encoding extends TemplateEncoding {
	public static String docName1 = windowPack.Open.docName;
	public static String docName2 = windowPack.Edit.docName;
	public static String docName3 = windowPack.Create.docName;
	public static String rot13arxeio;
	
	@SuppressWarnings("resource")
	public String encode (String text) {
		if (docName1 == text) {
			File file = new File(docName1);
	  		Scanner br = null;
	  		try {
	  			br = new Scanner(file);
	  		} catch (FileNotFoundException e) {
	  			e.printStackTrace();
	  		}

	      String text2 = "";
	      
	      String d = "";

	      while (br.hasNextLine()){
	        String plainText=br.nextLine();
	        for (int i = 0; i < plainText.length(); i++) {
	          char c = plainText.charAt(i);
	          if       (c >= 'a' && c <= 'm') c += 13;
	          else if  (c >= 'A' && c <= 'M') c += 13;
	          else if  (c >= 'n' && c <= 'z') c -= 13;
	          else if  (c >= 'N' && c <= 'Z') c -= 13;
	          text2 = text2 + c;
	        }
	       
	        d = text2;
	        
	      }
	      try {
			  Scanner scan = new Scanner(System.in);
			  System.out.println("give the file path to save to:");
			  rot13arxeio = scan.nextLine();
		      FileWriter myWriter = new FileWriter(rot13arxeio);
		      myWriter.write(d);
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	    return d;
		}
		
		if (docName2 == text) {
			File file = new File(docName2);
	  		Scanner br = null;
	  		try {
	  			br = new Scanner(file);
	  		} catch (FileNotFoundException e) {
	  			e.printStackTrace();
	  		}

	      String text2 = "";
	      
	      String d = null;

	      while (br.hasNextLine()){
	        String plainText=br.nextLine();
	        for (int i = 0; i < plainText.length(); i++) {
	          char c = plainText.charAt(i);
	          if       (c >= 'a' && c <= 'm') c += 13;
	          else if  (c >= 'A' && c <= 'M') c += 13;
	          else if  (c >= 'n' && c <= 'z') c -= 13;
	          else if  (c >= 'N' && c <= 'Z') c -= 13;
	          text2 = text2 + c;
	        }
	        d = text2;
	        
	      }
	      try {
			  Scanner scan = new Scanner(System.in);
			  System.out.println("give the file path to save to:");
			  rot13arxeio = scan.nextLine();
		      FileWriter myWriter = new FileWriter(rot13arxeio);
		      myWriter.write(d);
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	    return d;
		}
		
		if (docName3 == text) {
			File file = new File(docName3);
	  		Scanner br = null;
	  		try {
	  			br = new Scanner(file);
	  		} catch (FileNotFoundException e) {
	  			e.printStackTrace();
	  		}

	      String text2 = "";
	      
	      String d = null;

	      while (br.hasNextLine()){
	        String plainText=br.nextLine();
	        for (int i = 0; i < plainText.length(); i++) {
	          char c = plainText.charAt(i);
	          if       (c >= 'a' && c <= 'm') c += 13;
	          else if  (c >= 'A' && c <= 'M') c += 13;
	          else if  (c >= 'n' && c <= 'z') c -= 13;
	          else if  (c >= 'N' && c <= 'Z') c -= 13;
	          text2 = text2 + c;
	        }
	        d = text2;
	        
	      }
	      try {
			  Scanner scan = new Scanner(System.in);
			  System.out.println("Give the file path to save to:");
			  rot13arxeio = scan.nextLine();
		      FileWriter myWriter = new FileWriter(rot13arxeio);
		      myWriter.write(d);
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	    return d;
		}
	  return null;  
    }
	
	public Rot13Encoding() {
		
	}
}
