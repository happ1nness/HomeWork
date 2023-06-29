import java.util.InputMismatchException;
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double mark = 0;
        try {
            mark = s.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Error! Please, enter a number.");
        }
        if (mark >= 180 && mark <= 200) {
            System.out.println("A");
        }
        else if (mark >= 160 && mark < 180) {
            System.out.println("B");
        }
        else if (mark >= 140 && mark < 160) {
            System.out.println("C");
        }
        else if (mark >= 120 && mark < 140) {
            System.out.println("D");
        }
        else if (mark >= 100 && mark < 120) {
            System.out.println("E");
        }
        else {
            System.out.println("FX");
        }
    }
}
