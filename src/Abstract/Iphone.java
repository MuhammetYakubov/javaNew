package Abstract;

public class Iphone extends Phone {

	@Override
	public void call() {
		System.out.println("Iphone is calling");
	}
	@Override
	public void internetConnection() {
		System.out.println("iphone internet");
	}
}
