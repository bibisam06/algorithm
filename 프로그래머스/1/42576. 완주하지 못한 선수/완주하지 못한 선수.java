import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
    
        
        Map<String, Integer> map = new HashMap<>();
        
        // 참가자 이름 카운트
        for(String p : participant){
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
         // 완주자 이름 카운트 차감
        for(String c : completion){
            map.put(c, map.get(c) - 1);
        }
        
        // 남은 값이 1인 사람이 완주하지 못한 선수
        for(String key : map.keySet()){
            if(map.get(key) > 0){
                return key;
            }
        }
        
        return ""; // 모든 참가자가 완주한 경우 (사실 문제에서는 없음)
    }
}