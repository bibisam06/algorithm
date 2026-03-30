import java.util.*;
import java.io.*;
/*
2606번 : 바이러스 (
 */
public class Main {

    static int answer = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        //스타트는 항상 1로 고정이 되어있음
        //System.out.println(graph);
        answer = bfs(graph, 1);

        System.out.println(answer-1);
    }

    public static int bfs(List<List<Integer>> graph, int start){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()){
            int current = queue.remove();
            for(int next : graph.get(current)){
                if(!visited.contains(next)){
                    visited.add(next);
                    queue.add(next);
                }
            }
        }

        return visited.size();
    }
}
