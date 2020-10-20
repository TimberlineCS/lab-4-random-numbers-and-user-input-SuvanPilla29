import java.util.Scanner;
import java.util.Random;
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
        Random random = new Random();
        System.out.println("Random letter: " + selectAChar(n));
       
    }
}