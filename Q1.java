package Lab23March;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	        	// read the first integer from user input
	            int x = sc.nextInt();
	         // read the second integer from user input

	            int y = sc.nextInt();
	         // perform integer division and print the result
	            System.out.println(x / y);
	            // catch InputMismatchException if x or y is not an integer
	        } catch (InputMismatchException e) {
	            System.out.println("java.util.InputMismatchException");
	            // catch ArithmeticException if y is zero
	        } catch (ArithmeticException e) {
	            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
	        }
	    }
}
