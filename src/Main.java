import java.lang.reflect.Array;
import java.util.Scanner;

/**
* Det her er en hurtig test af javadoc dokumentation
*/


public class Main {

    public static void main(String[] args) {
        /**
         * Her instantieres variablerne a og b til et random 2 cifret tal og printer
         */
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);
        System.out.println("Adding quiz!");
        System.out.println("What is: " + a + " + " + b + " ?");

        /**
         * her bruges en scanner til at spørge brugeren om svaret
         */

        Scanner input = new Scanner(System.in);

        /**
         * Her er loopet som finder ud af om svaret er rigtigt og enten ender programmet hvis det er rigtigt
         * eller starter loopet forfra hvis svaret er forkert
         */

        int answer = input.nextInt();
        while (answer != a+b) {
            System.out.println("The answer is not correct, Try again! what is: " + a + "+" + b + "?");
            answer = input.nextInt();
        if (answer == a+b) {
            System.out.println("The answer is correct!");


        }
        }


    }
}
