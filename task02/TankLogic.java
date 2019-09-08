package by.htp.home.main9.task02;

public class TankLogic {

	public static void fill(Car c,int volume) {
		
		int current = c.getTank().getCurrentVolume();
		int resultfill = current+volume;
		c.getTank().setCurrentVolume(resultfill);
		
		
		
	}

}
