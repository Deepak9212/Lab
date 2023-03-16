package Labmarch16;

public class reverseword {
	  public static void main(String[] args) {
	        String str = "Hello World, How are you?";
	        String[] words = str.split("\\s+");
	        StringBuilder reversedString = new StringBuilder();
	        for (String word : words) {
	            StringBuilder reversedWord = new StringBuilder(word);
	            reversedWord.reverse();
	            reversedString.append(reversedWord).append(" ");
	        }
	        System.out.println("Original String: " + str);
	        System.out.println("Reversed String: " + reversedString.toString().trim());
	    }
}
