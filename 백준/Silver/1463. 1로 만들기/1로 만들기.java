import java.util.Scanner;

/*
 1463번(실버 3) : 1로 만들기 (DP)
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dp = new int[n+1];

        //초깃값 설정하기
        dp[0] = 0;
        dp[1] = 0;

           for(int i=2; i<=n; i++){

               // case1 : 1빼기
               // case2 : 2나누기
               // case3 : 3나누기
               dp[i] = dp[i-1]+1; // 이게 초깃값

               if(i %2 == 0) dp[i]=Math.min(dp[i/2]+1, dp[i]);
               if(i %3 == 0) dp[i]=Math.min(dp[i/3]+1, dp[i]);

           }


//       for(int i: dp){
//           System.out.println(dp[i]);
//       }
//
//       System.out.println("======================");


        System.out.println(dp[n]);

    }
}
