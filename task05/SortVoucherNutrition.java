package by.htp.home.main9.task05;

import java.util.Comparator;

public class SortVoucherNutrition implements Comparator<Voucher> {

	@Override
	public int compare(Voucher o1, Voucher o2) {
		if (o1.getNutrition() > o2.getNutrition()) {
			return 1;
		} else if (o1.getNutrition() < o2.getNutrition()) {
			return -1;
		}
		return 0;
	}

}
