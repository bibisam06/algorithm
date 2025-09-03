import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> scores = new HashMap<>();
        
        //맵 안에 넣기 
        for(int i=0; i<name.length; i++){
            scores.put(name[i], yearning[i]);
        }
        //점수 계산 
        //반환 리스트 정의
        int len = photo.length;
        int[] answer = new int[len];
        
        for(int i=0; i<photo.length; i++){
            int sum = 0; 
            for(int j=0; j<photo[i].length; j++){
                sum += scores.getOrDefault(photo[i][j], 0);
                
            }  
            answer[i] = sum;
        }
        
        return answer;
    }
}