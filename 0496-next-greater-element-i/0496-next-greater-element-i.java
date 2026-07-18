import java.util.*; 

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int n2 = nums2.length; 

        int[] answer = new int[n];
        Arrays.fill(answer, -1);

        Deque<Integer> stack = new ArrayDeque<>(); 
        Map<Integer, Integer> map = new HashMap<>(); 

        stack.push(nums2[0]); 
        for(int i=1; i<n2; i++){
            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]); 
        }

        while(!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }

        for(int i=0; i<n; i++){
            int number = nums1[i];
            if(map.containsKey(number)) answer[i] = map.get(number);
        }
        
        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna