package LIsts;

import java.util.*;

public class SetList {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();
        cars.add("Bmw");
        cars.add("Toyota");
        cars.add("Nissan");
        cars.add("Toyota");
        System.out.println(cars);

        List<String> carsList = new ArrayList<>(cars);

        System.out.println(carsList);
        System.out.println(carsList.get(1));
        Collections.sort(carsList);
        Collections.swap(carsList, 0,2);
        System.out.println(carsList);
//        for (String car: cars){
//            if(car.length() == 3)
//                cars.remove(car);
//        }

    }
}
