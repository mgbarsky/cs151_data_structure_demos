/*
 * Slice.java
 * Author: CS 151 staff
 * Fall 2022
 * This program simulates slicing out the first occurrence 
 * of a substring from the input string.
 */
 
public class Slice{

	// method to remove first occurrence of sub from string s
	public static String delete(String s, String sub) {
		int upTo = s.indexOf(sub);	// End of left part of s
		if( upTo == -1) return s;	// s doesn't contain sub
		
		int thenFrom = upTo + sub.length();	// Start of right part
		return s.substring(0,upTo) + s.substring(thenFrom);
	}

	public static void main (String [] args){
		if (args.length < 2){
			System.out.println("Slice <string> <substring>");
			return;
		}
		
		String result = delete(args[0], args[1]);
		System.out.println(result);
	}
}