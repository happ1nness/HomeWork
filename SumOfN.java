import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 0;
        try{
          num = s.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Error! Please, enter a number.");
        }
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
