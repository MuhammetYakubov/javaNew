package mutableBuilder;

public class Main {
	 public StringBuilder replaceWith(String[] r,String replace,String replaceWith) 
	  {
		 StringBuilder s = new StringBuilder();
		 String str = "";
	   for(String i: r) {
		   if(i.equalsIgnoreCase(replace)) {
			   i = replaceWith;
			   
		   }
		   str+=i;
	   }
	   s.append(str);
	   return s;
	  }
}
