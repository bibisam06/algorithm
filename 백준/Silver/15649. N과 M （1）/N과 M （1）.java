//package bruteforce.silver.Num15649;

import java.util.*;
import java.io.*;
/*
15649번 : N과 M(1) (실버2)
 */
public class Main {

    static boolean[] visited;
    static int[] output;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }
        output = new int[m]; //m개 뽑을거니까
        visited = new boolean[n];
        permutation(arr, 0, m);

    }

    public static void permutation(int[] arr, int depth, int r){
        if(depth == r){
            for(int i=0; i<r; i++){
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return ;
        }

        for(int i=0; i<arr.length; i++){
            if(visited[i]) continue;

            visited[i] = true;
            output[depth] = arr[i];
            permutation(arr, depth+1, r);
            visited[i] = false;
        }
    }
}
