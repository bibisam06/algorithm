import java.util.*; 

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();

        for(int i : nums2){
            list1.add(i);
        }

        for(int i : nums1){
            if(list1.contains(i)) set.add(i);
        }

        int[] answer = new int[set.size()];

        int index = 0;
        for(int i : set){
            answer[index++] = i;
        } 
        return answer;
    }        
}