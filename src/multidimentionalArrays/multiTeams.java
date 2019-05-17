package multidimentionalArrays;

import java.util.Arrays;

public class multiTeams {
public static void main(String[] args) {
	 String [][] groups = new String[3][];
     
     // Task
     // Create 3 String arrays - 3 groups.
     // 1st array size of 2, 2nd array size of 5, 3rd array size of 4
     // Give names for all elements
     // 
     String [] team3 = {"Adam", "James"};
     String [] team2 = {"Benzema", "Bale", "Modric", "Kaylor", "Marcelo"};
     String [] team1 = {"Messi", "Alba", "Suarez", "Dembele"};
     groups[0] = team1;
     groups[1] = team2;
     groups[2] = team3;
//   System.out.println(Arrays.toString(team2));
//   // groups[1][3] --> Keylor
//   System.out.println(groups[1][3]);
//   // print "Adam" and "Suarez"
//   System.out.println(groups[2][0]);
//   System.out.println(groups[0][2]);
//   // Print all teams using Arrays toString method.
//   // team1 ==> groups[0], team2 ==> groups[1]
     
   System.out.println(Arrays.toString(groups[1]));
   System.out.println(Arrays.toString(groups[2]));
   System.out.println();
     // Print each teams members using Arrays toString and using loop.
//   System.out.println(groups.length);
     for(int i = 0; i < groups.length; i++) {
         for(int j = 0; j < groups[i].length; j++) {
             System.out.print(groups[i][j] + " ");
         }
         System.out.println();
     }
}
}
