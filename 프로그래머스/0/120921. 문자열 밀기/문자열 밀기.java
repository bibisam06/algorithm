import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        String tmp = A; 
        int len = tmp.length();
        for(int i=0; i<A.length(); i++){
            
            if(tmp.equals(B)){
                break; 
            }
            String add = tmp.substring(len-1);
            String def = tmp.substring(0, len-1);
            tmp = add + def; 
            
            answer ++; 
        }
        
        if(answer == len) answer = -1; 
        
        return answer;
    }
    
 
}