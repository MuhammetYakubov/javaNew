package inheritance;

public class Student {

	String name;
	int age;
	String location;
	String grade;
	
	
	public void study(String course) {
		System.out.println("studying " + course + " course");
	}
	
	public void takeExam(int i) {
		if(i > 90) {
			this.grade = "A";
			
		}else if(i > 80 && i < 90) {
			this.grade = "AB";
			
		}else if(i > 70 && i < 80) {
			this.grade = "B";
			
		}else if(i > 60 && i < 70) {
			this.grade = "C";
			
		}else if(i < 60) {
			this.grade = "F";
			
		}
	System.out.println(grade);
	}
}
