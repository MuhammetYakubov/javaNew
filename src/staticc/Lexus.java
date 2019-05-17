package staticc;

public class Lexus {

	
	String model;
	int year; 
	String color;
	int milage;
	boolean isNew;
	double price;
	static int totalLexus;
	
	public  Lexus(String model, int year) {
		this.model = model;
		this.year = year;
		totalLexus++;
		
	}

	public static double mileToKm(double milage) {
		return milage * 1.6;
	}
	
	public static void elauateCar(Lexus car) {
		
		int age = 2019 - car.year; 
		
		if(car.milage < 50000 && age < 3) {
			
			System.out.println("Best Choice");
			
		}else if((car.milage > 50000 && car.milage < 100000) && age > 3 && age < 7){
		
			System.out.println("Fair Choice");
			
		}else if(car.milage > 100000 && car.milage < 200000) {
			
			System.out.println("You decide");
		
		}else if(car.milage > 200000){
		
			System.out.println("Stay away");
		
		}else {
		
			System.out.println("Not able to evaluate");
	
		}
	}
	
	
	
}
