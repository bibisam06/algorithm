import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        
        // 각 기능 완료까지 걸리는 일수 계산
        int[] days = new int[progresses.length];
        for(int i=0; i<progresses.length; i++){
            days[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        
        int prev = days[0];
        int count = 1;
        
        for(int i=1; i<days.length; i++){
            if(days[i] <= prev){ 
                count++; // 같은 배포 묶음
            }else{
                result.add(count); // 이전 묶음 확정
                count = 1; 
                prev = days[i];
            }
        }
        result.add(count); // 마지막 묶음 추가
        
        // 리스트 → 배열 변환
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}