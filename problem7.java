/*
 * Ronnie Scott
 * PROBLEM COMPLETED IN JAVA LANGUAGE
 * Project Shift Problem 7:Imagine that you're wanting to withdraw cash from the bank to cover specific costs. 
 * You want to withdraw the exact dollar amount, using the largest bills possible. 
 * For example, if the cost you were trying to cover is $1,745, you would need to withdraw 17 $100 bills, 2 $20 bills and 1 $5 bill. 
 * We'll leave change (anything less than a dollar) out of it for the sake of the exercise.
 * To solve this, write a function that takes one argument, cost and returns an object with the bill breakdown. 
 * For example, the object returned for $1,744, would like look this:
 * { 100: 17,
 * 20: 2,
 * 1: 4 }
 */
import java.util.Scanner;

public class problem7 {

	public static void main(String[] args) {
		int inputAmount;
		int hundreds, fifties, twenties, tens, fives, ones;

		//user input
		Scanner input = new Scanner(System.in);

		//store input in inputAmount
		System.out.print("Enter whole dollar amount: ");
		inputAmount = input.nextInt();

		System.out.println("Withdrawal amount:");

		//hundreds
		hundreds = inputAmount / 100;
		inputAmount = inputAmount % 100;
		System.out.println("100: " + hundreds);

		//fifties
		fifties = inputAmount / 50;
		inputAmount = inputAmount % 50;
		System.out.println("50: " + fifties);

		//twenties
		twenties = inputAmount / 20;
		inputAmount = inputAmount % 20;
		System.out.println("20: " + twenties);

		//tens
		tens = inputAmount / 10;
		inputAmount = inputAmount % 10;
		System.out.println("10: " + tens);

		//fives
		fives = inputAmount / 5;
		inputAmount = inputAmount % 5;
		System.out.println("5: " + fives);

		//ones
		ones = inputAmount;
		System.out.println("1: " + ones);

	}// end main

}// end class