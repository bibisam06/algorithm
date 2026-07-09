import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        // Edge case: empty string or single character
        if(n<=1){
            return n;
        }

        // Using a HashSet to track characters in the current window
        Set<Character> set = new HashSet<>(); 
        char[] chars = s.toCharArray();

        // The special handling for n == 2 is unnecessary;
        // the general logic works for any length.
        
        int counter  =0; 
        int answer = 0; // Changed to 0 because substring lengths are non-negative

        // NOTE: This loop attempts to build substrings without repeating characters,
        // but it clears the set entirely when a duplicate is found.
        // This results in a *reset* of the window starting at the duplicate character,
        // which is not the optimal sliding‑window behavior.
        // Consequently, many cases (e.g., "abba") produce incorrect results.
        for(int i=0; i<n; i++){
            if(!set.contains(chars[i])){
                set.add(chars[i]);
                counter++;
            }else{
                // Update the answer with the length of the substring seen so far.
                answer = Math.max(counter, answer);
                // Resetting counter to 1 and clearing the set loses information
                // about characters that appeared before the duplicate.
                // A proper sliding window would move the left pointer forward
                // until the duplicate character is removed, preserving other chars.
                counter = 1; 
                set.clear();
                set.add(chars[i]);
            }
        }

        // BUG: The final substring length (counter) is not considered here.
        // If the longest substring ends at the end of the string,
        // answer will remain unchanged (or stay at Integer.MIN_VALUE).
        // You should compare answer with counter one more time before returning.
        answer = Math.max(answer, counter); // Added this line to consider the final substring length

        // Time Complexity: O(n^2) in the worst case due to clearing the set on each duplicate.
        // Space Complexity: O(min(n, alphabetSize)) for the HashSet.
        // Ideal Time Complexity: O(n) using a sliding window approach.
        // Ideal Space Complexity: O(min(n, alphabetSize)) for the HashSet.

        // The current implementation has a high time complexity due to the set clearing.
        // A more optimal solution would use a sliding window approach with two pointers.
        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna