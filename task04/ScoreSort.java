package by.htp.home.main9.task04;

import java.util.Collections;
import java.util.Comparator;

public class ScoreSort implements Comparator<Score> {

	@Override
	public int compare(Score o1, Score o2) {

		if (o1.getBalance() > o2.getBalance()) {
			return 1;
		} else if (o1.getBalance() < o2.getBalance()) {
			return -1;
		}
		return 0;
	}
	
	public static void sortScore(Client c) {
		Collections.sort(c.getScoreGroup().getScores(),new ScoreSort());
	}

}
