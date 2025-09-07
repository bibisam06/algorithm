class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        for(int i=0; i<=citations.length; i++){
            int count = 0; 
            for(int t : citations){
                if(t>= i) count++;
            }
            
            if(count >= i){
                answer = Math.max(answer, i);
            }
        }
        return answer;
    }
}