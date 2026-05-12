class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] answer = new int[2];
        if(n==2){
            answer[0] = 1;
            answer[1] = 2;
        }

        int left = 0; 
        int right = n-1; 

        while(left<=right){
            int sum = numbers[left] + numbers[right];
            if(sum==target){
                answer[0] = (left+1);
                answer[1] = (right+1);
                break;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna