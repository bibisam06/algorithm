class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m-1;
        int second = n-1; 
        int k = n+m-1; 

        while(first >= 0 && second >= 0){
            if(nums2[second] > nums1[first]){
                nums1[k] = nums2[second];
                second--;
            }else{
                nums1[k] = nums1[first];
                first--; 
            }
            k--;
        }

        while (second >= 0) {
            nums1[k] = nums2[second];
            second--;
            k--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna