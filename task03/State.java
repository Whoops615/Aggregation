package by.htp.home.main9.task03;

import java.util.ArrayList;
import java.util.List;

public class State {

	private List<Region> state;

	public State() {
		state = new ArrayList<Region>();
	}

	public void add(Region newRegion) {
		state.add(newRegion);
	}

	public List<Region> getState() {
		return state;
	}

	public void setState(List<Region> state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "State [state=" + state + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
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
		State other = (State) obj;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

}
