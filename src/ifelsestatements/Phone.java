package ifelsestatements;

public class Phone {
    
	public static void main(String [] args) {
		String color = "Grey";
		int memory = 128;
		String modelString = "Iphone X";
		System.out.println("Color is changing to Gold");
		color = "Gold";
		int size = color.length();
		memory = 512;
		
		if (memory >=512) {
			System.out.println("Good phone");
		}
		else {
			System.out.println("okay phnoe ");
		}
		
	}
}
