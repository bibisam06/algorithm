import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr= new int[n][n];

        int[] directX = {-1, 1, 0, 0};
        int[] directY = {0, 0, -1, 1};

        for(int i=0; i<n; i++) {
            String str = sc.next();
            for(int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

        List<Integer> list = new ArrayList<>();
        Queue<int[]> graph = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 1 && !visited[i][j]){
                    int size = 0;

                    visited[i][j] = true;
                    graph.add(new int[]{i, j});


                    while(!graph.isEmpty()){
                        int[] value = graph.poll();
                        size++;
                        for(int k=0; k<4; k++){

                            int dx = value[0] + directX[k];
                            int dy = value[1] + directY[k];
                            if(dx < n && dy < n && dx>=0 && dy>=0 ){ //엣지값 계산
                                if(arr[dx][dy] == 1 && !visited[dx][dy]){
                                    visited[dx][dy] = true;
                                    graph.add(new int[]{dx, dy});
                                }
                                }
                            }
                        }
                        list.add(size);
                    }

                }
            }
        Collections.sort(list);              //d오름차순 정렬
        System.out.println(list.size());
        for(int s : list) System.out.println(s);
        }



    }

