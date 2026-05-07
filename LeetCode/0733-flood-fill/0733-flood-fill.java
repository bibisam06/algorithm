import java.util.*;  

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    
    int rows = image.length;
    int cols = image[0].length; 

    
    int oldcolor = image[sr][sc]; 
    if(oldcolor == color) return image;
    image[sr][sc] = color; //initial value 
    boolean[][] visited = new boolean[rows][cols];

    int[][] answer = bfs(image, sr, sc, visited, oldcolor, color);


    return answer;
    }

    static int[][] bfs(int[][] image, int startX, int startY, boolean[][] visited, int oldcolor, int newcolor){

        int m = image.length; 
        int n = image[0].length; 

        Queue<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[]{startX, startY}); 
        visited[startX][startY] = true; 

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1]; 

            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1 ,1};

            for(int i=0; i<4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >= 0 && nx < m && ny >=0 && ny < n){
                    if(image[nx][ny] == oldcolor){
                        image[nx][ny] = newcolor; //새 색깔로 바꿔끼움
                        queue.add(new int[]{nx, ny}); 
                    }
                }
            }
        }

        return image; 
    }
}