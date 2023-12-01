package Challengaes;
import java.util.*;

public class Challenge6 {
    public static void main(String[] args) {
        
        /**
         * Using a stack and a queue, determine whether a string is a palindrome.
         * Strings may contain punctuation and spaces. They should be ignored. Case should be ignored.
         * Example: "I did, did I?" us a palinedrome.
         */

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Hello"));

        
    }

    public static boolean checkForPalindrome(String string) {
        
        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c>='a' && c<='z') {
                queue.addLast(c);
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }

        return true;
    }
}
