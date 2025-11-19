import java.util.*;
/*
2075번 : N번째 큰 수 ( 실버 3 )
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                pq.add(sc.nextInt());
            }
        }

        int answer = 0;
        for(int i=0; i<n; i++){
            answer = pq.poll();
        }

        System.out.println(answer);
    }
}
