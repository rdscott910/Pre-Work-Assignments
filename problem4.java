/*
 * Ronnie Scott
 * PROBLEM COMPLETED IN JAVA LANGUAGE
 * Project Shift Problem 4:
 * Write some JavaScript that finds the average of the following array:
 * const array = [34, 203, 16, 46, 34, 432, 342, 124, 33, 188, 12];
 */
public class problem4 {

	public static void main(String[] args) {
		int[] array = {34, 203, 16, 46, 34, 432, 342, 124, 33, 188, 12};
		double sum = 0;
		int count = 0, n = array.length;
		
		// this block finds the total of the elements in the array
		// and counts the total number of elements.
		for (int row = 0; row < n; row++) {
			sum += array[row];
			count++;
		}// end for
	
		// displays the total, sum, & average
		System.out.println("Total Elements: " + count);
		System.out.printf("Sum: %.2f\n", sum);
		System.out.printf("Average: %.2f", sum/count);
		
	}// end main

}// end class
