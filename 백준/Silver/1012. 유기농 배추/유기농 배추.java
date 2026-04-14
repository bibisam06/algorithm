import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int j=0; j<t; j++){
            int m = sc.nextInt(); // 가로
            int n = sc.nextInt(); // 세로
            int k = sc.nextInt();

            boolean[][] visited = new boolean[n][m];
            int[][] map = new int[n][m];
            int[][] cabbage = new int[k][2];
            int answer = 0;

            for (int i = 0; i < k; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                map[y][x] = 1;
                cabbage[i][0] = y; // row
                cabbage[i][1] = x; // col
            }

            for (int i = 0; i < k; i++) {
                int y = cabbage[i][0];
                int x = cabbage[i][1];

                if (!visited[y][x]) {
                    bfs(map, visited, y, x, n, m);
                    answer++;
                }
            }

            System.out.println(answer);
        }
    }

    static void bfs(int[][] map, boolean[][] visited, int y, int x, int n, int m) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{y, x});
        visited[y][x] = true;

        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int ny = cur[0] + dy[i];
                int nx = cur[1] + dx[i];

                if (ny >= 0 && ny < n && nx >= 0 && nx < m
                        && map[ny][nx] == 1 && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    queue.offer(new int[]{ny, nx});
                }
            }
        }
    }
}