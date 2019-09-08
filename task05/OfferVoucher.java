package by.htp.home.main9.task05;

import java.util.ArrayList;
import java.util.List;

public class OfferVoucher {

	private List<Voucher> vouchers;

	public OfferVoucher() {
		vouchers = new ArrayList<Voucher>();
	}

	public void add(Voucher newVoucher) {
		vouchers.add(newVoucher);
	}

	public List<Voucher> getVouchers() {
		return vouchers;
	}

	public void setVouchers(List<Voucher> vouchers) {
		this.vouchers = vouchers;
	}

	@Override
	public String toString() {
		return "OfferVoucher [vouchers=" + vouchers + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vouchers == null) ? 0 : vouchers.hashCode());
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
		OfferVoucher other = (OfferVoucher) obj;
		if (vouchers == null) {
			if (other.vouchers != null)
				return false;
		} else if (!vouchers.equals(other.vouchers))
			return false;
		return true;
	}

}
