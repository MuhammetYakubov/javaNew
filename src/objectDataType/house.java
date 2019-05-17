package objectDataType;

public class house {

	String type;
	String address;
	int numRooms;
	
	public void info() {
		if(type != null) {
			System.out.println("Type: " + type);
		}
		if(address != null) {
System.out.println("address: " + address);
		}
		if(numRooms != 0) {
			System.out.println("numRooms: " + numRooms);
		}
	}
	
}
