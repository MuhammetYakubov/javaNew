package methods;

public class ReturnMethod {
	public static void main(String[] args) {
		int m = getMemory(); //now it will come to here //step3, and it will print the message
		System.out.println(m); //this is coming from line 11
        String name = getDate();
        System.out.println(name);
         
	}
	
	public static int getMemory() {
		System.out.println("Returning the computer memory"); //step 1
		return 512; //this is the value representing computer memory (example) //step 2
		
	}
	public static String getDate() {
		return "April 13";
	}
}
