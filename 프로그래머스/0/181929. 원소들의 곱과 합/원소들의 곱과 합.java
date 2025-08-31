class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        
        int sum = getSum(num_list);
        int sum2 = getTime(num_list);
        
        
        if(sum2 < Math.pow(sum, 2)){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
    
    
    public int getSum(int[] num_list){
        int sum = 0;
        
        for(int i=0; i<num_list.length; i++){
            sum += num_list[i];
        }
        
        return sum;
    }
    
    public int getTime(int[] num_list){
        int sum = 1;
        for(int i=0; i<num_list.length; i++){
            sum *= num_list[i];
        }
        
        return sum;
        
    }
}