//package binarysearch.silver.Num6236;
import java.util.*;
import java.io.*;
/*
6236번 : 용돈관리
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int[] days = new int[n];
        for(int i=0; i<n; i++){
            days[i] = Integer.parseInt(br.readLine());
        }

       //하한선 - 최댓값임
        long max = days[0];
        long sum = 0;
        for(int i=0; i<n; i++){
            max = Math.max(days[i], max);
            sum += days[i];
        } //최댓값 구하는 코드임

        long left = max;
        long right = sum; //상한, 하한 다 잡았구영
        long answer = 0;

        while(left<=right){
            long mid = (left+right)/2;
            if(check(days, m, mid)){
                right = mid - 1;
                answer = mid;
            }else{
                left = mid + 1;
            }
        }
        System.out.println(answer);
    }

    public static boolean check(int[] days, int m, long price){ //정확히 m번인출이가능한지확인하는코드임

        int count = 0; //이걸로 인출수 카운트할거임
        long moneyLeft = 0;
        for(int i : days){
            if(i > moneyLeft){
                //남은 돈 보다 필요한 돈이 많은 경우 -> 새로인출함
                moneyLeft = price - i; //새로 인출해서 price만큼임
                count++; //인출한 횟수 +1 하기
            }else{
                moneyLeft = moneyLeft - i; //사용한만큼 인출함
            }
        }

        if(count > m){
            return false;
        }else{
            return true;
        }
    }
}
