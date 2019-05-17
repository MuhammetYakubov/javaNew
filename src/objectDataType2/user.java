package objectDataType2;

public class user {

	public static void main(String[] args) {
		FacebookUser f1 = new FacebookUser("Ernest@gmail.com", "asdf;lkj");
		f1.name = "Ernest";
		f1.numOfFriends = 123;
		f1.age = 34;

		FacebookUser f2 = new FacebookUser("HelloHello@gmail.com", "mypassword");
		f2.name = "FGEEE";
		f2.numOfFriends = 342;
		f2.age = 43;

		FacebookUser f3 = new FacebookUser("John wick", "jwick", "jwick2019");
		System.out.println(f3.name);
		System.out.println(f3.password);

		boolean check = f1.sendFriendRequest(f2);
		System.out.println(check);
		System.out.println(f1.numOfFriends);
		System.out.println(f2.numOfFriends);
		System.out.println();
		
		f1.info();

	}
}
