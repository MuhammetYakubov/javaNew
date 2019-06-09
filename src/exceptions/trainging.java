package exceptions;

import java.util.ArrayList;
public class trainging {
    public static void main(String[] args) {

        int[] arr ={1,2,3,6,7,8,10};
        int check = arr[0];
        //System.out.println(check);
        ArrayList<Integer> arrNew = new ArrayList<>();
       // ArrayList<Integer> arrNew1 = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(check == arr[i]){
                check++;
                continue;

            }
            else
            {
                arrNew.add(check);
                i--;
               check++;
            }
        }
        System.out.println("missing numbers are ");
        for(int r : arrNew)
        {
            System.out.print(" " + r);
        }

        }
    }



