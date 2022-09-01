import java.util.*;
import java.io.*;

/*
 * MaxFrequency.java
 * Author: CS 151 staff
 * Fall 2022
 * Finds the word with max frequency by multiple scans of a file data
 */
public class MaxFrequency {
    public static void main(String[] args) throws FileNotFoundException{       
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
            String currentWord = words.get(i);
            int count = 1;
            
            for(int j=i+1; j < words.size(); j++) {
                String w = words.get(j);
                if (w.equals(currentWord)) {
                    count ++;
                }
            }
            
            if (count > maxCount) {
                maxCount = count;
                maxWord = currentWord;
            }    
        }
        
        System.out.println("The most frequent word is '"+maxWord+"' which occurs "+maxCount+" times.");

    }
}
