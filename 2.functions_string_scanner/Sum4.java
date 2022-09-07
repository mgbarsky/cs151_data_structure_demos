/*
 * Sum4.java
 * Author: CS 151 staff
 * Fall 2022
 * This program sums two numbers provided by the user 
 * and prints the result  to the terminal.
 * Uses Scanner to read user input.
 */

public class Sum4 {

    public static void main(String[] args) {

        // create a new scanner for the terminal input
        Scanner in = new Scanner(System.in);

        System.out.print("Give me a number: ");
        int n1 = in.nextInt();
        System.out.print("Give me another number: ");
        int n2 = in.nextInt();

        System.out.println( n1 + " + " + n2 + " = " + (n1 + n2));
    }
}
