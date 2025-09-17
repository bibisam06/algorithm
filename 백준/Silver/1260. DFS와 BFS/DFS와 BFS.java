import java.util.*;

public class Main {
    static List<List<Integer>> graph;
    static boolean[] visited;
    static List<Integer> order;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();    // 정점 수
        int M = sc.nextInt();    // 간선 수
        int start = sc.nextInt(); // 시작 정점

        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // 방문 순서가 "번호가 작은 정점부터"이므로 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        // DFS
        visited = new boolean[N + 1];
        order = new ArrayList<>();
        dfs(start);
        printAsLine(order);

        // BFS
        visited = new boolean[N + 1];
        order = new ArrayList<>();
        bfs(start);
        printAsLine(order);
    }

    static void dfs(int cur) {
        visited[cur] = true;
        order.add(cur);
        for (int next : graph.get(cur)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int v = q.poll();
            order.add(v);
            for (int next : graph.get(v)) {
                if (!visited[next]) {
                    visited[next] = true; // 큐에 넣을 때 방문 처리!
                    q.add(next);
                }
            }
        }
    }

    static void printAsLine(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) sb.append(' ');
            sb.append(list.get(i));
        }
        System.out.println(sb);
    }
}
