package methods;

public class intString {
public static void main(String[] args) {
	stringInt("Bond", 4);
}
public static void stringInt(String name, int num) {
	if(name.length()==(num)) {
		System.out.println("They are equals");
	}else {
		System.out.println("Not equals");
	}
}
}
