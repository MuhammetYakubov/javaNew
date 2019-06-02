package Abstract;

public class Test {
    public static void main(String[] args) {


        Aeron ar = new Aeron();
        ar.sit();
        ar.color = "blue";
        System.out.println(ar.color);

        ar.stepOnIt();
        ar.changeColor("white");
        System.out.println(ar.color);

        Rollable r = (Rollable)ar;
        Aeron a = (Aeron)ar;
        r.rollBack();
        System.out.println(a.color);


        Humanscale h = new Humanscale();
        Collapsible c = h;
    }
}