package objectDataType;

public class petShop {
	public static void main(String[] args) {

		Dog dog1 = new Dog();

		// instance ---> same as object.
		// instantiate ---> creating an object
		// Whenever we are using keyword "new" we are instantiating an object.

		dog1.age = 3;
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		dog1.bark();// simply calling the behavior method of Dog
	}
}
