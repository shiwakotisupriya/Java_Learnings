/*Write a method that checks if two strings are palindromes. Two strings are palindromes if 
they contain the same characters but in strict reverse order. For example, “abcd” and 
“dcba” are palindromes. For the purposes of this method, if either input string is null, the 
method should return false. If both input strings are empty, the method should return true. 
The signature of the method should be as follows. 
public static boolean arePalindromes(String s1, String 
s2)*/


package NEWWW;

public class PalindromeChecker {
    public static boolean arePalindromes(String s1, String s2) {
        // Check if either string is null
        if (s1 == null || s2 == null) {
            return false;
        }
        
        // Check if both strings are empty
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        }
        
        // Check if the lengths of both strings are equal
        if (s1.length() != s2.length()) {
            return false;
        }
        
        // Check if the characters in both strings are the same but in reverse order
        int length = s1.length();
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) != s2.charAt(length - 1 - i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "dcba";
        System.out.println(arePalindromes(s1, s2)); // Output: true
        
        String s3 = "hello";
        String s4 = "world";
        System.out.println(arePalindromes(s3, s4)); // Output: false
        
        String s5 = null;
        String s6 = "abc";
        System.out.println(arePalindromes(s5, s6)); // Output: false
        
        String s7 = "";
        String s8 = "";
        System.out.println(arePalindromes(s7, s8)); // Output: true
    }
}
