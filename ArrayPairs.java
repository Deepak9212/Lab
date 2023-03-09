package Lab9March;

import java.util.HashSet;
import java.util.Set;

public class ArrayPairs {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum = 7;

        findPairs(arr, sum);
    }

    public static void findPairs(int[] arr, int sum) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            int complement = sum - arr[i];
            if (set.contains(complement)) {
                System.out.println(arr[i] + ", " + complement);
            }
            set.add(arr[i]);
        }
	 
}}
