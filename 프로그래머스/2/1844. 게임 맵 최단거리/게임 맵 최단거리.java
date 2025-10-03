import java.util.*; 

class Solution {
    public int solution(int[][] maps) {
        
        int n = maps.length;
        int m = maps[0].length; 
    
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1}; //dists
        
        
        if( n>=2 && n >=2 && maps[n-2][m-1] == 0 && maps[n-1][m-2]==0){
            return -1; 
        } //도달할 수 없는 경우 
        
        int[][] dist = new int[n][m]; // 초깃값 0 
        Queue<int[]> queue = new ArrayDeque<>(); 
        boolean[][] visited = new boolean[n][m]; 
        
        dist[0][0] = 1; 
        queue.add(new int[]{0,0});
        visited[0][0] = true; 
        
        while(!queue.isEmpty()){
            int[] curPoint = queue.poll();
            int cx = curPoint[0];
            int cy = curPoint[1]; 
            
            for(int i=0; i<4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
            if(nx >=0 && nx < n && ny >=0 && ny < m && maps[nx][ny] != 0){
                if(!visited[nx][ny]){
                    dist[nx][ny] = dist[cx][cy] + 1; 
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = true; 
                }            
            
            }
                
            }
            
        }
        int answer = dist[n-1][m-1] == 0 ? -1 : dist[n-1][m-1];
        return answer;
    }
}