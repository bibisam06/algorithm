
import java.util.*;
/*
1654번 : 랜선 자르기(실버2)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] lanes = new int[k];
        for(int i=0; i<k; i++){
            lanes[i] = sc.nextInt();
        }
        Arrays.sort(lanes);
        //제일 작은 길이를 상한선을 해서 시작
        long left = 1;
        long right = lanes[k-1];
        long answer = 0;
        while(left<=right){
            long mid = (left+right)/2;
            if(check(lanes, mid, n)){
                left = mid+1;
                answer = mid;
            }else{
                right = mid-1;
            }
           // System.out.println(mid);
        }

        System.out.println(answer);
    }

    public static boolean check(int[] lanes, long mid, int nums){
        long count = 0;
        for(int i=0; i<lanes.length; i++){
            long value = lanes[i] / mid;
            count += value;
        }

        return count >= nums;
    }
}