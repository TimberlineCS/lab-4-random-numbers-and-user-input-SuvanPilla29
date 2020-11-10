import java.util.Scanner;
import java.util.Random;

/**
 * This class accepts a random word and prints 
 */
public class randomLetter
{
    public static char selectAChar(String s){

       Random random = new Random();
       int index = random.nextInt(s.length());
       return s.charAt(index);

    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String n = s.next();

        System.out.println("Random letter: " + selectAChar(n));
       
    }
}