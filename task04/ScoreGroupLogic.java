package by.htp.home.main9.task04;

public class ScoreGroupLogic {

	public static int sumScore(Client c) {

		int sumScore = 0;

		for (Score s : c.getScoreGroup().getScores()) {
			sumScore = sumScore + s.getBalance();
		}
		return sumScore;
	}

	public static int sumPositive(Client c) {

		int sumPositive = 0;

		for (Score s : c.getScoreGroup().getScores()) {

			if (s.getBalance() > 0) {
				sumPositive = sumPositive + s.getBalance();
			}

		}
		return sumPositive;

	}

	public static int sumNegative(Client c) {

		int sumNegative = 0;

		for (Score s : c.getScoreGroup().getScores()) {

			if (s.getBalance() < 0) {
				sumNegative = sumNegative + s.getBalance();
			}

		}
		return sumNegative;
	}

	public static Score searchScore(Client c, int NumberScore) {

		for (Score s : c.getScoreGroup().getScores()) {
			if (s.getNumberScore() == NumberScore) {
				return s;
			}
		}

		return null;
	}

}
