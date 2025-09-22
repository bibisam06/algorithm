import java.util.*;

public class Main {
    public static void main(String[] args) {
        //테스트 케이스 구현 나중에
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int q = 0; q < T; q++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[][] cabbage = new int[m][n];


            Queue<int[]> queue = new ArrayDeque<>();
            boolean[][] visited = new boolean[m][n];

            for(int i=0; i<x; i++){
                int t1 = sc.nextInt();
                int t2 = sc.nextInt();
                cabbage[t1][t2] = 1;
            }


            int counter = 0;
            int[] directX = {1, -1, 0, 0};
            int[] directY = {0, 0, 1, -1};

            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(!visited[i][j] && cabbage[i][j] == 1){
                        visited[i][j] = true;
                        queue.offer(new int[]{i, j});

                        counter++;

                        while (!queue.isEmpty()) {
                            int[] p = queue.poll();
                            int cx = p[0], cy = p[1];

                            for (int dir = 0; dir < 4; dir++) {
                                int nx = cx + directX[dir];
                                int ny = cy + directY[dir];

                                if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                                    // 👉 추가된 조건: 배추가 있어야 하고, 아직 방문 안 한 칸만 큐에 넣음
                                    if (cabbage[nx][ny] == 1 && !visited[nx][ny]) {
                                        visited[nx][ny] = true;
                                        queue.offer(new int[]{nx, ny});
                                    }
                                }
                            }
                        }

                    }
                }
            }


            System.out.println(counter);
        }
    }
}
