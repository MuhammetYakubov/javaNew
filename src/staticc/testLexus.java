package staticc;

public class testLexus {
public static void main(String[] args) {
	
	System.out.println(Lexus.totalLexus);
	Lexus c1 = new Lexus ("Cs 54", 2013);
	System.out.println(c1.totalLexus);
	
		System.out.println(Lexus.mileToKm(12.0));
		System.out.println(Lexus.mileToKm(8.0));
		
		c1.milage = 251000;
		Lexus.elauateCar(c1);
	
}
}
