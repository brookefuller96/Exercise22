import java.util.Scanner;
import java.lang.*;
import static java.lang.System.*;

public class Exercise22 {
    public static void main(String[] args) {

        System.out.println("Enter the first number: ");
        Scanner input = new Scanner(in);
        String num1 = input.nextLine();
        int x1 = Integer.parseInt(num1);

        System.out.println("Enter the second number: ");
        Scanner input2 = new Scanner(in);
        String num2 = input2.nextLine();
        int x2 = Integer.parseInt(num2);

        System.out.println("Enter the third number: ");
        Scanner input3 = new Scanner(in);
        String num3 = input3.nextLine();
        int x3 = Integer.parseInt(num3);

        if (x1 == x2 && x2 == x3)
        {
            System.out.println("The numbers are equal.");
            return;
        }
        if (x1 >= x2 && x1 >= x3)
        {
            System.out.println("The largest number is " + x1 + ".");
            return;
        }
        if (x2 >= x1 && x2 >= x3)
        {
            System.out.println("The largest number is " + x2 + ".");
            return;
        }
        if (x3 >= x1 && x3 >= x2)
        {
            System.out.println("The largest number is " + x3 + ".");
            return;
        }
    }
}