package forEachLoops;

public class Email {
public static void main(String[] args) {
	String[] emails = {"@Icloud.com", "yandexcom", "Goole", "@yahoo","Muhammet.com"};
	for(String valid:emails) {
		if(valid.contains("@") || (valid.contains("."))){
			System.out.println(valid);		
		}
	}
	
}
}
