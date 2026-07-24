class Solution {
    public int searchInsert(int[] nums, int target) {

        int left = 0; 
        int right = nums.length - 1; 
        int mid = left; 


        if(target > nums[right]){
            return nums.length;
        }else if(target < nums[left]){
            return left;
        }
        while(left <= right){
            mid = (left + right) / 2; 

            if(nums[mid] > target){
                right = mid - 1; 
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                return mid; 
            }
        }

        return left;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna