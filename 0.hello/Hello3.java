/*
 * Hello3.java
 * Author: CS 151 staff
 * Fall 2022
 * This program prints all the program arguments to the terminal.
 */
public class Hello3 {
  
	public static void main(String[] CLParams) {
    		for(int i = 0; i < CLParams.length; i++) {
      			System.out.print( CLParams[i] + " ");
    		}

    		System.out.println();
  	}
}
