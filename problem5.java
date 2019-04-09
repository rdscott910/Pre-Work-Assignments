/*
 * Ronnie Scott
 * PROBLEM COMPLETED IN JAVA LANGUAGE
 * Project Shift Problem 5:
 * Write some JavaScript to find the MOST frequent item, and the LEAST frequent item in the following array. 
 * The return should look like: The most frequent item is: b. The least frequent item is : d
 * const array = ['a', 'b', 'c', 'd', 'c', 'b', 'b', 'c', 'a', 'e', 'b', 'e'];
 */
public class problem5 {

	// Most frequent is working BUT Least frequent is showing null. Tried a few different 
	// ways other than this one but those made Least frequent show the last element in the array "e"...
	
	
	public static void main(String[] args) {
		String[] array = {"a", "b", "c", "d", "c", "b", "b", "c", "a", "e", "b", "e"};
		int most = 1, least = 1, count = 0;
		int n = array.length;
		String element = null;
		String leastElement = null;
				
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				
				if (array[i] == array[j]) {
					count++;
				}// end count if
				if (count > most) {
					most = count;
					element = array[i];					
				// end assignment if
				}else if (count < least) {
					least = count;
					leastElement = array[i];
				}
					
			}// end 2nd for
			count = 0;
			
		}// end 1st for
				
		System.out.println("The most frequent item is: " + element);
		
		//////////////////////////////////////////////////
		// logic is wrong for least freq element
		// showing last element in array
		
		System.out.println("The least frequent item is: " + leastElement);
		
	}// end main
	
}// end class
