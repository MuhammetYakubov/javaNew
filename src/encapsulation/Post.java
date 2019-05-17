package encapsulation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Post {
	private static ArrayList<String> comments = new ArrayList<>();
	private int likes;
	private String date;
	private String postBody;

	public static ArrayList<String> getComment() {
		return comments;
	}

	public static void setComment(ArrayList<String> comment) {
		Post.comments = comment;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPostBody() {
		return postBody;
	}

	public void setPostBody(String postBody) {
		this.postBody = postBody;
	}

	public Post(String postBody) {
		if (postBody.isEmpty()) {

			System.out.println("post has no body");

		} else {

			this.postBody = postBody;

		}
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String dateStr = dateFormat.format(date);
		this.date = dateStr;
	}

	public void info() {
		System.out.println("Post Body: " + this.postBody);
		System.out.println("Date: " + this.date);
		System.out.println("Likes: " + this.likes);
		int counter = 1;
		for (String com : this.comments) {
			System.out.println("Comment: " + counter + " " + com);
		counter++;
		}
	}

	public void editPost() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your new post:");
		String neww = sc.nextLine();
		this.postBody = neww;
	}

	public void deleteComment(String comment) {

		this.comments.remove(comment);

	}

	public void addComment(String comment) {
		if(!comment.isEmpty() && !comment.contains("hell") || !comment.contains("crap") || !comment.contains("heck")) {
			
		this.comments.add(comment);
	
	}else {
		System.out.println("comment is empty or contains badwords");
	}
	}
	
	public void like() {
		
		this.likes++;
		
	}
	
	
	
		
	
}
