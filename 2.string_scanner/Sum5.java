/*
 * Sum.java
 * Author: CS 151 staff
 * Fall 2022
 * Create a Scanner, read in integers, and print their sum.
 */
import java.util.Scanner;

public class Sum5 {
    
    public static void main(String[] args) {

        // create a scanner for the terminal input
        Scanner in = new Scanner(System.in);

        int total = 0;   // running sum

        System.out.println("Give me a number (any non-int to end): ");
        while (in.hasNextInt()){
            int n = in.nextInt();
            total += n;
        }

        System.out.println("\nThe total is " + total);
    }
}