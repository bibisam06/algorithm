import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 총 컴퓨터 수
        List<List<Integer>> virusList = new ArrayList<>();

        for (int i = 0; i < a + 1; i++) {
            virusList.add(new ArrayList<>());
        }

        int b = sc.nextInt(); // 연결 쌍 수
        for (int i = 0; i < b; i++) {
            int i1 = sc.nextInt();
            int i2 = sc.nextInt();
            virusList.get(i1).add(i2);
            virusList.get(i2).add(i1);
        }

        Queue<Integer> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(1);
        visited.add(1); // 시작 노드 방문 처리 필수!

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int next : virusList.get(current)) {
                if (!visited.contains(next)) {
                    queue.add(next);
                    visited.add(next);
                }
            }
        }

        System.out.println(visited.size() - 1); // 1번 제외
    }
}