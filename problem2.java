/*
 * Ronnie Scott
 * PROBLEM COMPLETED IN JAVA LANGUAGE
 * Project Shift Problem 2: 
 * Write some JavaScript that loops through the following bands array and alerts, 
 * "I love [bandName]", obviously with the current band name string replacing the [bandName].
 * const bands = ['Kiss', 'Aerosmith', 'ACDC', 'Led Zeppelin', 'Nickelback'];
 */
public class problem2 {

	public static void main(String[] args) {
		String[] bandName = {"Kiss", "Aerosmith", "ACDC", "Led Zepplin", "Nickelback"};	
		int n = bandName.length;
		for (int index = 0; index < n; index++) {

			System.out.println("I love " + bandName[index]);

		}// end for

	}// end main

}// end class
