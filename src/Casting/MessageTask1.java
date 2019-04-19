package Casting;

public class MessageTask1 {
public static void main(String[] args) {
	String SMSmessage = ("Sender:<Mike Smith>.From Numer:[202-123-3456].Message:{I love programing and problem solving}");
    int senderStart  = SMSmessage.indexOf("<")+1;
    int senderEnd = SMSmessage.indexOf(">");
    
    int phoneNumberStart = SMSmessage.indexOf("[")+1;
    int phoneNumberEnd = SMSmessage.indexOf("]");
    
    int messageStart = SMSmessage.indexOf("{")+1;
    int messageEnd = SMSmessage.indexOf("}");
    
    String sender1 = SMSmessage.substring(senderStart, senderEnd);
    String phoneNumber1 = SMSmessage.substring(phoneNumberStart, phoneNumberEnd);
    String message1 = SMSmessage.substring(messageStart, messageEnd);
    System.out.println(sender1);
    System.out.println(phoneNumber1);
    System.out.println(message1);
   }
}
