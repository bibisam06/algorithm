import java.util.*;
import java.io.*;
/*
2559번 : 수열(실버3)
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());

        int[] nums = new int[n];
        StringTokenizer stk2 = new StringTokenizer(bufferedReader.readLine());
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(stk2.nextToken());
        }//입력집어넣기끝

        //첫 k개
        int maxsum = 0;
        int windowsum =0;

        for(int i=0; i<k; i++){
            windowsum += nums[i];
        }

        maxsum = windowsum;

        for(int i=0; i<n-k; i++){
            windowsum = windowsum - nums[i] + nums[i+k];
                    //첫 애를 빼고 나서 뒤에애를 더하고
            maxsum = Math.max(maxsum, windowsum);
        }
        System.out.println(maxsum);
    }
}