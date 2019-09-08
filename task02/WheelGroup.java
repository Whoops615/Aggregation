package by.htp.home.main9.task02;

import java.util.ArrayList;
import java.util.List;

public class WheelGroup {

	private List<Wheel> wheels;

	public WheelGroup() {
		wheels = new ArrayList<Wheel>();
	}

	public void add(Wheel newWheel) {
		wheels.add(newWheel);
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "WheelGroup [wheels=" + wheels + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((wheels == null) ? 0 : wheels.hashCode());
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
		WheelGroup other = (WheelGroup) obj;
		if (wheels == null) {
			if (other.wheels != null)
				return false;
		} else if (!wheels.equals(other.wheels))
			return false;
		return true;
	}

}
