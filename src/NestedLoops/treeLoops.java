package NestedLoops;

public class treeLoops {
public static void main(String[] args) {

	 int i =0;
     for(; i<8; i++){
      for(int j = 0 ; j<8-i; j++){
        System.out.print(" ");
      }
      for(int f = 0 ; f<1+i*2; f++){
        System.out.print("*");
      }System.out.println("");
      
     }
	
	
//		for (int i = 1; i < 6; i++) {
//
//		for(int j = 0; j < i; j++) {
//			
//			System.out.print("*");
//		}
//		System.out.println();
//	}
}
}
