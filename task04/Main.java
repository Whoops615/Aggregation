package by.htp.home.main9.task04;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Main {

	public static void main(String[] args) {

		Client c = new Client("Ivanov", new ScoreGroup());
		c.getScoreGroup().add(new Score(12, 500, false));
		c.getScoreGroup().add(new Score(13, 100, false));
		c.getScoreGroup().add(new Score(14, -600, false));
		c.getScoreGroup().add(new Score(15, 900, false));
		c.getScoreGroup().add(new Score(16, 800, false));
		c.getScoreGroup().add(new Score(17, -200, false));
		c.getScoreGroup().add(new Score(18, -500, false));

		printScore(ScoreGroupLogic.searchScore(c, 14));
		print(ScoreGroupLogic.sumScore(c));
		print(ScoreGroupLogic.sumPositive(c));
		print(ScoreGroupLogic.sumNegative(c));
		ScoreSort.sortScore(c);
		print2(c);

	}

	public static void printScore(Score s) {
		System.out.println(s.toString());
	}

	public static void print(int x) {
		System.out.println(x);
	}

	public static void print2(Client c) {
		for (Score s : c.getScoreGroup().getScores()) {
			System.out.println(s.toString());
		}
	}

}
