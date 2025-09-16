import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [][] maze = new int[N][M];
        int [][] dist = new int[N][M];
        boolean[][] visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            Arrays.fill(dist[i], 0);
        } //거리배열 0으로 초기화 -> 거리 구하기

        for (int i = 0; i < N; i++) {
            String line = br.readLine().trim();
            for (int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        int[] dx = {-1, 1, 0 , 0};
        int[] dy = {0, 0, -1, 1};

        // bfs 여기서부터 시작
        Queue<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[]{0,0}); //처음 좌표 큐에 넣음
        visited[0][0] = true;
        dist[0][0] = 1;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1]; //x, y 값을 가져와서?
            if(x == N-1 && y == M-1){
                break;
            }
            for(int i=0; i<4; i++){
                int tempx = x + dx[i];
                int tempy = y + dy[i];

                if (tempx < 0 || tempy < 0 || tempx >= N || tempy >= M) continue;

                if (maze[tempx][tempy] == 0) continue;

                if (visited[tempx][tempy]) continue;

                visited[tempx][tempy] = true;
                queue.offer(new int[]{tempx, tempy});
                dist[tempx][tempy] = dist[x][y] + 1;
            }
        }

        System.out.println(dist[N - 1][M - 1]); // 최단 거리 출력
    }
}
