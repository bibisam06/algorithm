import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int u = 0; u < t; u++) {
            int l = sc.nextInt();                 // 한 변 길이
            int[][] visited = new int[l][l];      // visited -> 거리(미방문: -1)
            Queue<int[]> queue = new ArrayDeque<>();

            for (int i = 0; i < l; i++) {
                for (int j = 0; j < l; j++) {
                    visited[i][j] = -1;
                }
            }

            int x = sc.nextInt();
            int y = sc.nextInt();
            int goalX = sc.nextInt();
            int goalY = sc.nextInt();

            
            if (x == goalX && y == goalY) {
                System.out.println(0);
                continue;
            }

           
            int[] dx = {-2,-2,-1,-1, 1, 1, 2, 2};
            int[] dy = {-1, 1,-2, 2,-2, 2,-1, 1};

            visited[x][y] = 0;
            queue.offer(new int[]{x, y});

            boolean done = false;
            while (!queue.isEmpty() && !done) {
                int[] p = queue.poll();
                int cx = p[0];
                int cy = p[1];

                for (int i = 0; i < 8; i++) {
                    int nx = cx + dx[i];
                    int ny = cy + dy[i];

                    if (0 <= nx && nx < l && 0 <= ny && ny < l && visited[nx][ny] == -1) {
                        visited[nx][ny] = visited[cx][cy] + 1;
                        if (nx == goalX && ny == goalY) {
                            System.out.println(visited[nx][ny]);
                            done = true;
                            break;
                        }
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}