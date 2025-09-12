import java.util.*; 

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2]; 
        int zeroCount = 0;
        int totalCount = 0; 
        
        int[] numbers = {6, 5, 4, 3, 2, 1};
        List<Integer> list = new ArrayList<Integer>(); 
        for(int i=0; i<lottos.length; i++){
            list.add(win_nums[i]);
        }
        for(int i=0; i<lottos.length; i++){
            if(list.contains(lottos[i])){
                totalCount++; 
            }
            
            if(lottos[i] == 0){
                zeroCount ++; 
            }
        }
        int count = zeroCount + totalCount; 
        answer[0] = count > 0 ? numbers[count - 1] : 6;
        answer[1] = totalCount > 0 ? numbers[totalCount - 1] : 6;
        return answer;
    }
}