/* 
Name: Kathryn von Schlegell
CPSC 50100 Programming Fundamentals
Semester: Summer 2020
Programming Assignment 1: Cipher*/

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class Cipher {

	public static void main(String[] args) {

		System.out.println("Programming Fundamentals" + "\nNAME: Kathryn von Schlegell" + "\nPROGRAMMING ASSIGNMENT 1"
				+ "\n" + "\nWelcome to the Cipher Program." + "\nPlease enter 5 numbers between 0 and 19");

		final int MAX = 19;
		final int MIN = 0;

		Scanner input = new Scanner(System.in);

		// Have user enter 5 number between 0-19.
		// Terminate program if user doesn't follow directions
		System.out.print("1st Number: ");
		int num1 = input.nextInt();
		if ((num1 < MIN) || (num1 > MAX)) {
			System.out.print("Please read directions and try again!");
			System.exit(0);
		}

		System.out.print("2nd number: ");
		int num2 = input.nextInt();
		if ((num2 < MIN) || (num2 > MAX)) {
			System.out.print("Please read directions and try again!");
			System.exit(0);
		}

		System.out.print("3rd number: ");
		int num3 = input.nextInt();
		if ((num3 < MIN) || (num3 > MAX)) {
			System.out.print("Please read directions and try again!");
			System.exit(0);
		}

		System.out.print("4th number: ");
		int num4 = input.nextInt();
		if ((num4 < MIN) || (num4 > MAX)) {
			System.out.print("Please read directions and try again!");
			System.exit(0);
		}

		System.out.print("5th number: ");
		int num5 = input.nextInt();
		if ((num5 < MIN) || (num5 > MAX)) {
			System.out.print("Please read directions and try again!");
			System.exit(0);
		}

		// sum total and print
		int total = num1 + num2 + num3 + num4 + num5;
		System.out.println("\n" + "Total= " + total);
		

		// random key number ranging from 0-9
		Random generator = new Random();
		int key;
		key = generator.nextInt(10);
		System.out.println("Your random key is " + key);
		

		// separate the 'total' digits ex. 70 becomes 7 & 0
		int tens;
		int ones;

		tens = (total / 10);
		ones = (total % 10);

		// adds a leading zero if 'total'<10
		if (total < 10) {
			DecimalFormat df = new DecimalFormat("0" + total);
		}

		// Calculate encoded number
		int caesar_tens, caesar_ones;
		caesar_tens = ((tens + key) % 10) * 10;
		caesar_ones = (ones + key) % 10;
		System.out.print("Your encoded number is " + (caesar_tens + caesar_ones));

	}

}
