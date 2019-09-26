package StreamIntro;

import java.util.stream.IntStream;

public class StreamIntExample {

    public static void main(String[] args) {

        IntStream.range(1,12).distinct().forEach(f -> System.out.print(f+" "));

        IntStream.range(1,12).distinct().average();


        IntStream.rangeClosed(1, 10).forEach(f -> System.out.println(f+ " "));

    }
}
