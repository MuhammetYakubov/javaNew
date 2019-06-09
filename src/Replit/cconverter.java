package Replit;
import java.util.*;
public class cconverter {

    public double [][] currency_rate;

        public  cconverter ()
        {
            currency_rate = new double [10][10];
            //dollar to euro
            currency_rate[1][2] =  0.5;
            //euro to  dollar
            currency_rate[2][1] = 2.0;


        }//end constractor

        public void yinterface()
        {
           S.o("welcome to Currency conventer");
            S.o("Currency codes\n 1 - US dollars\n 2 - Euros");

        }//end yinterface

        public void yinput()
        {
            int choice ,output;
            double input;

            Scanner in = new Scanner(System.in);
            S.o("Please choose the input currency:");
            choice = in.nextInt();
            S.o("Please choose the output currency: ");
            output = in.nextInt();
            S.o("now enter the amount you want to convert");
            input = in.nextInt();
            yconvert(choice,output,input);


        }//end yinput

        public void yconvert(int code1,int code2 , double amount)
        {

            if(code1 == 1) {
                currency_rate[1][2] = code1;

            }else if (code1 == 2) {
                currency_rate[2][1] = code1;
            }
            if(code2 == 1){
                currency_rate[1][2] = code2;
            }else if(code2 == 2){
                currency_rate[2][1] = code2;
            }

            double result;
            result = amount * code2;

            S.o("the converted anount is: "+result);
        }//end yconvert

        public void use()
        {
        yinterface();
        yinput();

        }//end yuse
    }//end cconverter


