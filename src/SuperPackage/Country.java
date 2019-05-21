package SuperPackage;

public class Country {
	final int population = 10000;
	String name;
	final String capital;
	
	
	
	public Country(String capital) {
		this.capital = capital;
	}
	
	public Country() {
		super();
		capital = "Ankara";
	}
	
	public void anthem() {
		System.out.println("Anthem method in Country class");
	}
}
