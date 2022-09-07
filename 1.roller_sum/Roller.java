/*
 * Roller.java
 * Author: CS 151 staff
 * Fall 2022
 * This program uses random number generator
 * to simulate the rolling of a die.
 * It counts how many times each side was rolled and prints the results.
 * The number of sides is provided as a command-line argument.
 */

import java.util.Random;	// importing an external class

public class Roller {

  public static void main(String[] args) {
    
	// A random number generator
    Random rng = new Random();
    
	int faces = Integer.valueOf(args[0]);
    int[] counts = new int[faces];  // initialized to 0s
    int numRolls = 100*faces;       // number of tests

    // generate numRolls random values in range 0..faces-1
    for (int i = 0; i < numRolls; i++)
      counts[rng.nextInt(faces)]++;

    for (int i = 0; i < faces; i++)
      System.out.println(""+ i + ": " + counts[i]);
  }
}
