import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int N = nums.length / 2; 
        int answer = 0;
        
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        
        if(set.size()>= N){
            answer = N;
        }else{
            answer = set.size();
        }
        return answer;
    }
}