import java.util.*;
import java.io.*;

/*
15651번 : N과M(3) : 중복순열
 */
public class Main {

    static int[] output;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        output = new int[m]; //m개의 정답을 고르는 문제임
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }

        repeatPermutation(arr,0, m);
        System.out.print(sb);
    }

    public static void repeatPermutation(int[] arr, int depth, int r){
        if(depth == r){
            for(int i=0; i<r; i++){
                sb.append(output[i]).append(" ");
            }
            sb.append("\n");
            //System.out.println(); //System.out.println(은 속도가 끔찍하게 느리다는 것
            return;
        }

        for (int j : arr) {
            output[depth] = j;
            repeatPermutation(arr, depth + 1, r);
        }
    }
}