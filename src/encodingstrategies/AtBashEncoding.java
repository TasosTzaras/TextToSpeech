package encodingstrategies;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;




public class AtBashEncoding extends TemplateEncoding{
	
	public static String docName1 = windowPack.Open.docName;
	public static String docName2 = windowPack.Edit.docName;
	public static String docName3 = windowPack.Create.docName;
	public static String epituxia;

	public AtBashEncoding() {
		
	}
	

	@SuppressWarnings("resource")
	public String encode(String text) {
		if (docName1 == text) {
			File file = new File(docName1);
			Scanner br = null;
			try{
				br = new Scanner(file);
			}catch (FileNotFoundException e){
				e.printStackTrace();
			}

			String d = "";
			while (br.hasNextLine()){
				String allchar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String plainText=br.nextLine();
				plainText=plainText.replaceAll(" ", "");
				plainText=plainText.toUpperCase();
				int len= plainText.length();
				int len1 = allchar.length();
				String cipher="";

				for(int i=0; i<len; i++){
					
					char b=plainText.charAt(i);
					for(int j=0; j<len1; j++){
							 char c=allchar.charAt(j);
							 if(c == b ){
								 int index=allchar.indexOf(c);
								 int position=(len1-1)-index;
								 cipher+= allchar.charAt(position);
								 break;
							}
					 }
				}
				d += cipher;
				d += "\n";
				
			}
			try {
				  Scanner scan = new Scanner(System.in);
				  System.out.println("Give the file path to save to:");
				  epituxia = scan.nextLine();
			      FileWriter myWriter = new FileWriter(epituxia);
			      
			      myWriter.append(d);
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
			try{
				br = new Scanner(file);
			}catch (FileNotFoundException e){
				e.printStackTrace();
			}

			String d = "";
			while (br.hasNextLine()){
				String allchar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String plainText=br.nextLine();
				plainText=plainText.replaceAll(" ", "");
				plainText=plainText.toUpperCase();
				int len= plainText.length();
				int len1 = allchar.length();
				String cipher="";

				for(int i=0; i<len; i++){
					
					char b=plainText.charAt(i);
					for(int j=0; j<len1; j++){
							 char c=allchar.charAt(j);
							 if(c == b ){
								 int index=allchar.indexOf(c);
								 int position=(len1-1)-index;
								 cipher+= allchar.charAt(position);
								 break;
							}
					 }
				}
				d += cipher;
				d += "\n";
			}
			try {
				  Scanner scan = new Scanner(System.in);
				  System.out.println("Give the file path to save to:");
				  epituxia = scan.nextLine();
			      FileWriter myWriter = new FileWriter(epituxia);
			      
			      myWriter.append(d);
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
			try{
				br = new Scanner(file);
			}catch (FileNotFoundException e){
				e.printStackTrace();
			}

			String d = "";
			while (br.hasNextLine()){
				String allchar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String plainText=br.nextLine();
				plainText=plainText.replaceAll(" ", "");
				plainText=plainText.toUpperCase();
				int len= plainText.length();
				int len1 = allchar.length();
				String cipher="";

				for(int i=0; i<len; i++){
					
					char b=plainText.charAt(i);
					for(int j=0; j<len1; j++){
							 char c=allchar.charAt(j);
							 if(c == b ){
								 int index=allchar.indexOf(c);
								 int position=(len1-1)-index;
								 cipher+= allchar.charAt(position);
								 break;
							}
					 }
				}
				d += cipher;
				d += "\n";
				
			}
			try {
				  Scanner scan = new Scanner(System.in);
				  System.out.println("Give the file path to save to:");
				  epituxia = scan.nextLine();
			      FileWriter myWriter = new FileWriter(epituxia);
			      
			      myWriter.append(d);
			      myWriter.close();
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
		return d;
		}
		return null;	
	}
	
}
