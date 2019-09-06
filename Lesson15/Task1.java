package Task13;

import javax.management.ObjectName;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task1 {
    private static Scanner input;

    public static void main(String[] args) {
        int[] myArrays = new int[4];
        myArrays[0] = 2;
        myArrays[1] =3;
        myArrays[2] = 5;
        myArrays[3] = 7;

        System.out.println(Arrays.toString(myArrays));
        
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        PrintWriter printWriter = null;
        try (FileWriter testWriter = new FileWriter("D:/text1.txt")) {
            fileWriter = new FileWriter("D:/text1.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
            //Decorator
            printWriter.println(Arrays.toString(myArrays));

            testWriter.write("Hello!");


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printWriter.close();
        }
    }
}
