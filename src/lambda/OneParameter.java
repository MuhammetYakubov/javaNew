package lambda;

public class OneParameter {
    public static void main(String[] args) {


        OneParametrInterface one = (String p) -> {
            System.out.println(p+"s");
            return p;
        };

one.oneParametr("Muhammet");


    }
}