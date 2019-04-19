package Arrayss;
import java.util.*;
public class RandomArrays {
public static void main(String[] args) {
	int [] ages = new int[50];
	Random r =  new Random();
	ages[0] = 23;
	ages[1] = 123;
	int age = r.nextInt(100);
	ages[2] = age; //------ creating random num in 2 index
	System.out.println(Arrays.toString(ages));
}
}
