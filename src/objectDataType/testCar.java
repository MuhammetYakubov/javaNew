package objectDataType;

public class testCar {
	public static void main(String[] args) {

		Car car1 = new Car();
		car1.make = "MBW";
		car1.sportEdition = true;
		car1.year = 2018;
		car1.mileage = 100000;

		System.out.println(car1.mileage);
		car1.drive();
		System.out.println(car1.mileage);
		car1.drive(333);
		System.out.println(car1.mileage);
		car1.drive("home");
		System.out.println(car1.mileage);
	}
}
