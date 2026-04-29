import java.util.*; 

class Solution {
    public char[] reverseString(char[] s) {
        char[] chars = new char[s.length];
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s){
            stack.add(c);
        }
        int index = 0;
        while(!stack.isEmpty()){
            chars[index] = stack.offer();
            index++; 
        }
        return chars;
    }
}