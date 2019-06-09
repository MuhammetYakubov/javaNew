package exceptions;

public class Charger {
    public static void main(String[] args) {

        int [] nums = {34,2,5};
        System.out.println("hello");
        try {
            System.out.println(nums[1]);
            String s = "hi";
            System.out.println(s.charAt(0));
          //  System.exit(0);
        }
        catch (Exception e){
            System.exit(0);
        }
        finally {
            System.out.println("Bye");
        }
    }
}
