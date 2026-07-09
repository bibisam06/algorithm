class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int two = 0; //two pointer

        for(int i=1; i<n; i++){
            if(nums[two] != nums[i]){
                nums[++two] = nums[i];
            }
        }
        return two+1; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna