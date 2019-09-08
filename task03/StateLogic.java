package by.htp.home.main9.task03;

import java.util.ArrayList;
import java.util.List;

public class StateLogic {

	public static City findCapital(State state) {

		for (Region r : state.getState()) {
			for (Area a : r.getAreas()) {
				if (a.getCity().getStatus() == Status.CAPITAL) {
					return a.getCity();
				}
			}
		}

		return null;
	}

	public static int amountRegion(State state) {

		return state.getState().size();
	}

	public static int squareState(State state) {

		int sumSquare = 0;
		for (Region r : state.getState()) {
			for (Area a : r.getAreas()) {
				sumSquare = sumSquare + a.getSquare();

			}
		}

		return sumSquare;
	}

	public static List<City> findCenterRegion(State state) {

		List<City> result = new ArrayList<City>();

		for (Region r : state.getState()) {
			for (Area a : r.getAreas()) {
				if (a.getCity().getStatus() == Status.REGION) {
					result.add(a.getCity());
				}
			}
		}

		return result;
	}

}
