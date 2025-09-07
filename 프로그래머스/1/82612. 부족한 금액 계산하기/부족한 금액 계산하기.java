class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0; 
        long answer;
        
        for(int i=0; i<count; i++){
            sum += (i+1) * price; 
        }
        
        if(sum>money){
            answer = sum - money;
        }else{
            return 0;
        }

        return answer;
    }
}