package by.htp.home.main9.task02;

public class WheelGroupLogic {
	
	public static void replaceWheel(Car c,int numberWhell, Wheel newWheel) {
		 
		c.getWheelGroup().getWheels().set(numberWhell, newWheel);
	}

}
