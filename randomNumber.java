import java.util.Scanner;
import java.util.Random;
public class randomNumber {

  public static void main(String []args){
        Scanner scan = new Scanner(System.in);
      System.out.println("Give me a negative integer ");
      int num1 = scan.nextInt();

      System.out.println("Give me another number greater than " + Math.abs(num1));
      
      int num2 = scan.nextInt();

      int ran1 = (int)(Math.random()*(num2 - num1) + num1);
      
      int ran2 = (int)(Math.random()*(num2 - num1) + num1);
      
      System.out.println("You got a " + ran1 + " and a " + ran2);
    }
}