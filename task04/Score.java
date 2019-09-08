package by.htp.home.main9.task04;

public class Score  {

	private int numberScore;
	private int balance;
	private boolean lockStatus;

	public Score() {

	}

	public Score(int numberScore, int balance, boolean lockStatus) {
		this.numberScore = numberScore;
		this.balance = balance;
		this.lockStatus = lockStatus;
	}

	public int getNumberScore() {
		return numberScore;
	}

	public void setNumberScore(int numberScore) {
		this.numberScore = numberScore;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isLockStatus() {
		return lockStatus;
	}

	public void setLockStatus(boolean lockStatus) {
		this.lockStatus = lockStatus;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + balance;
		result = prime * result + (lockStatus ? 1231 : 1237);
		result = prime * result + numberScore;
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
		Score other = (Score) obj;
		if (balance != other.balance)
			return false;
		if (lockStatus != other.lockStatus)
			return false;
		if (numberScore != other.numberScore)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Score [numberScore=" + numberScore + ", balance=" + balance + ", lockStatus=" + lockStatus + "]";
	}

}
