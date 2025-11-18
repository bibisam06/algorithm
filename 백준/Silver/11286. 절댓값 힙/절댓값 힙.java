import java.io.*;
import java.util.*;

/*
11286번 : 절댓값 힙 (실버1)
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        //정렬 기준 세워서 정렬 우선순위 큐
        PriorityQueue<Long> pq = new PriorityQueue<>(
                (a, b) -> {
                    long absA = Math.abs(a);
                    long absB = Math.abs(b);

                    if (absA != absB) {
                        return Long.compare(absA, absB);
                    }
                    return Long.compare(a, b);
                }
                // 절댓값 같을 때는 그냥 넣기
        );

        for(int i=0; i<n; i++){
            Long number = Long.parseLong(br.readLine());
            if (number == 0) {
                if(pq.isEmpty()) sb.append("0\n");
                else sb.append(pq.poll()).append("\n");
            }
            else pq.offer(number);
            //System.out.println(pq);
        }

        System.out.println(sb.toString());
    }
}
