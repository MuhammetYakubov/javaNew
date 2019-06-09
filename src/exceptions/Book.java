package exceptions;

public class Book {
    public static void main(String[] args) {


        String name = "james";
        String s = "mik";
        try{

            System.out.println("Hello");
            System.out.print(name.charAt(10));
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println("Null is here");
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("something");
        }
        catch (Exception e){
            System.out.println("General exception");
        }


        System.out.println("End of program");

    }
}
