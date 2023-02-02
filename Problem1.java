import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//taking input from user
        System.out.print("Input first number: ");
        int number1 = in.nextInt();

        System.out.print("Input second number: ");
        int number2 = in.nextInt();

        System.out.print("Input third number: ");
        int number3 = in.nextInt();

        System.out.print("Input fourth number: ");
        int number4 = in.nextInt();

        System.out.print("Enter fifth number: ");
        int number5 = in.nextInt();
//print average value of the user

        System.out.println("Average of five numbers is: " +
                (number1 + number2 + number3 + number4 + number5) / 5);

    }
}
