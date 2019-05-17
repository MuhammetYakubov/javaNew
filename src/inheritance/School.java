package inheritance;

public class School {

	String name;
	String address;
	String type;

	public void giveHW() {
		System.out.println(this.name + "schoolNames is giving home work");
	}
	
	public void hostEvent(String date) {
		System.out.println("Hosting an event on " + date +" date" );
	}

}
