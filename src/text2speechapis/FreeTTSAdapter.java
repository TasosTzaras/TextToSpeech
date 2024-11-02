package text2speechapis;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class FreeTTSAdapter implements TextToSpeechAPI {
	
	private VoiceManager vm;
	private Voice voice;

	public FreeTTSAdapter() {
		System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
		vm = VoiceManager.getInstance();
		voice = vm.getVoice("kevin16");
		voice.allocate();
	}

	
	public void play(String text) {
		
		voice.speak(text);
	}

	
	public void setVolume(int v) {
		
		setVolume(v);
	}

	
	public void setPitch(int p) {
		
		setPitch(p);
	}

	
	public void setRate(int r) {
		
		setRate(r);
	}

}
