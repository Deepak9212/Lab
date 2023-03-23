package Lab23March;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // read the first integer from user input
        int y = sc.nextInt(); // read the second integer from user input

        if (x < 0 || y < 0) { // check if either x or y is negative
            throw new Exception("x and y should not be negative."); // throw an exception with a message
        } else if (x == 0 || y == 0) { // check if either x or y is zero
            throw new Exception("x and y should not be zero."); // throw an exception with a message
        } else {
            System.out.println(x * y); // print the product of x and y
        }
    }
}
