package exceptions;

public class Catch1 {
    public static void main(String[] args) {
        String name = "james";
        try{
            System.out.println(name.charAt(10));
        }catch (StringIndexOutOfBoundsException | NullPointerException e){  //(Exception e)
            System.out.println("Invalid");
        }
        System.out.println("End of the programm");
    }
}
