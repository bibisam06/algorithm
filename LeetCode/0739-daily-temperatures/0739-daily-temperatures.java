import java.util.*; 

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length; 
        int[] answer = new int[n];
        
        Deque<int[]> stack = new ArrayDeque<>(); 
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && stack.peek()[0] < temperatures[i]){
                int[] temperature = stack.pop();
                answer[temperature[1]] = i - temperature[1];
            }
            stack.push(new int[]{temperatures[i], i});
        }

        return answer; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna