/*
 * Hello2.java
 * Author: CS 151 staff
 * Fall 2022
 * This program prints all the program arguments to the terminal.
 */
public class Hello2 {
  public static void main(String[] CLParams) {
	int i = 0;
 	while( i < CLParams.length ) {
      		System.out.print( CLParams[i] + " ");
      		i++;
    	}
    	System.out.println();
  }
}
