import java.util.*; 

class Solution {
    public void reverseString(char[] s) {
        char[] chars = new char[s.length];
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s){
            stack.push(c);
        }
        int index = 0;
        System.out.println(stack);
        while(!stack.isEmpty()){
            s[index] = (char)stack.pop();
            index++; 
        }
        
    }
}