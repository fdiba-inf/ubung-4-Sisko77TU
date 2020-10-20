package exercise4;
import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int count = input.nextInt();
    double maxNumber = 0.0;
    double[] numbers = new double[count];

    for(int i = 0; i < numbers.length; i++){
      numbers[i] = input.nextInt();
    }

    for(int i = 0; i < count; i++){
      if(numbers[i] > maxNumber){
        maxNumber = numbers[i];
      }
    }
    System.out.print("Max number: " + maxNumber);
  }
}
