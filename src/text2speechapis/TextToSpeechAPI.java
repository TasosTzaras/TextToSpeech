package text2speechapis;

public interface TextToSpeechAPI {
	
	public void play(String text);
	
	public void setVolume(int v);
	
	public void setPitch(int p);
	
	public void setRate(int r);

}
