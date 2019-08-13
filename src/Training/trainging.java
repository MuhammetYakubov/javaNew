package Training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class trainging {
    public static void main(String[] args) {

      //  Integer num = 10;
        Integer num1 = Integer.parseInt("123");
        System.out.println(num1);
        System.out.println(arr(123));

       

        int[] arr = {1, 2, 3, 6, 7, 8, 10};

        int check = 1;

        ArrayList<Integer> arrNew = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (check == arr[i]) {
                check++;
                continue;

            } else {
                arrNew.add(check);
                i--;
                check++;
            }
        }
        System.out.println("missing numbers are ");
        for (int r : arrNew) {
            System.out.print(" " + r);
        }

    }

    public static int arr(int digit) {
        int sum = 0;
        for (int i = 1; i <= digit; i++) {
            char[] c = (i + "").toCharArray();
            sum = 0;
            for (char j : c) {
                sum += Integer.parseInt(j + "");
            }
        }
        return sum;

    }
}



