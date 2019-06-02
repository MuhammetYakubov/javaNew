package Abstract;

public class Humanscale extends Chair implements Rollable,Collapsible{
    @Override
    public void sit() {
        System.out.println("Sitting on Humanscale chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("stepping on Humanscale chair");
    }

    @Override
    public void lock() {
        System.out.println("Humanscale is locked");
    }

    @Override
    public void unlock() {
        System.out.println("Humanscale is unlocked");
    }

    @Override
    public void fold() {
        System.out.println("Humanscale is folded");
    }

    @Override
    public void unfold() {
        System.out.println("Humanscale is unfolded");
    }

    @Override
    public void rollBack() {
        System.out.println("Humanscale is rolled back");
    }

    @Override
    public void rollForward() {
        System.out.println("Humanscale is rolled forward");
    }
}
