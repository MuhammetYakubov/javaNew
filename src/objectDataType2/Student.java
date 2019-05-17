package objectDataType2;

public class Student {

	String name;
	int age;
	String email;
	
	public void read () {
		System.out.println(this.name + " is reading.");
	}
	
	public void read(int hours) {
		System.out.println(this.name + " is reading for " + hours + " hours.");
	}
	
	public void read(Book book) {
		System.out.println(this.name + " is reading " + book.title + " by " + book.author );
	}
}
