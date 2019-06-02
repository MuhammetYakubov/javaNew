package Abstract;

public class Aeron extends Chair implements Rollable {


    @Override
    public void sit() {
        System.out.println("Sitting on the Areon Chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("Stepping on the Areon Chair");
    }

    @Override
    public void rollBack() {
        System.out.println("Areon chair is rolling back ");
    }

    @Override
    public void rollForward() {
        System.out.println("Areon chair is rolling forward");
    }
}
