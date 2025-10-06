
/*
    백준 2018 : 수들의 합 5
*/
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = 1, end = 1;
        int sum = 1, count = 0;
        int n = sc.nextInt();

        while(start <= n) {
            if(sum == n) count ++; // 같은 경우에 + 1 해주기
            if(sum >= n) {
                sum -= start;
                start = start + 1;
            }else{
                end ++ ; //end 늘려서
                if(end > n) break;
                sum += end;
            }
        }
        System.out.println(count);
    }
}
