package by.htp.home.main9.task03;

import java.util.List;

/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры.
 */

public class Main {

	public static void main(String[] args) {

		State st = new State();

		Region r1 = new Region();
		r1.add(new Area(58, new City("Borisov", Status.CAPITAL)));
		r1.add(new Area(70, new City("Minsk", Status.REGION)));
		r1.add(new Area(90, new City("Soligorsk", Status.AREA)));
		r1.add(new Area(22, new City("Zhodino", Status.AREA)));

		Region r2 = new Region();
		r2.add(new Area(58, new City("Bereza", Status.AREA)));
		r2.add(new Area(70, new City("Brest", Status.REGION)));
		r2.add(new Area(90, new City("Baranovichi", Status.AREA)));
		r2.add(new Area(22, new City("Pinsk", Status.AREA)));

		Region r3 = new Region();
		r3.add(new Area(58, new City("Lida", Status.AREA)));
		r3.add(new Area(70, new City("Grodno", Status.REGION)));
		r3.add(new Area(90, new City("Slonim", Status.AREA)));
		r3.add(new Area(22, new City("Most", Status.AREA)));

		st.add(r1);
		st.add(r2);
		st.add(r3);

		printCapital(StateLogic.findCapital(st));
		print(StateLogic.squareState(st));
		print(StateLogic.amountRegion(st));
		printRegionCentre(StateLogic.findCenterRegion(st));

	}

	public static void printCapital(City c) {
		System.out.println(c.toString());
	}

	public static void printRegionCentre(List<City> list) {
		for (City s : list) {
			System.out.println(s.toString());
		}
	}

	public static void print(int x) {
		System.out.println(x);
	}

}
