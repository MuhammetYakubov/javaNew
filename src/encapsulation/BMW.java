package encapsulation;

public class BMW {

	String model;
	int year;
	String color;
	double price;
	static int totalCars;
	
	public void drive() {
		System.out.println(this.model + " model is driving" );
	}
	public void stop() {
		System.out.println(this.model + " model is stopping");
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(this.year >= 1900 && this.year <= 2018) {
		this.year = year;
		}
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(this.price > 0 && this.price < 1000000) {
		this.price = price;
		}
	}
	public static int getTotalCars() {
		return totalCars;
	}
	public static void setTotalCars(int totalCars) {
		BMW.totalCars = totalCars;
	}
	
	public BMW(String model, int year) {
		this.model = model;
		this.year = year;
		totalCars++;
	}
	public static void wash (BMW car) {
		System.out.println(car.model + " is wahsed");
	}
}
