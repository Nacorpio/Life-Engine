package grammar;

import java.util.ArrayList;

public class Sentence {

	private ArrayList<Word> words = new ArrayList<Word>();
	private String sentence;
	
	private boolean isQuestion = false;
	private boolean isExclamation = false;
	
	// A sentence must end with a period.
	// A sentence must start with a capital letter.
	
	public Sentence(String sentence) throws Exception{
		if (!sentence.isEmpty() && sentence != null){
			if (Character.isUpperCase(sentence.charAt(0))){
				if (sentence.endsWith(".") || sentence.endsWith("\\?") || sentence.endsWith("\\.\\.\\.") || sentence.endsWith("\\!") || sentence.endsWith("\\;") || sentence.endsWith("\\:")){
					if (sentence.endsWith("\\?")){isQuestion = true;}
					else if (sentence.endsWith("!")){isExclamation = true;}
					this.sentence = sentence;
					for (String word: this.sentence.split(" ")){
						words.add(new Word(word.replaceAll(",", "")));
					}
				} else {
					throw new Exception("The sentence must end with a period.");
				}
			} else {
				throw new Exception("The sentence must start with a uppercase character.");
			}
		} else {
			throw new Exception("You can not leave the sentence empty.");
		}
	}
	
	public boolean getIsQuestion(){
		return this.isQuestion;
	}
	
	public boolean getIsExclamation(){
		return this.isExclamation;
	}
	
	public final String getSentence(){
		return this.sentence;
	}
	
	public final ArrayList<Word> getWords(){
		return this.words;
	}
	
	public final int getWordsCount(){
		return this.words.size();
	}
	
}
