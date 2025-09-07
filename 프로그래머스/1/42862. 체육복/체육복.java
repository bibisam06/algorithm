import java.util.*; 
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int answer = n - lost.length; // 초기값 세팅 
        List<Integer> list = new ArrayList<>();
        
        for(int i : reserve){
            list.add(i);
        }
        
        // 1. 자기 자신 처리 먼저
        for(int i=0; i<lost.length; i++){
            if(list.contains(lost[i])){
                answer ++;
                list.remove(Integer.valueOf(lost[i]));
                lost[i] = -1; // 처리된 학생 표시
            }
        }
        
        // 2. 남은 학생에 대해 앞/뒤에서 빌리기
        for(int i=0; i<lost.length; i++){
            if(lost[i] == -1) continue; // 이미 처리된 학생은 스킵
            
            if(list.contains(lost[i] - 1)){
                answer ++;
                list.remove(Integer.valueOf(lost[i] - 1));
            } else if(list.contains(lost[i] + 1)){
                answer ++;
                list.remove(Integer.valueOf(lost[i] + 1));
            }
        }
        
        return answer;
    }
}