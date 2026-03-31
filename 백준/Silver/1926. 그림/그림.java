import java.util.*;
/*
1926번 : 그림 ( 실버 1 )
 */
public class Main {
    static int max = 0;
    static int counter = 0;
    static boolean[][] visited = new boolean[501][501];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] map = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                map[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    counter++;
                    bfs(map, i, j);
                }
            }
        }

        System.out.println(counter);
        System.out.println(max);

    }

    static void bfs(int[][] map, int x, int y){

        Queue<int[]> queue = new LinkedList<>();
        int total = 1;
        visited[x][y] = true;
        queue.add(new int[]{x, y});

        while(!queue.isEmpty()){
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};
            int[] cur = queue.poll();

            for(int i=0; i<4; i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if(nx >= 0 && nx < map.length && ny >= 0 && ny < map[0].length && map[nx][ny] == 1 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                    total++;

                }
            }
         }
        max = Math.max(max, total);




    }
}
