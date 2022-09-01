/*
 * MaxFrequency.java
 * Author: CS 151 staff
 * Fall 2022
 * Finds the word with max frequency by using sophisticated data structures and a single scan
 */

import java.util.*;
import java.io.*;

public class MaxFrequencySmart {

    public static void main(String[] args) throws FileNotFoundException{
        Map<String, Integer> dict = new HashMap<String, Integer>();
        List<String> words = new ArrayList<String>();
        
        File file = new File(args[0]);
        
        
        //Creating Scanner instance to read File in Java
        Scanner reader = new Scanner(file);
     
        //Reading each word of the file using Scanner class
        //and adding it to the list       
        while(reader.hasNext()){
            String w = reader.next();
            words.add(w);
        }  
        
        reader.close();
        
        System.out.println("The input file contains "+words.size()+" words.");
        
        int maxCount = 0;
        String maxWord = null;
        
        for(int i=0; i < words.size(); i++) {
            String w = words.get(i);
            if (!dict.containsKey(w))
                dict.put(w, 0);
            int count = dict.get(w)+1;
            dict.put(w, count);
            if (count > maxCount) {
                maxCount = count;
                maxWord = w;
            }    
        }
        
        System.out.println("The most frequent word is '"+maxWord+"' which occurs "+maxCount+" times.");
        
    }

}
