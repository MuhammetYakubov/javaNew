package Casting;

public class PrimitiveCasting {
   public static void main(String[] args) {
	short s = 45;
	int age = s;
	System.out.println(age);
	int size = age;
	System.out.println(size);
	byte b = (byte)size;
	System.out.println(b);
	

	double d = 45.6;
	int ss = (int)d;
	System.out.println(ss);
	String str = "0.43";
	double seconds = Double.valueOf(str);
	System.out.println(seconds);
   }
}
