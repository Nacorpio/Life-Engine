import grammar.Sentence;
import grammar.Word;


public final class LifeEngine {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Sentence s = new Sentence("Hej, jag heter Gustav och jag bor i Trelleborg.");
		for (Word w: s.getWords()){
			System.out.println(w.getWord());
		}
	}

}
