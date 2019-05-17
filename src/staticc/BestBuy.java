package staticc;

public class BestBuy {

	static int numOfComputers;
	String location;
	static String day = "Sunday";
	
	
	
	
	static {
     System.out.println("First static block");
		if(day.equals("Sunday")) {
			numOfComputers = 995;
		}else {
			numOfComputers = 51110;
		}
	}
	
	static { 
		System.out.println("Second static block");
	}
	
	
	public void sellComputer() {
		System.out.println("Computer is sold");
		numOfComputers--;
	}
}
