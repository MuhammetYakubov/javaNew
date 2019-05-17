package encapsulation;

public class checkPerson {

public static void main(String[] args) {
		
		Person p1= new Person();
		
		p1.setAge(30);
		p1.setName("james");
		p1.setGender("male");
		
		Person.getHaircut(p1);
		
		Person p2= new Person();
		
		p2.setGender("female");
		p2.setName("jamie");
		p2.setAge(30);
		
		Person.getHaircut(p2);
		
		Person p3 = new Person();
		
		p3.setAge(18);
		p3.setGender("male");
		
		Person.getMarried(p2, p3);
		
		
	}
	
	
}
