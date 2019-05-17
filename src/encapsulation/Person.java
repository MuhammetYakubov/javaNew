package encapsulation;

public class Person {

	private String name;
	private String gender;
	private int age;
	private double height;
	private double weight;
	
	public void info() {
		System.out.println("Name: "  + name);
		System.out.println("Gender: "  + gender);
		System.out.println("Age: "  + age);
		System.out.println("Height: "  + height);
		System.out.println("Weight: "  + weight);
	}
	
	public static void getHaircut (Person person) {
		if(person.getGender().equals("male")) {
			System.out.println(person.getName() + " is getting haircut at Men Barbershop");
		} else if(person.getGender().equals("female")) {
			System.out.println(person.getName() + " is getting haircut at Womens Hair Salon");
		} else {
			System.out.println("Not able to get a haircut");
		}
		
	}
	
	public static void getMarried (Person p1, Person p2) {
		
		if(p1.age >= 18 && p2.age >= 18) {
			
			if((p1.gender.equals("male") && p2.gender.equals("female")) || (p2.gender.equals("male") && p1.gender.equals("female"))) {
				System.out.println("Valid marriage");
			} else {
				System.out.println("Invalid Marriage");
			}
			
		} else {
			System.out.println("Too young to get married");
		}
		
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) {
			this.gender = gender;
		} else {
			System.out.println("Invalid gender");
		}
				
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 0 && age <= 120) {
			this.age = age;
		} else {
			System.out.println("Invalid Age");
		}
		
		
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if(height > 0) {
			this.height = height;
		} else {
			System.out.println("Invalid height");
		}
		
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight > 0) {
			this.weight = weight;
		}
	}
	
}
