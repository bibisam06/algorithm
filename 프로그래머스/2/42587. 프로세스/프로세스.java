import java.util.*; 
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int value = priorities[location]; 
        
        Queue<int[]> q = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>(); 

        //List : indexing
        //Queue : 본 로직 
        
        for(int i=0; i<priorities.length; i++){
            list.add(priorities[i]);
            q.offer(new int[]{priorities[i], i}); 
        }
        
        //sorting.. 
        Collections.sort(list, Collections.reverseOrder()); 

        int idx = 0; 
        while(!q.isEmpty()){ 
            int[] now = q.poll();
            
            int priority = now[0];
            int index = now[1];
            int maxValue = list.get(idx);
            
            if(priority == maxValue){
                answer++; 
                if (index == location) return answer; // 내가 찾던 문서
                idx++; // 다음 최대값으로 이동
            }else{
                q.offer(now);
            }
            
        }
            
            
        
    
        
        
        return answer;
    }
}