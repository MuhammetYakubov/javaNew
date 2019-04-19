package myTeam;
import java.util.*;
public class MondayTaskZombies2 {
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int [8];
	    
	    for(int i=0; i<inhabitants.length; i++) { 
	      inhabitants[i] = input.nextInt();
	  }
	      String day= "Day ";
          boolean check= true;
          int count= 0;
          int dayCount= 0;
          
          
          int[] copy = new int[8];

          do {
        	  count= 0;
              for(int people: inhabitants) {
                  if(people == 0) {
                      count++;
                  }
                  
                  if(count == 8) {
                      check= false;
                  }
              }
              
              System.out.println(day + dayCount + " " + Arrays.toString(inhabitants));
              dayCount++;
              
              for(int i= 0; i < inhabitants.length-1; i++) {
                  
                  if(inhabitants[i + 1] == 0) {
                      inhabitants[i] = inhabitants[i]/2;
                      continue;
                  }
             
                  if(inhabitants[i] == 0) {
                      inhabitants[i+1] /= 2;
                      i++;
                  }
                  
              }
              
              
              
          } while(check);
          
          System.out.println("---- EXTINCT ----");
}      	      
}
	