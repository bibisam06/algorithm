

import java.util.*;
import java.io.*;

/*
2178번 : 미로탐색(실버1)
 */
public class Main {
    static int[][] dist = new int[1001][1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        int[][] map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(map);
        System.out.println(dist[N - 1][M - 1]);
    }

    public static void bfs(int[][] map) {
        int n = map.length;
        int m = map[0].length;

        boolean[][] visited = new boolean[n][m];
        Deque<int[]> deque = new ArrayDeque<>();

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        deque.offer(new int[]{0, 0});
        visited[0][0] = true;
        dist[0][0] = 1;

        while (!deque.isEmpty()) {
            int[] curr = deque.poll();
            int x = curr[0];
            int y = curr[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    deque.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    dist[nx][ny] = dist[x][y] + 1;
                }
            }
        }
    }
}