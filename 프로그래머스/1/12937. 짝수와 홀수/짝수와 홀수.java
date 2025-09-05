class Solution {
    public String solution(int num) {
        
        String answer = evenOrOdd(num);
        return answer;
    }
    
    public String evenOrOdd(int num){
        if(num %2 ==0) return "Even" ;
        else return "Odd";
    }
}