package forEachLoops;

public class TwoArrays {
public static void main(String[] args) {
	String[] phones = {"Iphone", "Samsung", "LG", "Google Pixel", "Motorola"};
	String[] phones2 = {"Iphone", "Samsung", "LG", "Google Pixel", "Motorola"};
    int counter = 0;
	for(int i = 0; i < phones.length; i++) {
    	if(phones[i].equals(phones2[i])){
    		counter++;	
    		}	
    	}if(counter == phones2.length) {
    		System.out.println("Two arrays are same");
    	}else {
    		System.out.println("Two arrays are different");
    	}
	
    

}
}
