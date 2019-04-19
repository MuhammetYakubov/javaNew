package Loops;

public class ForMath {
public static void main(String[] args) {
//print every number from 0-50. skip the numbers that end with 3. ex: 3, 13, 23, 33..
    
    for(int i = 0; i <= 50; i++) {
        if(i % 10 == 3) {
            continue;
        }
        //or 2nd approach
        //String s = i + "";
        //if(s.endsWith("3")){
        //continue;
        System.out.println(i);
    }
  //another approach is i=3 and then increment by 10
}

}
