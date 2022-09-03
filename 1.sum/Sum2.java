/*
 * Sum2.java
 * Author: CS 151 staff
 * Fall 2022
 * This program sums all the numbers provided as program arguments
 * and prints the result  to the terminal.
 */
public class Sum2 {

	public static void main(String[] args) {

		if ( args.length == 0 )
			System.out.println( 0 );

		else {
			int total = 0;
			for ( int i = 0; i < args.length; i++ ) 
				total = total + Integer.valueOf( args[i] );

			System.out.println( "The sum equals " + total );
		}
	}
}
