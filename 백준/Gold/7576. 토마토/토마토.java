import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // 열
        int n = sc.nextInt(); // 행

        int[][] tomato = new int[n][m];
        Queue<int[]> queue = new ArrayDeque<>();

        // ★ 입력 루프도 (i<n, j<m)로
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tomato[i][j] = sc.nextInt();
                if (tomato[i][j] == 1) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        int[] xNext = {1, -1, 0, 0};
        int[] yNext = {0, 0, 1, -1};

        int days = -1;

        // ★ 레벨 단위 BFS
        while (!queue.isEmpty()) {
            int size = queue.size();
            days++;
            for (int s = 0; s < size; s++) {
                int[] value = queue.poll();
                int x = value[0];
                int y = value[1];

                for (int i = 0; i < 4; i++) {
                    int nx = x + xNext[i];
                    int ny = y + yNext[i];


                    if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                        if (tomato[nx][ny] == 0) {
                            tomato[nx][ny] = 1;        // ★ 방문표시 겸 익힘
                            queue.add(new int[]{nx, ny});
                        }
                    }
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tomato[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }


        System.out.println(Math.max(0, days));
    }
}