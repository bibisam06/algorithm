import java.util.*; 

class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray(); 

        Map<Character, Integer> map = new HashMap<>(); 

        for(int i=0; i<chars.length; i++){
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1); 
        }
        int answer = -1; 
        for(int i=0; i<chars.length; i++){
            if(map.get(chars[i]) == 1){
                answer = i;
                break; 
            }
        }

        return answer; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna