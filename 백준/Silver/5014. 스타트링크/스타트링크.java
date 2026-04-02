//package bfs.silver.Num5012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
5012 : 스타 링크(실버1)
 */
public class Main {


    static int[] dist;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int f = Integer.parseInt(stk.nextToken());
        int s = Integer.parseInt(stk.nextToken());
        int g = Integer.parseInt(stk.nextToken());
        int u = Integer.parseInt(stk.nextToken());
        int d = Integer.parseInt(stk.nextToken()); //각각 입력받기 끝

        dist = new int[f+1];
        visited = new boolean[f+1];
        Arrays.fill(dist, -1);

        bfs(s, g, u, d, f);

        if(dist[g]==-1){
            System.out.println("use the stairs");
        }else{
            System.out.println(dist[g]);
        }
    }

    static void bfs(int start, int end, int up, int down, int totalFloor){
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(start);
        visited[start] = true;
        dist[start] = 0;

        while(!queue.isEmpty()){
            int current = queue.poll();
            if(current == end ){
                break;
            }
            int ucurrent = current + up;
            int dcurrent = current - down;

            if(ucurrent >= 1 && ucurrent <= totalFloor &&  !visited[ucurrent]){
                visited[ucurrent] = true;
                dist[ucurrent] = dist[current] + 1;
                queue.offer(ucurrent);
            }

            if(dcurrent >= 1 && dcurrent <= totalFloor && !visited[dcurrent]){
                visited[dcurrent] = true;
                dist[dcurrent] = dist[current] + 1;
                queue.offer(dcurrent);
            }
        }
    }
}