package objectDataType2;

public class FacebookUser {

	String username;
	int age;
	String name;
	String password;
	int numOfFriends;
	
	
	public FacebookUser(String username, String password) {
		this.username = username;
		this.password = password;

	}
	
	public FacebookUser(String user, String pass, String name,int age, int numOfFriends) {
		this.username = user;
		this.password = pass;
		this.age = age;
		this.numOfFriends = numOfFriends ;
		this.name = name;
	}

	public FacebookUser(String name, String username, String password) {
		this.name = name;
		this.username = username;

		if (password.contains(username)) {
			System.out.println("password CANNOT contain username. PLease change the password");
			this.password = "";

		} else {
			this.password = password;
		}

	}



	
	
	
	
	
	public boolean sendFriendRequest(FacebookUser userFriends) {

		if (userFriends.numOfFriends >= 5000) {

			System.out.println(this.name + " UserName can’t accept friend request from " + userFriends.name);
			return false;
		} else {
			System.out.println(this.name + " sent friend request to " + userFriends.name);
			this.numOfFriends++;
			userFriends.numOfFriends++;
			return true;
		}
		
		
	}
	
	
	public void info() {
		System.out.println("System info: ");
		System.out.println("age: " + this.age);
		System.out.println("userName: " + this.username);
		System.out.println("numOfFriends: " + this.numOfFriends);
		System.out.println("name " + this.name);
	}

	
	
//	String username;
//	int age;
//	String name;
//	String password;
//	int friends;
//	
//	public FacebookUser(String user, String pass) {
//		this.username = user;
//		this.password = pass;
//	}
//	
//	public FacebookUser(String user, String pass, String name,int age, int friends) {
//		this.username = user;
//		this.password = pass;
//		this.age = age;
//		this.friends= friends;
//		this.name = name;
//	}
//	
//	public FacebookUser(String name, String user, String pass ) {
//		this.name = name;
//		this.username = user;
//		
//		if(!pass.contains(username)) {
//			this.password = pass;
//		} else {
//			System.out.println("Password cannot contain username, please change password");
//			this.password = "";
//		}
//		
//	}
//	
//	public boolean sendFriendRequest (FacebookUser addPerson) {
//		if(addPerson.friends >= 5000) {
//			System.out.println(addPerson.username + " can't accept friend request");
//			return false;
//		} else {
//			System.out.println("Friend request sent to " + addPerson.username);
//			addPerson.friends++;
//			return true;
//		}
//	}
//	
//	public void userInfo() {
//		System.out.println("Name: " + name);
//		System.out.println("Username " + username);
//		System.out.println("Age " + age);
//		System.out.println("Friends " + friends);
//		System.out.println();
//	}
}
