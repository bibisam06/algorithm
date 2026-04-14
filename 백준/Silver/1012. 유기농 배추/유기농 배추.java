//package bfs.silver.Num1012;

import java.util.*;
import java.io.*;
/*
1012 : 유기농배추 (실버2)
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());

            int m = Integer.parseInt(stk.nextToken());
            int n = Integer.parseInt(stk.nextToken());
            int k = Integer.parseInt(stk.nextToken());

            int[][] map = new int[m][n];
            boolean[][] visited = new boolean[m][n];

            int counter = 0;
            for(int j = 0; j <k; j++){
                StringTokenizer stk2 = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(stk2.nextToken());
                int y = Integer.parseInt(stk2.nextToken());
                map[x][y] = 1;
            }

            for(int j=0; j<m; j++){
                for(int j2 = 0; j2<n; j2++){
                    if(!visited[j][j2] && map[j][j2] == 1){
                        counter++;
                        bfs(map, j, j2, visited);
                    }
                }
            }

            System.out.println(counter);
        }
    }

    static void bfs(int[][] map, int x, int y, boolean[][] visited){
        Queue<int[]> queue = new ArrayDeque<>();

        visited[x][y] = true;
        queue.add(new int[]{x, y});

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};

            for(int i=0; i<4; i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if(nx >= 0 && nx < map.length && ny >= 0 && ny < map[0].length && !visited[nx][ny] && map[nx][ny] == 1){
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}
