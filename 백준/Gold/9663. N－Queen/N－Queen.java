/*
    백준 9663번 문제 : N-Queens
*/
import java.util.*;

public class Main {

    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] board = new int[n]; //queen 의 위치 잡을 때 ,, -> row -> columns 로 할거임
        Arrays.fill(board, -1);
        dfs(0, n, board);

        System.out.println(count);

    }

    static boolean isSafe(int row, int col, int[] board){

        for(int prev=0; prev<row; prev++) {
            if(board[prev] == col) return false; //퀸 둘수 없음 - false 반환
            if(Math.abs(board[prev] - col) == (Math.abs(prev - row))) return false;
        }
        return true;
    }

    //BackTracking
    static void dfs(int row, int n, int[] board){
        if(row == n) {
            count++;
            return;
        }
        for(int curr = 0; curr < n; curr++) {
            if(isSafe(row, curr, board)) {
                board[row] = curr;
                dfs(row + 1, n, board);
                board[row] = -1;
            }

        }
    }
}
