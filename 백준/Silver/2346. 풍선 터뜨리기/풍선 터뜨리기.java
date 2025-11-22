
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        ArrayDeque<int[]> balloons = new ArrayDeque<>();

        for(int i=0; i<N; i++){
            int k = sc.nextInt();
            
            balloons.addLast(new int[]{i+1, k});  // [풍선번호, k]
        }

        // 첫 풍선 터트리기
        int[] cur = balloons.pollFirst();
        sb.append(cur[0]).append(" ");  
        int move = cur[1];  

        while(!balloons.isEmpty()) {

            if (move > 0) {
                // 오른쪽 이동
                for(int i=0; i<move-1; i++){
                    balloons.addLast(balloons.pollFirst());
                }
            } else {
                
                for(int i=0; i<Math.abs(move); i++){
                    balloons.addFirst(balloons.pollLast());
                }
            }

            // 다음 풍선 터트리기
            cur = balloons.pollFirst();
            sb.append(cur[0]).append(" ");
            move = cur[1];  
        }

        System.out.println(sb);
    }
}