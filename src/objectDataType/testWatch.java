package objectDataType;

import javax.sound.midi.MidiDevice.Info;

public class testWatch {
public static void main(String[] args) {
	////
	Watch watch1 = new Watch();
	watch1.brand = "rolex";
	watch1.color = "gold";
//	watch1.material = "rubber";
	watch1.price = 2222222.0;
	watch1.type = "gold";
	
	watch1.info();
	
	System.out.println();
	System.out.println(watch1.color);
	
	watch1.tick();
	////
	
	
	Watch watch2 = new Watch();
	watch2.brand = "iWatch";
	watch2.price = 999.99;
	watch2.material = "Plastic";
	System.out.println();
	watch2.tick();
	
	
	
	
	
	
	
}
}
