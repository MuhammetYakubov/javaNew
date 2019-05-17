package ArraysList;

public class Item {

	String name;
	double price;

	public Item(String name, double price) {
		this.name = name;
		this.price = price;

	}

	public void info() {
		System.out.println("\nItem Information");
		System.out.println("Name: " + this.name);
		System.out.println("Price: " + this.price + " $");
	}
}
