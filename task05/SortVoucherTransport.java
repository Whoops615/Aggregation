package by.htp.home.main9.task05;

import java.util.Comparator;

public class SortVoucherTransport implements Comparator<Voucher> {

	@Override
	public int compare(Voucher o1, Voucher o2) {
		if (o1.getTransport().name().compareTo(o2.getTransport().name()) > 1) {
			return 1;
		} else if (o1.getTransport().name().compareTo(o2.getTransport().name()) < 1) {
			return -1;
		}
		return 0;
	}

}
