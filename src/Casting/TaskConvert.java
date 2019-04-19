package Casting;

public class TaskConvert {

	public static void main(String[] args) {
       System.out.println("Published on Feb 12, 2018");
     
       String name = "Published on Feb 12, 2020";
       int indexOfComma = name.indexOf(",");
       String name2 = name.substring(indexOfComma+2);
        System.out.println(name2); 
       int num = Integer.valueOf(name2);
      
       if (num <= 2019) {
    	  System.out.println("valid year");
       }else {
    	System.out.println("Invalid year");  
      }
       

	}

}
