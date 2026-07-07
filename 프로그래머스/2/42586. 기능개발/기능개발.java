import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = speeds.length; 
        
        int[] days = new int[n];
        int day = 0; 
        for(int i=0; i<n; i++){
            int total = progresses[i];
            while(total + speeds[i] * day < 100 ){
                day++;
            }
            days[i] = day;
            day=0;
        } //days구하기 
        
        int top = days[0];
        int yeon = 1;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        //days -> 배포일구하기
        for(int i=1; i<n; i++){
            if(days[i] <= top){
                yeon++;
            }else{
                top = days[i];
                list.add(yeon);
                yeon = 1;
            }
            
        }
        list.add(yeon);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}