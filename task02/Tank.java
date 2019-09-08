package by.htp.home.main9.task02;

public class Tank {

	private int currentVolume;
	private final int start;
	private final int end;

	{
		this.start = 0;
		this.end = 80;
	}

	public Tank() {

	}

	public Tank(int currentVolume) {
		this.currentVolume = currentVolume;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	@Override
	public String toString() {
		return "Tank [currentVolume=" + currentVolume + ", start=" + start + ", end=" + end + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentVolume;
		result = prime * result + end;
		result = prime * result + start;
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
		Tank other = (Tank) obj;
		if (currentVolume != other.currentVolume)
			return false;
		if (end != other.end)
			return false;
		if (start != other.start)
			return false;
		return true;
	}

}
