import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        int n = str.length;

        int answer = 0;
        int index1 = 0;
        Set<Character> set = new HashSet<>();

        for(int i=0; i<n; i++){
            char c = str[i];
            while(set.contains(c)){
                
                set.remove(str[index1]);//앞에서 계속지워나감
                index1 ++;
            }

            set.add(str[i]);
            answer = Math.max(set.size(), answer);
        }

        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna