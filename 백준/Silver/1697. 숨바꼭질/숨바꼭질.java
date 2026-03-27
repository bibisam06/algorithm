//package bfs.silver.Num1697;

import java.util.*;
/*
1697번 : 숨바꼭질(실버1)
 */
public class Main {
    static int[] dist = new int[100001];//10만좌표까지가능함
    static boolean[] visited = new boolean[100001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        bfs(n, k);
    }

    static void bfs(int n, int k){
        Deque<Integer> queue = new ArrayDeque<>();
        dist[n] = 0;
        queue.offer(n);
        visited[n] = true;

        while(!queue.isEmpty()){
            int cur = queue.poll();
            if(cur==k){
                System.out.println(dist[cur]);
                return;
            }
            int[] can = {cur+1, cur-1, cur*2};

            for(int i : can){
                if(i >= 0 && i <= 100000 && !visited[i]){
                    dist[i] = dist[cur] + 1;
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
