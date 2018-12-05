import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);
        System.out.println("Adding quiz!");
        System.out.println("What is: " + a + " + " + b + " ?");

        Scanner input = new Scanner(System.in);

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
