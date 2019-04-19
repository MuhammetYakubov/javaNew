package Presentation;
import java.util.Scanner;
import java.util.Random;
public class Characters {
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	String massage;
    	Random connect = new Random();
    	boolean sent,delivered = false;
    	System.out.println("please enter your massage");
    	massage = sc.nextLine();
    	if(massage.length()>=15) {
           sent = true;
    	}
    	else {
    		sent=false;
    	}
    System.out.println("Massage: "+massage);
    System.out.println("Sent: "+sent);
    
    if (sent) {
        System.out.println("Message: " + massage);
        System.out.println("Sent: " + sent);
        
        int del= connect.nextInt(10);
        
        if(del %2 == 0) {
            delivered= true;
        } else {
            delivered= false;
        }
    } 
    
    
    
    System.out.println("Delivered: " + delivered);
    
    
    }
    
}
