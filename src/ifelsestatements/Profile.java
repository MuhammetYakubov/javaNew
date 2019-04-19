package ifelsestatements;

import java.util.Scanner;

public class Profile {

	public static void main(String[] args) {
		String color = "blue";
		color.equals("red");
		int size = color.length();
		System.out.println(size);
		
        Scanner sc = new Scanner(System.in);
		System.out.println("Please craete your password");
		String  password = sc.nextLine();
		
		int length1 = password.length();
		
		if (length1 >= 5 && length1 <=12) {	
			System.out.println(password +"created!");
		} 
		else {
			if (length1 < 5) {
		
				System.out.println("Password length is too short");
			}
			else {
				System.out.println("Password length is too long");
			}
		}
		}
}