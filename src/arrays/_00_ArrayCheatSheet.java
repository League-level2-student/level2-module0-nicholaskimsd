package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] s = new String[5];
		// 2. print the third element in the array
		System.out.println(s[2]);
		// 3. set the third element to a different value
		s[2] = "Yeet";
		// 4. print the third element again
		System.out.println(s[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);

		}

		// 6. make an array of 50 integers
		int[] bob = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		
		for (int k = 0; k < bob.length; k++) {
			Random randy = new Random();
			bob[k] = randy.nextInt(100);
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int smallestNum = Integer.MAX_VALUE;
		//
		
		for (int g = 0; g < bob.length; g++) {
			if (smallestNum > bob[g]) {
				smallestNum = bob[g];
				
			}
		}
		System.out.println("The smallest number in the array is: "+smallestNum);
		
		
		// 9 print the entire array to see if step 8 was correct
		for (int g = 0; g < bob.length; g++) {
			System.out.println(bob[g]);
		}
		
		// 10. print the largest number in the array.
		int largestNum = Integer.MIN_VALUE;
		
		for (int m = 0; m < bob.length; m++) {
			if (largestNum < bob[m]) {
				largestNum = bob[m];
		}
		
	}
		System.out.println("The largest numbeer in the array is: "+largestNum);
}
}
