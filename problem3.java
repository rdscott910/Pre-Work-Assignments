/*
 * Ronnie Scott
 * PROBLEM COMPLETED IN JAVA LANGUAGE
 * Project Shift Problem 3: 
 * In the above challenge, when the loop gets to 'Nickelback', 
 * alert, "I DON'T love Nickelback!", but still alert the previous message for all other bands.
 */
public class problem3 {

	public static void main(String[] args) {
		String[] bandName = {"Kiss", "Aerosmith", "ACDC", "Led Zepplin", "Nickelback"};	
		String badBand = "Nickelback";
		int n = bandName.length;
		for (int i = 0; i < n; i++) {
			if (bandName[i] == badBand) {
				System.out.println("I DON'T love " + bandName[i]);
			}
			else {
				System.out.println("I love " + bandName[i]);
			}
		}// end for

	}// end main

}// end class
