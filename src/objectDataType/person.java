package objectDataType;

public class person {//object / instance
String name;// above the instance / object ... and its instance variable
int age;
String gender;

public void talk() {
	String name = "james";
	System.out.println(name);
	
	System.out.println(this.name);
}
}
