package methods;

public class StringManiGoole {
public static void main(String[] args) {
	String  returnType = "About 691,000,000 result(0.78 seconds)";
	String count = resultTime(returnType);
	System.out.println(count);
}
public static String resultTime(String res) {
	String r = res.substring(res.indexOf("(")+1, res.length()-1);
	return r;
}
}

//String  returnType = "About 691,000,000 result(0.78 seconds)";
//String count = resultTime(returnType);
//System.out.println(count);
//}
//public static String resultTime(String res) {
//String[] splittedValue = res.split("(");
//String s = splittedValue[1];
//s = s.replace(")","");
//return s;
//}