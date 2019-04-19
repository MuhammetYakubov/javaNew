package NestedLoops;

public class LoopBreak {
public static void main(String[] args) {
	myOuterLoop:
		for(int i = 0; i < 5; i++) {
	  myInterSpirit:
			for(int j = 0; j < 10; j++) {
					
				if(j == 5) {
					continue myInterSpirit;
				}
			if(j == 7) {
						
					break myOuterLoop;
				
				}
	System.out.print(j);		
			}
		}
}
}
