package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();
        int[] a = new int[count];
        int space = 0;

        for (int i = 0; i < a.length; i++){
          a[i] = input.nextInt();
        }

        for (int i = 0; i < a.length; i++){
          for (int j = 0; j < space; j++){
            System.out.print(" ");
          }
          space++;
          System.out.println(a[i]);
        }

        System.out.println("Enter numbers: ");
  

        String numbersAsString = Arrays.toString(a);
        System.out.println("Numbers: " + numbersAsString);
    }

}