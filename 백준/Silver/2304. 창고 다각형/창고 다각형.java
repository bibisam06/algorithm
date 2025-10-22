import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] heights = new int[n][2];

        for(int i=0; i<n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            heights[i][0] = Integer.parseInt(stk.nextToken());
            heights[i][1] = Integer.parseInt(stk.nextToken());
        }

        Arrays.sort(heights, Comparator.comparingInt(a -> a[0]));

        int maxHeight = 0, maxIndex = 0;
        for(int i=0; i<n; i++){
            if(heights[i][1] >= maxHeight){
                maxHeight = heights[i][1];
                maxIndex = i;
            }
        }

        int total = 0;

        // x 좌표, 높이 순으로 저장되어 있음..
        int[] start = heights[0]; //현재 그거

        for(int i=1; i<=maxIndex; i++){
            if(heights[i][1] >= start[1]){
                int offset = heights[i][0] - start[0];
                total += offset * start[1];
                start = heights[i]; //값 업데이트..
            }
        }

        int[] end = heights[n-1];
        for(int i=n-2; i>=maxIndex; i--){
            if(heights[i][1] > end[1]){
                int offset = end[0] - heights[i][0];
                total += offset * end[1];
                end = heights[i];
            }
        }


        total += maxHeight;

        System.out.println(total);
    }
}
