package encapsulation;

import java.util.ArrayList;

public class User {

	private String name;
	private int age;
	ArrayList<User> friends =  new ArrayList<>();
	ArrayList<Post> listOfPost = new ArrayList<>();
	private String location;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(this.age > 0 && this.age < 120) {
			
		
		this.age = age;
	
		}
		}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public User(String name, int age) {
		this.setAge(age);
		this.name = name;
		
	}
	
	public void sendFriendRequest(User p1) {
		if(this.friends.size() < 10 && p1.friends.size() < 10) {
			p1.friends.add(this);
			this.friends.add(p1);
			 System.out.println(p1.name + " successfully added to the friends list");
		}else {
			System.out.println("Maximum friends reached");
		}
	}
	
	public static void seeTimeline(User p2) {
		for(Post p: p2.listOfPost) {
			p.info();
		}
	}
	
	public void info() {
		System.out.println("\nUser Information");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("location: " + this.location);
		System.out.println("NumOfFriens: " + this.friends.size());
		System.out.println("Num of POst: " + this.listOfPost.size());
	}
	
	public void createPost(String postBody) {
		
		System.out.println(postBody+ " is posted succefsully");
		Post p = new Post(postBody);
		this.listOfPost.add(p);
		
	}
	
}
