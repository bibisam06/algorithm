import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        
        int maxLength = 0;
        int left = 0;

        for(int right=0; right<n; right++){
            char c = s.charAt(right);
            
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left ++;
            }
            set.add(c);
            maxLength = Math.max(maxLength, right - left + 1); //최대 길이 갱신
        }

        return maxLength;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna