import java.util.*; 

class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length; 

        Deque<Character> stack = new ArrayDeque<>(); 

        for(int i=0; i<n; i++){
            if(chars[i] == '(' || chars[i] == '[' || chars[i] == '{'){
                stack.push(chars[i]);
            }else{
                if(!stack.isEmpty()){
                    Character top = stack.peek();
                if(top == '(' && chars[i] == ')') stack.pop();
                else if(top == '[' && chars[i] == ']') stack.pop();
                else if(top == '{' && chars[i] == '}') stack.pop();
                else return false;
                }
                else{
                    return false;
                }
            }
        }

        if(stack.isEmpty()) return true;
        else return false;
    }
}