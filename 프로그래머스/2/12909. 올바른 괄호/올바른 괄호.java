import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true; 
        
        char[] chars = s.toCharArray(); 
        Deque<Character> stack = new ArrayDeque<>(); 
        
        for(char c : chars){
            if(c=='('){
                stack.push(c);
            }else if(c==')'){
                if(stack.isEmpty()){
                    return false; 
                }
                stack.pop();
            }
        }
        
        if(!stack.isEmpty()){
            return false;
        }
        
        return answer; 
    }
}