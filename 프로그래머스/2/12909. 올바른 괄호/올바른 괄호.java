import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Deque<Character> q = new LinkedList(); 
        char[] chars = s.toCharArray();

        for(int i=0; i<chars.length; i++){
            //비교하고 넣고 
            if(!q.isEmpty()){
                if(chars[i] == ')' && q.peek() == '('){
                    q.pop();
                    continue;
                }
                else{
                    q.push(chars[i]);
                    continue; 
                    
                }
                
            }
            q.push(chars[i]);
        }

        if(q.isEmpty()){
            answer = true; 
        }else{
            answer = false; 
        }
        
        return answer;
    }
}