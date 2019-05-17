package encapsulation;

import objectDataType2.user;

public class PostCheck {
public static void main(String[] args) {
	
	
	Post p1 = new Post("What a come back!");
	p1.info();
	p1.editPost();
	
	System.out.println();
	p1.like();
	p1.addComment("yeee");
	p1.addComment("nooo");
	p1.info();
	
	System.out.println();
	User pp = new User("Muhammet", 20);
	User pp2 = new User("Jemshit", 16);
	
	pp.friends.size();
	pp.sendFriendRequest(pp2);
	pp.friends.size();
	
	System.out.println();
	pp.createPost("Wow");
	
	pp.info();
	System.out.println();
	for(int i = 0; i < pp.listOfPost.size(); i++) {
		pp.listOfPost.get(i).info();
	}
	
	System.out.println();
    User.seeTimeline(pp);
}
}
