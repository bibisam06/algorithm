import java.util.*; 

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = -1;
        
        List<List<Integer>> graph = new ArrayList<>(); 
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>()); 
        }
        
        for(int i=0; i<wires.length; i++){
            graph.get(wires[i][0]).add(wires[i][1]); 
            graph.get(wires[i][1]).add(wires[i][0]); 
        }
        
        List<Integer> list = new ArrayList<>(); 
        for(int i=0; i<wires.length; i++){
            int left = wires[i][0];
            int right = wires[i][1]; 
            
            // (left, right) 간선을 끊고 left 쪽 컴포넌트 크기
            int count = bfs(graph, left, right);
            int offset = Math.abs(n - 2 * count); // 두 컴포넌트 크기 차이
            list.add(offset); 
        }
        
        Collections.sort(list);
        answer = list.get(0); // 제일 작은 값으로 반환하기 
        return answer;
    }
    
    // 간선 (left, right)를 "통과하지 않도록" 하면서 left에서의 도달 가능한 노드 수
    static int bfs(List<List<Integer>> graph, int left, int right){
        int leftCount = 1; 
        Queue<Integer> queueL = new ArrayDeque<>(); 
        Set<Integer> visited = new HashSet<>(); 
        
        queueL.add(left); 
        visited.add(left);
        
        while(!queueL.isEmpty()){
            int point = queueL.poll(); 
            List<Integer> values = graph.get(point); 
            
            for(int item : values){
                // 끊은 간선은 양방향 모두 건너지 않음
                if ((point == left && item == right) || (point == right && item == left)) {
                    continue;
                }
                if(!visited.contains(item)){
                    leftCount++; 
                    queueL.add(item);
                    visited.add(item);
                }
            }
        }
        return leftCount; 
    }
}