/*
    LCA 11437번 : 골드3
*/
import java.util.*;
public class Main {
    static ArrayList<Integer>[] graph;
    static int[] parent;
    static int[] depth;

    static void bfs(int root){
        Queue<Integer> queue = new ArrayDeque<>();
        Arrays.fill(parent, -1);
        Arrays.fill(depth, -1);

        parent[root] = 0;
        depth[root] = 0;
        queue.add(root);
        while(!queue.isEmpty()) {
            int value = queue.poll();
            List<Integer> list = graph[value];

            for(int v : list) {
                if (parent[v] != -1) continue;
                depth[v] = depth[value] + 1;
                parent[v] = value;
                queue.add(v);
            }
        }

    }

    public static int lca(int a, int b){

        if(depth[a] < depth[b]) {
            int temp = a;
            a = b;
            b = temp; //a 랑 b 랑 바꾸기 !!
        }
        while(depth[a] != depth[b]) {
            a = parent[a];
        }

        while(a != b) {
            a = parent[a];
            b = parent[b];
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        parent = new int[N+1];
        depth = new int[N+1];

        graph = new ArrayList[N+1];
        for(int i=0; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<N-1; i++) {
            int parent = sc.nextInt();
            int child = sc.nextInt();
            graph[parent].add(child);
            graph[child].add(parent);
        }

        bfs(1); //root 가 1번임

        int T = sc.nextInt();

        // Main part
        for(int i=0; i<T; i++) {
            int nodeA = sc.nextInt();
            int nodeB = sc.nextInt();

            System.out.println(lca(nodeA, nodeB));


        }
    }
}
