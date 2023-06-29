import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        int num = 0;
        try {
            num = console.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error! PLease, enter the number.");
        }
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = (reverse * 10) + digit;
            num /= 10;
        }
        System.out.println(reverse);
    }
}