package SuperPackage;

public class Wall {
	String material;
	final String color;
	
	
	
	public static void main(String[] args) {
		Wall w = new Wall("Glass"); 
			System.out.println(w.color);
			System.out.println(w.material);
			
	}
	
	public Wall() {
		this.color = "Purple";
	}
	//Rule for final: You can have instance variable as final
	// You must give a value if your instance variable is final
	// OR you can just declare But you MUST initialize through constructor
	
	
	public Wall(int i ) {
		this.color = "Orange";
	}
	
	public Wall(String material) {
		this.material= material;
		this.color = "Pink";
	}
}
