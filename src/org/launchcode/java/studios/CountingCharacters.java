package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Counting characters studio for class 2.
 */
public class CountingCharacters {

    public static void main(String[] args){

//        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin." +
//                " Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non " +
//                "lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula " +
//                "efficitur luctus.";


        Scanner in = new Scanner(System.in);

        String text = in.nextLine();

        char[] charArray = text.toCharArray();

        HashMap<Character, Integer> counts = new HashMap<>();

        for ( int i = 0; i < charArray.length; i++){
            //initialize count at 0
            //add to count
            Integer charCount;
            if (counts.containsKey(charArray[i])){
                charCount = counts.get(charArray[i]);
                charCount++;
                counts.put(charArray[i], charCount);
            } else{
                counts.put(charArray[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> count : counts.entrySet()) {

            System.out.println(count.getKey() + " : " + count.getValue());
        }

    }
}
