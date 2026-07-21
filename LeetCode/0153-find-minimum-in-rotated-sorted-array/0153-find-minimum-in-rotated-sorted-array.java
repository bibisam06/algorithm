class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE; 
        for(int i=0; i<n; i++){
            int[] rotated = rotate(nums);

            min = Math.min(rotated[0], min);
        }

        return min;
    }

    public int[] rotate(int[] nums){
        int n = nums.length;
        int tmp = nums[n-1];

        for(int i=n-1; i>0; i--){
            nums[i] = nums[i-1];
        }
        nums[0] = tmp;

        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna