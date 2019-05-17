package staticc;

public class Shopping {

	public static void main(String[] args) {
		BestBuy b1 = new BestBuy();
		b1.location = "Chicago";
		BestBuy b2 = new BestBuy();
		b2.location = "Des plains";
		BestBuy b3 = new BestBuy();
		b3.location = "Ohare Area";
		System.out.println(b1.location);
		
		BestBuy b4 = new BestBuy();
		b4.day = "Sundayy";
		System.out.println(b4.day);
//		BestBuy.numOfComputers = 90;
//		System.out.println(b1.numOfComputers);
//		b2.numOfComputers = 45;
//		System.out.println(b3.numOfComputers);
//		b1.sellComputer();
//		System.out.println(BestBuy.numOfComputers);
		
		System.out.println(BestBuy.numOfComputers);
		
	}
}
