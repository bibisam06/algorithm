import java.util.*; 

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int n = id_list.length; 
        
        Map<String, List<String>> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        
        int[] answer = new int[n];
        
        for(int i=0; i<report.length; i++){
            String[] splited = report[i].split(" ");
            String from = splited[0];
            String to = splited[1];
            
            if(map1.containsKey(from) && map1.get(from).contains(to)) {
                continue; 
            }
            
            if(!map1.containsKey(from)) map1.put(from , new ArrayList<>());
            map1.get(from).add(to); 
            
            map2.put(to, map2.getOrDefault(to, 0) + 1); //to -> 횟수 넣어두기 .. 
        }
        
        for(int i=0; i<n; i++){
            String target = id_list[i];
            List<String> number = map1.getOrDefault(target, new ArrayList<>()); 
            int counter = 0; 
            
            for(String str : number){
                if(map2.get(str) >= k){
                    counter++;
                }
            }
            
            answer[i] = counter;
        }
        
        return answer;
    }
}