package activitities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        // Adding element to hashSet
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");
        
        //Print hashset
        System.out.println("Original HashSet: " + hs);        
        //Print size of hashset
        System.out.println("Size of HashSet: " + hs.size());
        //Remove element from hashset
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
        //Remove element that is not present
        if(hs.remove("G")) {
        	System.out.println("G removed from the Set");
        } else {
        	System.out.println("G is not present in the Set");
        }
        
        //Search for element
        System.out.println("Checking if D is present: " + hs.contains("D"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}