package multidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

import arrayDataDriven.newFile;

public class traingin2 {
	public static void main(String[] args) {
int[] arr2 = {1,2,3};
System.out.println(Arrays.toString(deleteR(arr2, 2)));
	

int[] arr = {1,2,3};
int[] arr1 = {4,5,6};
System.out.println(Arrays.toString(mergR(arr, arr1)));

	}
	
	public static int[] deleteR(int[] arr,int element) {
	    
		  int[] newArr = new int [arr.length-1];
		  
		  for(int i = 0, j = 0; i < arr.length; i++) {
			  if(arr[i] != element) {
				  newArr[j] = arr[i];
				 j++;
			  }
		  }
		  return newArr;
	  }
		 
		 
	public static int[] mergR(int[] a,int[] b) {
		
	    int[] newArr = new int[a.length + b.length];
	    for(int i = 0; i < newArr.length; i++){
	      newArr[i] = a[i] + b[i];
	      
	    }
	   return newArr;  
	}
		   
public static String lameDb(String db, String op,String id,String data)
{
  
		    
		     if (op.equals("add")) {
		       return db + "#" + id + data;
		     }
		     if (op.equals("edit")) {
		    	 String [] spl = db.split("#");
		    	 db = "";
		    	 for (int i = 0; i < spl.length; i++) {
			         if (spl[i].startsWith(id)) {
			           spl[i] = id + data;  
		     }
			         db += spl[i] + "#";
		    	 }
		    	 return db.substring(0, db.length() - 1);
		     }
		     if (op.equals("delete")) {
		       
		       String [] spl = db.split("#");
		       db = "";
		       for (int i = 0; i < spl.length; i++) {
		         if (spl[i].startsWith(id)) {
		           
		           continue;
		         }
              db += spl[i] + "#";
		       }
		      
		       return  db.substring(0, db.length() - 1);
		     }
		     return db;
		     
		    }//end lameDb
} 
