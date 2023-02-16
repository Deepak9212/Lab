package Lab16Feb.java;

class Arithmetic{
	int add(int a ,int b) {
		return a+b;
	}
}
	class Adder extends Arithmetic
	{

		
	      
	}
	public class ArithmeticSol{
	    public static void main(String []args){
	        // Create a new Adder object
	        Adder a = new Adder();
	        
	        // Print the name of the superclass on a new line
	        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());  
	        
	        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
	        System.out.print(a.add(23,2) + " " + a.add(20,6) + " " + a.add(19,76) + "\n");
	     }
	}

