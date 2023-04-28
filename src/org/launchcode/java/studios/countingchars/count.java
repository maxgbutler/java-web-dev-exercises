package org.launchcode.java.studios.countingchars;


import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class count {
    public static void main(String[]args) throws FileNotFoundException {
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] chars = str.toLowerCase().toCharArray();

        File file = new File("nameH.txt");
        Scanner sc = new Scanner(file);
        String strFile = sc.nextLine();
        char[] charsFile = strFile.toLowerCase().toCharArray();

        charCount(chars);
        charCount(charsFile);
    }
    static void charCount(char[] input) {
        HashMap<Character, Integer> charScore = new HashMap<>();
        for (char aChar : input) {
            if (96 < (int) aChar && (int) aChar < 123) {

                if (charScore.containsKey(aChar)) {
                    int count = charScore.get(aChar);
                    charScore.put(aChar, count += 1);
                } else {
                    charScore.put(aChar, 1);
                }
            }
        }
        System.out.println(charScore);
    }

}
