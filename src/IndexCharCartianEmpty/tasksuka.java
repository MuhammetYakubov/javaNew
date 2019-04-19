package IndexCharCartianEmpty;

public class tasksuka {
 public static void main (String[] args) {
	 String s = "your account number: 2444444efdf";
	 int i = s.indexOf(":")+2;
	 System.out.println(i);
	 if(s.charAt(i) =='2') {
		 System.out.println("Cool");
	 }else {
		 System.out.println("not cool");
	 }
 }
}
