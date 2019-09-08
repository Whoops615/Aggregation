package by.htp.home.main9.task05;

public class Voucher {

	private TypeVoucher typeVoucher;
	private Transport transport;
	private int nutrition; // количество кормежек;
	private int amountDay;

	public Voucher() {

	}

	public Voucher(TypeVoucher typeVoucher, Transport transport, int nutrition, int amountDay) {
		this.typeVoucher = typeVoucher;
		this.transport = transport;
		this.nutrition = nutrition;
		this.amountDay = amountDay;
	}

	public TypeVoucher getTypeVoucher() {
		return typeVoucher;
	}

	public void setTypeVoucher(TypeVoucher typeVoucher) {
		this.typeVoucher = typeVoucher;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public int getNutrition() {
		return nutrition;
	}

	public void setNutrition(int nutrition) {
		this.nutrition = nutrition;
	}

	public int getAmountDay() {
		return amountDay;
	}

	public void setAmountDay(int amountDay) {
		this.amountDay = amountDay;
	}

	@Override
	public String toString() {
		return "Voucher [typeVoucher=" + typeVoucher + ", transport=" + transport + ", nutrition=" + nutrition
				+ ", amountDay=" + amountDay + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amountDay;
		result = prime * result + nutrition;
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((typeVoucher == null) ? 0 : typeVoucher.hashCode());
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
		Voucher other = (Voucher) obj;
		if (amountDay != other.amountDay)
			return false;
		if (nutrition != other.nutrition)
			return false;
		if (transport != other.transport)
			return false;
		if (typeVoucher != other.typeVoucher)
			return false;
		return true;
	}

}
