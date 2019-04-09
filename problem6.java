/*
 * Ronnie Scott
 * PROBLEM COMPLETED IN JAVA LANGUAGE
 * Project Shift Problem 6:
 */
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
public class problem6 {

	public static void main(String[] args) {
		
		// Not the result you're looking for but,
		// I showed what I could do so far.
		// I learned something new doing this problem! - adding items 
		// into a LinkedHashSet.
		
		String[] array1 = {"a", "b", "c", "a", "a", "b", "d"};
		String[] array2 = {"a", "b", "b", "a", "e", "c", "c", "g"};

		Set<String>list3 = new LinkedHashSet<String>();
		list3.addAll(Arrays.asList(array1));
		list3.addAll(Arrays.asList(array2));
		String array3[] = list3.toArray(new String[list3.size()]);

		System.out.println("Array 1: " + Arrays.toString(array1));
		System.out.println("Array 2: " + Arrays.toString(array2));
		System.out.println("Array 3: " + Arrays.toString(array3));

	}// end main

}// end class
