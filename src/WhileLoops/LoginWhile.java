package WhileLoops;

public class LoginWhile {
public static void main (String[] args) {
	int num = 0;
	while(2>0) {
		System.out.println("Hi there "+num);
		
		if(num == 4) {	
	 num++;
	 break; 
		}else if (num == 2) {
			continue;
		}
	 
	}
}
}
