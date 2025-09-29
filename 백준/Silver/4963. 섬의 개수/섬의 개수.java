import java.util.*; 

public class Main {
    public static void main(String[] args) {
        int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};  // 위, 아래, 왼쪽, 오른쪽, 좌상, 우상, 좌하, 우하
        int[] dc = {0, 0, -1, 1, -1, 1, -1, 1};  // 위, 아래, 왼쪽, 오른쪽, 좌상, 우상, 좌하, 우하


        Scanner sc = new Scanner(System.in);

        while(true) {
            Queue<int[]> queue = new ArrayDeque<>();

            int w = sc.nextInt();
            int h = sc.nextInt();
            if (w == 0 && h == 0) break; // 종료 조건
            boolean[][] visited = new boolean[h][w];

            int[][] grid = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    grid[i][j] = sc.nextInt(); //값 넣기
                }
            }
            
            int count = 0;
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(grid[i][j]==1 && !visited[i][j]){
                        count++;
                        visited[i][j] = true;
                        queue.offer(new int[]{i, j});

                        while(!queue.isEmpty()){
                            int[] p = queue.poll();
                            int cx = p[0];
                            int cy = p[1];

                            for(int k=0; k<8; k++){
                                int dx = cx + dr[k];
                                int dy = cy + dc[k];

                                if(dx >=0 && dx < h && dy >=0 && dy < w){
                                    if(grid[dx][dy]==1 && !visited[dx][dy]){

                                        queue.offer(new int[]{dx,dy});
                                        visited[dx][dy] = true;
                                    }
                                }
                            }
                        }
                    }

                }
            }
            System.out.println(count);

        }
    }
}
