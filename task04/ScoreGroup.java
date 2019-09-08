package by.htp.home.main9.task04;

import java.util.ArrayList;
import java.util.List;

public class ScoreGroup {

	private List<Score> scores;

	public ScoreGroup() {
		scores = new ArrayList<Score>();
	}

	public void add(Score newScore) {
		scores.add(newScore);
	}

	public List<Score> getScores() {
		return scores;
	}

	public void setScores(List<Score> scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "ScoreGroup [scores=" + scores + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((scores == null) ? 0 : scores.hashCode());
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
		ScoreGroup other = (ScoreGroup) obj;
		if (scores == null) {
			if (other.scores != null)
				return false;
		} else if (!scores.equals(other.scores))
			return false;
		return true;
	}

}
