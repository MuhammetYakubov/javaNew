package StreamIntro;

import java.util.ArrayList;
import java.util.List;

public class streamOneByOne {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(8);
        num.add(3);
        num.add(4);
//intermediate operetor takes string retruns string;
        //termninate operater takes strinng returns nothing cuz it void;
        num.stream().filter((Integer i) -> i%2 == 0).map(m -> m + ": is even").sorted().forEach( i -> System.out.println(i));

        //stream one by one ,stream batch


    }
}
