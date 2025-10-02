import java.util.*;

public class Main {

    static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<=n; i++) {
            list.add(i, new ArrayList<>());
        }
        for(int i=0; i<n-1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list.get(a).add(b);
           list.get(b).add(a);
        }

        int[] parent = new int[n+1]; //부모 노드 저장해둘 리스트임
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[n+1];

        queue.add(1);
        visited[1] = true;
        while(!queue.isEmpty()) {
            int cur = queue.poll();
            List<Integer> nexts = list.get(cur);

            for(int i : nexts) {
            if(!visited[i]) {
                visited[i] = true;
                queue.add(i);
                parent[i] = cur;
            }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=2; i<=n; i++) {
            sb.append(parent[i]).append("\n");
        }

        System.out.println(sb.toString());

    }

}
