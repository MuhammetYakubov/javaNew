package inputs;
       
public class Shorthand {
    
	 public static void main(String[] args) {
		 int minutes = 70;
		 minutes %= 60; //--> minutes = minutes % 60;
		 System.out.println(minutes);
		 minutes*=3; //minutes = minutes *3;
		 System.out.println(minutes);
		 
		 int age = 45;
		 int otherAge;
		 otherAge = age++;
		 System.out.println(otherAge);
		 System.out.println(age);
		 
		 System.out.println(++age);
		 int size2 = --age;
		 System.out.println(size2);
		 
		 int balance = 100;
		    boolean broke = balance < 20;
		    System.out.println(broke);
		    System.out.println(balance == 100);
		    
		    

	 }
}
