class Solution {
    public int solution(int num) {
        int answer = 0;
        long tmp = num;
        
        while(tmp != 1){
            if(answer >= 500){
                answer = -1; 
                break;
            }else{
                if(tmp%2==0){
                tmp/=2;
            }else{
                tmp = (tmp*3) + 1;
            }
            answer ++;
            }
        }
        
        if(tmp ==0) answer = 0;
    
        return answer;
    }
}