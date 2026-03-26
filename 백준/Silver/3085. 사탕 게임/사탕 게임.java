//package bruteforce.silver.Num3085;

import java.util.*;
/*
3085번 : 사탕게임(실버2)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[][] candy = new char[n][n];
        for(int i=0;i<n;i++){
            String s = sc.next();
            for(int j=0;j<n;j++){
                candy[i][j] = s.charAt(j);
            }
        }

        int answer=0;

        //행만 먼저 검사
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(candy[i][j] != candy[i][j+1]){
                    char tmp = candy[i][j];
                    candy[i][j] = candy[i][j+1];
                    candy[i][j+1] = tmp;

                    int checked = check(candy);
                    answer = Math.max(answer, checked);
                    //원상복귀

                    char tmp2 = candy[i][j];
                    candy[i][j]=candy[i][j+1];
                    candy[i][j+1] = tmp2;
                }
            }
        }

        //열만 따로 검사하기
        for(int j=0; j<n; j++){
            for(int i=0; i<n-1; i++){
                if(candy[i][j] != candy[i+1][j]){
                    char tmp = candy[i][j];
                    candy[i][j] = candy[i+1][j];
                    candy[i+1][j] = tmp;

                    int checked = check(candy);
                    answer = Math.max(answer, checked);

                    //원상복귀
                    char tmp2 = candy[i][j];
                    candy[i][j] = candy[i+1][j];
                    candy[i+1][j] = tmp2;
                }
            }
        }

        System.out.println(answer);
    }

    public static int check(char[][] candy){
        int answer = 1;

        int connected= 1;
        //행먼저검사
        for(int i=0; i<candy.length; i++){
            connected = 1;
            for(int j=0; j<candy[i].length-1; j++){
                if(candy[i][j] == candy[i][j+1]){
                    connected++;
                }else{ //한줄끝날때마다 answer update
                    connected = 1;
                }
                answer = Math.max(answer, connected);

            }
        }
        //열그다음에검사
        for(int j=0; j<candy[0].length; j++){
            connected = 1;
            for(int i=0; i<candy.length-1; i++){
                if(candy[i][j] == candy[i+1][j]){
                    connected++;
                }
                else{
                    //answer = Math.max(answer, connected);
                    connected = 1;
                }
                answer = Math.max(answer, connected);
            }
        }
        return answer;
    }
}
