package objectDataType;

public class Watch {
     // instance variables
	String brand;
	String style;
	String color;
	String material;
	double price;
	String type;
	
	
	// methods
	public void tick() {
		System.out.println(brand + " Watch is ticking");
	}
	public void showTime() {
		System.out.println("Watch is showing the time");
	}
	public void showDate() {
        System.out.println("Watch is showing the date");
}
	
	
	
	public void info() {
		if(brand != null) {
			System.out.println("brand: " + brand);
		}
		if(style != null) {
			System.out.println("style: " + style);
		}
		if(color != null) {
			System.out.println("color: " + color);
		}
		if(material != null) {
			System.out.println("mateial: " + material);
		}
		if(price != 0) {
			System.out.println("price: " + price);
		}
		if(type != null) {
			System.out.println("type: " + type);
		}
		
		
	}
}