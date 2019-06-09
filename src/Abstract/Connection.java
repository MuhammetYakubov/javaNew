package Abstract;
import java.util.Arrays;
public class Connection {

	public static void main(String[] args) {
	//	Phone p = new Phone();
	//	p.call();
		
		Nokia n = new Nokia();
		n.call();
		n.internetConnection();
		n.model="";


		System.out.println();
		Iphone i = new Iphone();
		i.call();
		i.internetConnection();
		

	
}
}
