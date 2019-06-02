package Abstract;

import java.sql.SQLOutput;

abstract public class Chair {
    String model,color;
    double weight;

     public abstract void sit();
     public abstract void stepOnIt();


    public void changeColor(String color){
        System.out.println("Color is changing to: " + color);
        this.color = color;
    }

}
