package exceptions;

public class Pause {
    public static void main(String[] args) {
        System.out.println("Hello World");
        try {
            Thread.sleep(5000);
        }
        catch (Exception e){
            System.out.println("Something interrupted the sleep");
        }
        System.out.println("End of program");
    }
}
