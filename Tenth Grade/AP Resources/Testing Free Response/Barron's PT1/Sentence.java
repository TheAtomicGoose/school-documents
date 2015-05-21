import java.util.*;

public class Sentence {

	private String sentence;

	public Sentence(String sen) {
		sentence = sen;
	}

	public List<Integer> getBlankPositions() {

		List<Integer> spaces = new ArrayList<Integer>();

		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				spaces.add(new Integer(i));
			}
		}
		return spaces;
	}

	public int countWords() {
		return getBlankPositions().size() + 1;
	}

	public String[] getWords() {
		String[] words = new String[countWords()];
		List<Integer> pos = getBlankPositions();
		System.out.println(pos);
		if (countWords() == 1) {
			words[0] = sentence;
			return words;
		} else {
			words[0] = sentence.substring(0, pos.get(0));
			for (int i = 1; i < countWords() - 1; i++) {
				words[i] = sentence.substring(pos.get(i - 1) + 1, pos.get(i));
			}
			words[countWords() - 1] = sentence.substring(pos.get(pos.size() - 1) + 1);
		}
		return words;
	}
}