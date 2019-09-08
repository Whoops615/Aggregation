package by.htp.home.main9.task04;

public class Client {

	private String name;
	private ScoreGroup ScoreGroup;

	public Client() {

	}

	public Client(String name, ScoreGroup ScoreGroup) {
		this.name = name;
		this.ScoreGroup = ScoreGroup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ScoreGroup getScoreGroup() {
		return ScoreGroup;
	}

	public void setScoreGroup(ScoreGroup scoreGroup) {
		ScoreGroup = scoreGroup;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", ScoreGroup=" + ScoreGroup + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ScoreGroup == null) ? 0 : ScoreGroup.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Client other = (Client) obj;
		if (ScoreGroup == null) {
			if (other.ScoreGroup != null)
				return false;
		} else if (!ScoreGroup.equals(other.ScoreGroup))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
