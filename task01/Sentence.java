package by.htp.home.main9.task01;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

	private List<Word> sentences;

	public Sentence() {
		sentences = new ArrayList<Word>();
	}

	public void add(Word newWord) {
		sentences.add(newWord);
	}

	public List<Word> getSentences() {
		return sentences;
	}

	public void setSentences(List<Word> sentences) {
		this.sentences = sentences;
	}

	@Override
	public String toString() {
		return "Sentence [sentences=" + sentences + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentences == null) ? 0 : sentences.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (sentences == null) {
			if (other.sentences != null)
				return false;
		} else if (!sentences.equals(other.sentences))
			return false;
		return true;
	}

}
