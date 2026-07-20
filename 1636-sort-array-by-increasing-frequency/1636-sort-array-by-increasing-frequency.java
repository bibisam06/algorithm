import java.util.*; 

class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;   

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); 
        }

        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }

        Collections.sort(list, (a, b) -> {
            if(map.get(a).equals(map.get(b))){
                return b - a;
            }
            return map.get(a).compareTo(map.get(b));
        });

        for(int i=0; i<n; i++){
            nums[i] = list.get(i);
        }
        return nums; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna