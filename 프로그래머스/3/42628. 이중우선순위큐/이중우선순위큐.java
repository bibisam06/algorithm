import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        Set<Integer> set = new HashSet<>(); 
        PriorityQueue<Integer> min = new PriorityQueue<>(); 
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());   
        
        for(int i=0; i<operations.length; i++){
            String[] strings = operations[i].split(" ");
            String first = strings[0];
            int number = Integer.parseInt(strings[1]);
           
            if(first.equals("I")){
                //넣는 거면 걍 넣으셈 
                min.add(number);
                max.add(number);
                set.add(number); 
            }else if(first.equals("D")){
                
                if(set.isEmpty()) continue; 
                if(!set.isEmpty() && number == -1){
                     while (!min.isEmpty() && !set.contains(min.peek())) {
                        min.poll();
                    }
                    int removed = min.poll();
                    set.remove(removed);         
                }else if(!set.isEmpty() && number == 1){
                    //최댓값 삭제하기
                    while(!max.isEmpty() && !set.contains(max.peek())) {
                        max.poll();
                    }
                    
                    int removed2= max.poll();
                    set.remove(removed2);
                }
            }
        }
        
        while (!min.isEmpty() && !set.contains(min.peek())) {
                        min.poll();
                    }
    
        while(!max.isEmpty() && !set.contains(max.peek())) {
                        max.poll();
                    }
        
        if (!set.isEmpty()) {
            answer[0] = max.peek();
            answer[1] = min.peek();
        }

        return answer;
    }
}