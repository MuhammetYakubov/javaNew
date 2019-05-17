package returnMethods;

public class booleanReturn {
public static void main(String[] args) {
	boolean name = isWeatherSunny("Monda");
	if(name) {
		System.out.println("Let's do picnic");
	}else {
		System.out.println("Let's code");	
	}
    
}
public static boolean isWeatherSunny(String day) {
	if(day.equals("Monday")) {
		return true;// terminating method
	}else {
		System.out.println(day + " is not sunny");
		return false;
	}
}
}
