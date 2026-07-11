class Solution {
    public String solution(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(); 
    
        if(n % 2 == 0){
            String str = s.substring(n/2-1, n/2+1);
            sb.append(str);
        }else{
            char c = s.charAt(n/2);
            sb.append(c);
        }
        String answer = sb.toString();
        return answer;
    }
}