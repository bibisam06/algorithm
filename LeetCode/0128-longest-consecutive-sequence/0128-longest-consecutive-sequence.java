import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        int answer = Integer.MIN_VALUE;
        Deque<Integer> stack = new ArrayDeque<>(); 
        if(nums.length == 0) return 0;
        else stack.push(nums[0]);

        for(int i=1; i<nums.length; i++){
            if(stack.peek() + 1 == nums[i]){
                stack.push(nums[i]);
            }else if(stack.peek() == nums[i]){
                continue;
            }
            else{
                answer = Math.max(answer, stack.size());
                stack.clear();
                stack.push(nums[i]);
            }
        }
        answer= Math.max(answer, stack.size());
        System.out.println(stack.size());
        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna