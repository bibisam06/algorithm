import java.util.*;

class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();

        stack.push(chars[0]);
        for(int i=1; i<chars.length; i++){
            if(!stack.isEmpty() && chars[i] == stack.peek()){
                stack.pop();
                continue;
            }
            stack.push(chars[i]);
        }
        
        StringBuilder sb = new StringBuilder(); 
        for(char c : stack){
            sb.append(c);
        }

        String reversed = sb.reverse().toString(); 

        return reversed;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna