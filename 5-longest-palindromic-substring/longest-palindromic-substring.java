public class Solution {
    public String longestPalindrome(String s) {
        // Step 1: Preprocess the input string
        StringBuilder processedStr = new StringBuilder("^#");
        for (char c : s.toCharArray()) {
            processedStr.append(c).append("#");
        }
        processedStr.append("$");
        String modifiedString = processedStr.toString();

        // Step 2: Initialize variables for the algorithm
        int strLength = modifiedString.length();
        int[] palindromeLengths = new int[strLength];
        int center = 0;  // Current center of the palindrome
        int rightEdge = 0;  // Rightmost edge of the palindrome

        // Step 3: Loop through the modified string to find palindromes
        for (int i = 1; i < strLength - 1; i++) {
            palindromeLengths[i] = (rightEdge > i) ? Math.min(rightEdge - i, palindromeLengths[2 * center - i]) : 0;
            
            // Expand the palindrome around the current character
            while (modifiedString.charAt(i + 1 + palindromeLengths[i]) == modifiedString.charAt(i - 1 - palindromeLengths[i])) {
                palindromeLengths[i]++;
            }
            
            // Update the rightmost edge and center if necessary
            if (i + palindromeLengths[i] > rightEdge) {
                center = i;
                rightEdge = i + palindromeLengths[i];
            }
        }

        // Step 4: Find the longest palindrome and its center
        int maxLength = 0;
        int maxCenter = 0;
        for (int i = 0; i < strLength; i++) {
            if (palindromeLengths[i] > maxLength) {
                maxLength = palindromeLengths[i];
                maxCenter = i;
            }
        }
        
        // Step 5: Extract the longest palindrome from the modified string
        int start = (maxCenter - maxLength) / 2;
        int end = start + maxLength;

        // Return the longest palindrome in the original string
        return s.substring(start, end);
    }
}