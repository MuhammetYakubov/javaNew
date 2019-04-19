package Loops;

public class rectangleScuare {
public static void main(String[] args) {
	int length = 4;
    int row = 4;
    for(int i =1;i<=row;i++){
       System.out.print("*");
      
      for(int j =1; j<=length;j++){
       
        if(i==1||i==row){System.out.print("*");
          
        }else{System.out.print(" ");}
        
        
      }System.out.print("*");
      System.out.println("");
      
    }
}
}
