/**
 * Skyler Novak 05/10/21 Just a practice code before my interview with ZenDesk
 * SWE Reverses a java string
 */

// to use java Scanner class for keyboard input
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a string to be reversed: ");
        String myString = keyboard.nextLine();
        System.out.println(StringReverse.reverse(myString)); // pass in the string you want to reverse

        keyboard.close();
    }
}

class StringReverse {
    public static String reverse(String myStr) {

        // take string parameter and set it to a char array
        char[] newStr = myStr.toCharArray();
        String revStr = "";

        // iterate through the char array backwards and add it to the new string
        for (int i = newStr.length - 1; i >= 0; i--) {
            revStr += newStr[i];
        }

        // return the new, reversed string
        return revStr;
    }
}