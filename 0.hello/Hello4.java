/*
 * Hello4.java
 * Author: CS 151 staff
 * Fall 2022
 * This program prints all the program arguments to the terminal.
 * It also prints a message suggesting how to properly use the program.
 */
public class Hello4 {

  	public static void main(String[] CLParams) {
    		if(CLParams.length == 0) 
      			System.out.println("Usage: java Hello5 string1 ...");    		
    		else {
      			for(int i = 0; i < CLParams.length; i++) 
        				System.out.print( CLParams[i] + " " );
      			
      			System.out.println();
    		}
  	}
}