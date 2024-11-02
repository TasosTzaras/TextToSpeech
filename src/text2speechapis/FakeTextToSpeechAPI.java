package text2speechapis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FakeTextToSpeechAPI implements TextToSpeechAPI {

	public FakeTextToSpeechAPI() {
		
	}

	
	public void play(String text) {
		

	}

	
	public void setVolume(int v) {
		

	}

	
	public void setPitch(int p) {
		

	}
	

	
	public void setRate(int r) {
		

	}
	
	public static void Arxeio(String s) {
	    
		FreeTTSAdapter x = new FreeTTSAdapter();
		File file = new File(s);
		String text = "";
		Scanner br = null;
		try {
			br = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while (br.hasNextLine()) {
			String a = br.nextLine();
			text = text + a;
		}
		x.play(text);
	}

}
