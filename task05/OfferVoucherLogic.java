package by.htp.home.main9.task05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OfferVoucherLogic {

	public static void sortType(List<Voucher> list) {
		Collections.sort(list, new SortVoucherType());
	}

	public static void sortTransport(List<Voucher> list) {
		Collections.sort(list, new SortVoucherTransport());
	}

	public static void sortNutrition(List<Voucher> list) {
		Collections.sort(list, new SortVoucherNutrition());
	}

	public static void sortDay(List<Voucher> list) {
		Collections.sort(list, new SortVoucherDay());
	}

	public static List<Voucher> searchType(List<Voucher> list, TypeVoucher tv) {
		List<Voucher> result = new ArrayList<Voucher>();
		for (Voucher v : list) {
			if (v.getTypeVoucher() == tv) {
				result.add(v);
			}
		}
		return result;
	}

	public static List<Voucher> searchTransport(List<Voucher> list, Transport t) {
		List<Voucher> result = new ArrayList<Voucher>();
		for (Voucher v : list) {
			if (v.getTransport() == t) {
				result.add(v);
			}
		}
		return result;
	}

	public static List<Voucher> searchNutrition(List<Voucher> list, int nutrition) {
		List<Voucher> result = new ArrayList<Voucher>();
		for (Voucher v : list) {
			if (v.getNutrition() == nutrition) {
				result.add(v);
			}
		}
		return result;
	}

	public static List<Voucher> searchDay(List<Voucher> list, int day) {
		List<Voucher> result = new ArrayList<Voucher>();
		for (Voucher v : list) {
			if (v.getAmountDay() == day) {
				result.add(v);
			}
		}
		return result;
	}

}