class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] answer = new int[n];
        Arrays.fill(answer, -1);

        for(int i=0; i<n; i++){
            int value = nums1[i];
            int index = -1;
            for(int j=0; j<nums2.length; j++){
                if(nums2[j] == value) index = j;
            }

            for(int k = index; k<nums2.length; k++){
                if(nums2[k] > value) {
                    answer[i] = nums2[k];
                    break;
                }
            }
        }
        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna