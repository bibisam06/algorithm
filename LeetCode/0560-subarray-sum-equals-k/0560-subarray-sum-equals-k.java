import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int answer = 0;
        int n = nums.length;
        
        int[] sum = new int[n+1]; 
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int i=1; i<n+1; i++){
            sum[i] = sum[i-1] + nums[i-1];
            int value = map.getOrDefault(sum[i] - k, 0);
            answer += value;
            map.put(sum[i], map.getOrDefault(sum[i], 0) + 1); 
        }
        return answer; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna