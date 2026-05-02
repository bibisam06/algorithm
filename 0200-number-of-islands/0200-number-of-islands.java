import java.util.*; 

class Solution {

    static boolean[][] visited;

    public int numIslands(char[][] grid) {
        int sero = grid.length; 
        int garo = grid[0].length; 

        int counter = 0; 
        visited = new boolean[sero][garo];

        for(int i = 0; i < sero; i++) {
            for(int j = 0; j < garo; j++) {
                if(!visited[i][j] && grid[i][j] == '1') {
                    bfs(grid, i, j, sero, garo);
                    counter++; 
                }
            }
        }

        return counter;
    }

    static void bfs(char[][] grid, int startX, int startY, int sero, int garo) {
        Queue<int[]> queue = new ArrayDeque<>(); 
        visited[startX][startY] = true; 
        queue.add(new int[]{startX, startY});

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1}; 

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1]; 

            for(int i = 0; i < 4; i++) {
                int nx = currentX + dx[i];
                int ny = currentY + dy[i]; 

                if(nx >= 0 && nx < sero && ny >= 0 && ny < garo) {
                    if(!visited[nx][ny] && grid[nx][ny] == '1') {
                        visited[nx][ny] = true; 
                        queue.add(new int[]{nx, ny}); 
                    }
                }
            }
        }
    }
}