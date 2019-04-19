package Casting;
   
public class MessagTask2 {
  public static void main(String[] args) {
	String garage = "Toyota, Nissan, Honda, BMW, Mazerati, Ford";
	garage = garage.toLowerCase();
	if(garage.isEmpty()) {
		System.out.println("no cars in garage");
	}else {
		
	
	if(garage.contains("toyota") || garage.contains("nissan") ) {
		System.out.println("There is Japanese car in garage");
	}else {
		System.out.println("no japanese cars");
	}
	if(garage.contains("bmw")) {
		System.out.println("there is a german car in garage");
	}else {
		System.out.println("no german cars");
	}
	if(garage.contains("mazerati")){
		System.out.println("there is an italian car in garage");
	}else {
		System.out.println("no italian cars");
	}
	if(garage.contains("jaguar")) {
		System.out.println("there is an british car in garage");
	}else {
		System.out.println("no british cars");
	}
	}
}
}
