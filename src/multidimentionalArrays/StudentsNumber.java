package multidimentionalArrays;
import java.util.Scanner;
public class StudentsNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter number of groups:");
	int sizeOfGroup = sc.nextInt();
		sc.nextLine();
	String [][] groups = new String[sizeOfGroup][];
	
	for(int i = 0; i < groups.length; i ++) {
		
		System.out.println("Please enter number of students for group "+(i+1));
		
        int memberNum = sc.nextInt();
        sc.nextLine();
        String[] group = new String[memberNum];
        
	    for(int j = 0; j < group.length; j++) {
	    	
	    	System.out.println("Enter name " + (j+1)+ " :");
	    	
	    	group[j] = sc.nextLine();
	    }
	    groups[i] = group;
	}
	
}
}
