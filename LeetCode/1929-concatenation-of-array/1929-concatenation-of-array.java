class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length; 
        int[] answer = new int[2*n];
        for(int i=0; i<n; i++){
            answer[i] = nums[i];
        }

        for(int i=0; i<n; i++){
            answer[i+n] = nums[i];
        }
        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna