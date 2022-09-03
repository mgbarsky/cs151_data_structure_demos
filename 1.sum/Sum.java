/*
 * Sum.java
 * Author: CS 151 staff
 * Fall 2022
 * This program sums two numbers provided as program arguments
 * and prints the result  to the terminal.
 */
public class Sum {

  	public static void main(String[] args) {
    		int s;
			int a = Integer.valueOf(args[0]);
			int b = Integer.valueOf(args[1]);
			s = a + b;
			System.out.println(a + " + " + b + " = " + s);
  	}
}