import java.util.*; 

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        
        answer[n-1] = -1;
        
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        
        for(int i=1; i<n; i++){
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]){
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i); //지금 인덱스는 꼭 들어가야함 
            
            if(!stack.isEmpty() && numbers[stack.peek()] > numbers[i]){
                stack.push(i); 
            }
        }
        
        while(!stack.isEmpty()){
            answer[stack.pop()] = -1; 
        }
        return answer;
    }
}