import java.util.*;

class Solution {
    static Set<Integer> visited = new HashSet<>(); 
    public int solution(int n, int[][] computers) {
        int answer = 0;
        //메모리 초과로 인접행렬그대로사용하기로함 
        
        for(int i=0; i<n; i++){
            if(!visited.contains(i)){
                answer++;
            }
            bfs(computers, i); 
        }
        return answer;
    }
    
    static void bfs(int[][] graph, int start){
        Queue<Integer> queue = new ArrayDeque<>();
        int n = graph.length;
        queue.add(start);
        visited.add(start);
        
        while(!queue.isEmpty()){
            int cur = queue.poll();
            for (int i = 0; i < n; i++) {
                if (graph[cur][i] == 1 && !visited.contains(i)) {
                    queue.add(i);
                    visited.add(i);
                }
            }
        }
        
    }
}