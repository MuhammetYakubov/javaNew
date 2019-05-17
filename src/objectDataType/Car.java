package objectDataType;

public class Car {

	String make;
	int year;
	boolean sportEdition;
	int mileage;
	
	
	public void drive() {
		mileage +=10;
		System.out.println(year + " year, " + make + " make is driving");
	
		
	}
	public void drive (String destination) {
		mileage +=10;
		System.out.println(year + " year, " + make + " make is driving to " + destination +" destination");
		
	}
	public void drive (int mile) {
		mileage += mile;
		System.out.println(year + " year, " + make + " make is driving " + mile + " miles");
		
}
}