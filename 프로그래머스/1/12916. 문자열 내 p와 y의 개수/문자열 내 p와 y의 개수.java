class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int counter1 = 0;
        int counter2 = 0;
        
        String lower = s.toLowerCase();
        
        char[] chars = lower.toCharArray();
        for(int i=0; i<chars.length; i++){
            if(chars[i] == 'p') counter1++;
            else if(chars[i] == 'y') counter2++;
        }
        
        if(counter1 != counter2) return false;
        if(counter1 == 0 && counter2 == 0 ) return true;

        return answer;
    }
}