package lambda;

public class MultiplePar {
    public static void main(String[] args) {

        MultipleParInterface Multi = (String p, int i ) -> {

                return p+i ;};

        Multi.Multi("Muhammet", 20);

        System.out.println(Multi);
    }
}
