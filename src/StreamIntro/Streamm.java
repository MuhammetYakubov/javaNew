package StreamIntro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Streamm {
    public static void main(String[] args) {
        List<String> StringLinst = new ArrayList<>();

        StringLinst.add("appl");
        StringLinst.add("garant");
        StringLinst.add("cherry");
        StringLinst.add("pineppl");

        Predicate predicate = (Object s) ->{
            if(s.equals("")){
                return false;
            }
            return true;
        };

     //   StringLinst.stream().forEach( f -> System.out.println(f));

//filter takes predicate and predicate is functional interface filter predicate is kinda if else statement
// forEahc takes consumer interface implemention

        StringLinst.stream().filter((String o) -> o.equalsIgnoreCase("a")).forEach( f -> System.out.println(f));

//            for (int i = 0; i < StringLinst.size(); i++){
      //  if(StringLinst.get(i).startsWith("a"));
//                System.out.println(StringLinst.get(i));
//            }
    }
}
