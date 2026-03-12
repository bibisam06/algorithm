import java.util.Scanner;

/*
 1003번(실버3) : 피보나치함수
 */
public class Main {

    static int[][] dp; // 전역변수로 설정해줌 0->1 순서임

   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       dp = new int[41][2]; //초기화하기
       int t = sc.nextInt();

       for(int j=0; j<t; j++){
           int n = sc.nextInt();

           //initial value
           dp[0][0] = 1; dp[0][1] = 0;
           dp[1][0] = 0; dp[1][1] = 1;

           for(int i=2; i<=n; i++){
               dp[i][0] = dp[i-1][0] + dp[i-2][0];
               dp[i][1] = dp[i-1][1] + dp[i-2][1];
           }



           System.out.println(dp[n][0] + " " + dp[n][1]);
       }
   }
}
