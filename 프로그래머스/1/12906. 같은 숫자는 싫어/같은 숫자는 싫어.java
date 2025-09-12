import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
       //queue
        Queue<Integer> q = new ArrayDeque<>();
        int prev = arr[0];
        q.offer(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=prev){
                q.offer(arr[i]); 
            }
            prev = arr[i]; //prev update
        }
        int[] answer = new int[q.size()];
        int i=0; 
        while(!q.isEmpty()){
            answer[i] = q.poll();
            i++;
        }
        
        return answer; 
    }
}