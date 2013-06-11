package grammar;

public class Word {
	
	private String word;
	
	public Word(String text) throws Exception{
		if (!text.isEmpty() && text != null){
			word = text.replaceAll("\\.", "").replaceAll("\\?", "").replaceAll("!", "").replaceAll("\\.\\.\\.", "").replaceAll(":", "").replaceAll(";", "");
		} else {
			throw new Exception("You can not leave the word empty.");
		}
	}
	
	/**
	 * Returns the word as a String.
	 * @return Returns the word as a String.
	 */
	public String getWord(){
		return this.word;
	}
	
	/**
	 * Returns the length of the word.
	 * @return Returns the length of the word.
	 */
	public int getLength(){
		return getWord().length();
	}
	
}
