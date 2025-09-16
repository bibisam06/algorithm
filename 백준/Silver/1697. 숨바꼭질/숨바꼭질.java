import java.util.*;

public class Main {
    static final int MAX = 100000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();


        if (n >= k) {
            System.out.println(n - k);
            return;
        }

        int[] dist = new int[MAX + 1];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new ArrayDeque<>();
        q.offer(n);
        dist[n] = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == k) {
                System.out.println(dist[cur]);
                return;
            }
            int[] nexts = {cur - 1, cur + 1, cur * 2};
            for (int nx : nexts) {
                if (0 <= nx && nx <= MAX && dist[nx] == -1) {
                    dist[nx] = dist[cur] + 1;
                    q.offer(nx);
                }
            }
        }
    }
}