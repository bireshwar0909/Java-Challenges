package Challengaes;

import java.util.LinkedList;

public class Challenge7 {
    public static void main(String[] args) {
        
        /**
         * Using a stack , determine whether a string is a palindrome.
         * Strings may contain punctuation and spaces. They should be ignored. Case should be ignored.
         * Example: "I did, did I?" us a palinedrome.
         */

         System.out.println(checkForPalindrome("abccba"));
         System.out.println(checkForPalindrome("I did, did I?"));
         System.out.println(checkForPalindrome("Hello"));


    }

    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c>='a' && c<='z') {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reverseString = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reverseString.append(stack.pop());
        }

        return reverseString.toString().equals(stringNoPunctuation.toString());
        
    }
}
