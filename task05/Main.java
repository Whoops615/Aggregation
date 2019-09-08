package by.htp.home.main9.task05;

import java.util.List;

/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Main {

	public static void main(String[] args) {

		OfferVoucher ov = new OfferVoucher();

		ov.add(new Voucher(TypeVoucher.RELAXATION, Transport.BUS, 2, 14));
		ov.add(new Voucher(TypeVoucher.CRUISE, Transport.AIRCRAFT, 3, 10));
		ov.add(new Voucher(TypeVoucher.TREATMENT, Transport.TRAIN, 4, 7));
		ov.add(new Voucher(TypeVoucher.EXCURSION, Transport.TRAIN, 1, 3));
		ov.add(new Voucher(TypeVoucher.EXCURSION, Transport.AIRCRAFT, 2, 7));
		ov.add(new Voucher(TypeVoucher.RELAXATION, Transport.AIRCRAFT, 2, 3));
		ov.add(new Voucher(TypeVoucher.CRUISE, Transport.TRAIN, 4, 14));
		ov.add(new Voucher(TypeVoucher.TREATMENT, Transport.BUS, 3, 7));
		ov.add(new Voucher(TypeVoucher.RELAXATION, Transport.BUS, 3, 10));
		
		
		printList(OfferVoucherLogic.searchNutrition(ov.getVouchers(), 2));
		

	}

	public static void printList(List<Voucher> list) {
		for (Voucher v : list) {
			System.out.println(v.toString());
		}
	}

}
