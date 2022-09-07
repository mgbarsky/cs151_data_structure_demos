/*
 * Sum1.java
 * Author: CS 151 staff
 * Fall 2022
 * This program sums 2 numbers provided as program arguments
 * and prints the result  to the terminal.
 */
public class Sum1 {

	public static void main(String[] args) {

		if ( args.length < 2 )
			System.out.println( "Syntax: java Sum1 num1 num2" );

		else {
			int a = Integer.valueOf( args[0] );
			int b = Integer.valueOf( args[1] );
			System.out.println(a + " + " + b + " = " + (a + b));
		}

	}
}
