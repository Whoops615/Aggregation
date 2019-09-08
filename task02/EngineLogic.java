package by.htp.home.main9.task02;

public class EngineLogic {
	
	public static boolean rideCar(Car c) {
		
		// если есть топливо, то едем, если нету не едем.
		
		if(c.getTank().getCurrentVolume() > 0) {
			return true;
		}
		
		return false;
	}

}
