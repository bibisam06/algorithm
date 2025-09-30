import java.util.*; 

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        
        List<List<Integer>> graph = new ArrayList<>(); 
        int total = edge.length; 
        
        // 초기화
        for(int i=0; i<total; i++){
            graph.add(new ArrayList<>());
        }
        
        // 간선 넣기 
        for(int i=0; i<total; i++){
            int[] point = edge[i];
            graph.get(point[0]).add(point[1]);
            graph.get(point[1]).add(point[0]); 
        }
        
        int[] dist = new int[n+1]; //거리 구하는 그거 
        Arrays.fill(dist,0); 
        Queue<Integer> queue = new ArrayDeque<>(); 
        Set<Integer> visited = new HashSet<>(); 
        
        queue.add(1); 
        visited.add(1); 
        
        while(!queue.isEmpty()){
            int cur = queue.poll();
            List<Integer> list = graph.get(cur);
            
            for(int item : list){
                
                if(!visited.contains(item)){
                    dist[item] = dist[cur] + 1;
                    queue.add(item);
                    visited.add(item); 
                }
            }
        }
        
        
        int max = 0 ;
        
        for(int i=1; i<=n; i++){
            if(dist[i] >= max){
                max = dist[i]; 
            }
        }
        
        
        for(int i=1; i<=n; i++){
            if(max == dist[i]){
                answer ++; 
            }
        }
        return answer;
    }
    
}