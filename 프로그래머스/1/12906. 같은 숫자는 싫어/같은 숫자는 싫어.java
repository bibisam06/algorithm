import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int prev = -1; 
        int n = arr.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            if(prev==arr[i]){
                continue;
            }else{
                prev = arr[i];
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}