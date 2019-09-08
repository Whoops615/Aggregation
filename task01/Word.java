package by.htp.home.main9.task01;

public class Word {

	private String wordValue;

	public Word() {

	}

	public Word(String wordValue) {
		this.wordValue = wordValue;
	}

	public String getWordValue() {
		return wordValue;
	}

	public void setWordValue(String wordValue) {
		this.wordValue = wordValue;
	}

	@Override
	public String toString() {
		return "Word [wordValue=" + wordValue + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((wordValue == null) ? 0 : wordValue.hashCode());
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
		Word other = (Word) obj;
		if (wordValue == null) {
			if (other.wordValue != null)
				return false;
		} else if (!wordValue.equals(other.wordValue))
			return false;
		return true;
	}

}
