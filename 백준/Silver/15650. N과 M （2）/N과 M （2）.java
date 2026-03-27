
import java.util.*;
import java.io.*;
/*
15650번 : N과 M(2) (실버2)
 */
public class Main {
    static int[] arr;
    static int[] output;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        //visited = new boolean[N];
        arr = new int[N];
        output = new int[M];
        for(int i=0; i<N; i++){
            arr[i] = i+1; // ㅎㅎ
        }

        combination(0, 0, M);
    }

    public static void combination(int depth, int start, int r){
        if(depth == r){
            for(int i=0; i<r; i++){
                System.out.print(output[i]+" ");
            }
            System.out.println();
            return;
        }

        for(int i=start; i<arr.length; i++){
            output[depth] = arr[i];
            combination(depth+1, i+1, r);
        }
    }

}