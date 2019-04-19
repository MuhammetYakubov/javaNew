package arrayDataDriven;

public class ToString {
public static void main(String[] args) {
	int [] nums = {23,23,34,56,342,2};
	String space = "";
	for (int i = 0; i < nums.length; i++) {
		space = space + nums[i];
		space = space +", ";
		
	}
	space = space.substring(0,space.length()-2);
	System.out.print("["+space+"]");
	
	
	
	/*  String result = "[";
	 * if(i == nums.length;i++){
	 * if(i == nums.length-1){
	 *    result += nums[i] + "]";
	 *    }else{
	 *    result += nums[i] + ", ";
	 *    }
	 *    }
	 *    syso (result);
	 */
}
}
