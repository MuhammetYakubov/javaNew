package methods;

public class StringMani {
	 public static void main(String[] args) {
	        //method name: resultCount
	        //return Type String, accepts String as parameter
	        //String will be passed as google result count format
	        //print out only the count
	        
	        String result = "About 691,000,000 results (0.78 seconds)";
	        String count = resultCount(result);
	        System.out.println(count);
	        
	    }
	    
	    public static String resultCount(String res) {
	        String[] splittedValue = res.split(" ");
	        String s = splittedValue[1];
	        s = s.replaceAll(",", "");
	        return s;
	        
	    }
}
