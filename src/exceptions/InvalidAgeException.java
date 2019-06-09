package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InvalidAgeException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = 0;
        try {
            age = input.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Entered age is not numeric");
            String s = "hi";
            try {
                System.out.println(s.charAt(5));
            }
            catch (StringIndexOutOfBoundsException ee){
                System.out.println("not valid index of 5");
            }
        }
        catch (Exception e){
            System.out.println("Any other exception happened");
        }
        System.out.println("Your age: " + age);
    }

}
