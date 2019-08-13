package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class MiFilesFind {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/Muhammet/Desktop/cup.txt");
        System.out.println(file.exists());
        try{
            Scanner input = new Scanner(file);
            System.out.println(input.nextLine());
            System.out.println(input.nextLine());
        }
        catch (FileNotFoundException e){
            System.out.println("File wasn't found in Scanner");
        }
        System.out.println("End of the programm");

    }
}
