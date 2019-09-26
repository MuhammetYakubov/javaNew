package StreamIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringMapList {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "muhammet",
                "yakup",
                "jemshit",
                "eje"
        );



        names.stream().filter((String r) -> r.length() >5).sorted().map(m -> m +" size" + m.length()).forEach(i -> System.out.println(i));

      List<String> list =  names.stream().filter((String r) -> r.length() <= 5).collect(Collectors.toList());

      String name = names.stream().filter((String r) -> r.length() <= 5).collect(Collectors.joining(", "));

        System.out.println( list);
        System.out.println( name);

    }
}
