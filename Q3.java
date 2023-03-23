package Lab23March;

public class Q3 {
	public static int addTwoPositive(int a, int b) {
	    try {
	        if (a <= 0 || b <= 0) {
	            throw new ArithmeticException("Non-positive integer sent");
	        }
	        return a + b;
	    } catch (ArithmeticException e) {
	        System.out.println(e.getMessage());
	    } finally {
	        System.out.println("Finally block executed.");
	    }
	    return -1; // indicate error
	}}
