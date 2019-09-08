package by.htp.home.main9.task02;

public class Car {

	private String model;
	private Engine engine;
	private WheelGroup wheelGroup;
	private Tank tank;

	public Car() {

	}

	public Car(String model, Engine engine, WheelGroup wheelGroup, Tank tank) {
		this.model = model;
		this.engine = engine;
		this.wheelGroup = wheelGroup;
		this.tank = tank;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public WheelGroup getWheelGroup() {
		return wheelGroup;
	}

	public void setWheelGroup(WheelGroup wheelGroup) {
		this.wheelGroup = wheelGroup;
	}

	public Tank getTank() {
		return tank;
	}

	public void setTank(Tank tank) {
		this.tank = tank;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", engine=" + engine + ", wheelGroup=" + wheelGroup + ", tank=" + tank + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((tank == null) ? 0 : tank.hashCode());
		result = prime * result + ((wheelGroup == null) ? 0 : wheelGroup.hashCode());
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
		Car other = (Car) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (tank == null) {
			if (other.tank != null)
				return false;
		} else if (!tank.equals(other.tank))
			return false;
		if (wheelGroup == null) {
			if (other.wheelGroup != null)
				return false;
		} else if (!wheelGroup.equals(other.wheelGroup))
			return false;
		return true;
	}

}
