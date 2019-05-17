package encapsulation;

public class training {

	private int x;
	private int y;
	private int result;


	  public int getResult(){
	  return result;
	}
	  public void setY(int y){
	    this.y = y;
	  }
	  public void setX(int x){
	    this.x = x;
	  }
	  public void plus(){
	   this.result = x+y;
	  }
	  public void minus(){
	    this.result = x-y;
	  }

	
	  
	  private String firstName,lastName;
	  private int age;
	  
	  public String getFirstName(){
	    return firstName;
	    
	  }
	  public void setFirstName(String firstName){
	    this.firstName = firstName;
	    
	  }
	  public String getLastName(){
	    return lastName;
	    
	  }
	  public void setLastName(String lastName){
	    this.lastName = lastName;
	    
	  }
	  public int getAge(){
	    return age;
	    
	  }
	  public void setAge(int age){
	    this.age = age;
	    
	  }
	  
	  public String toString(){
	    return firstName + " | " + lastName + " | " + age;
	  }
}
