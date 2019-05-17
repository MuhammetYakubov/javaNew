package objectDataType2;

public class Phone {

	boolean touchScreen;
	String model;
	int memory;
	String color;
	int phoneNumber;

	public Phone(String model, String color) {
		this.model = model;
		this.color = color;

	}

	public Phone(String model, String color, int memory, boolean touchscreen) {
		this.model = model;
		this.color = color;
		this.touchScreen = touchscreen;

		if (memory < 0) {
			System.out.println("invalid memory");
		} else {
			this.memory = memory;
		}
	}

	public boolean text(long phoneNum, String text) {
		String numl = phoneNum + "";

		if (numl.length() == 10 && !text.isEmpty()) {
			System.out.println(text + " textBody sent to " + phoneNum + " given PhoneNumber");
			return true;
		} else {
			System.out.println("Invalid phone number or text body");
			return false;
		}
	}
	
	public void call(long PhoneNum) {
		String l = PhoneNum + "";
		
		if(l.length() == 10) {
			System.out.println("Calling to " + PhoneNum);
		}else {
			System.out.println("Invalid phone number");
		}
	}
	
	
	
}
