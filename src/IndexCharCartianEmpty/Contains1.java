package IndexCharCartianEmpty;

public class Contains1 {
	public static void main(String[] args) {
		
	
//		String color = "Blue";
//		double price = 44.99;
//		boolean isSunny = true;
//		String s = " ";
//		String result = color + " " + price + s + isSunny;
//		//result -> Blue44.99
//		String priceInString = price + "";
//		System.out.println(priceInString);
//		boolean check = priceInString.isEmpty();
//		System.out.println(check);
		
		String color = "Blue, red, yellow, white";
		boolean check = color.contains("Blue");
		System.out.println(check);
		char c = color.charAt(2);
		System.out.println(c);
}
}