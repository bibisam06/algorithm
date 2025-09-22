
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        sc.nextLine();

        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<N+1; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<x; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int counter=0;
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new ArrayDeque<>();

        for(int i=1; i<=N; i++){// 모든 점을 다 찾을 거라서..
            if (visited.contains(i)) continue;
            if(!visited.contains(i)){

                //System.out.println(i + "프라스");
                counter ++;
            }

            visited.add(i);
            q.add(i);

            while(!q.isEmpty()){
                List<Integer> values = graph.get(q.poll());
                for(int k : values){
                    if(!visited.contains(k)){
                        visited.add(k);
                        q.offer(k);
                    }
                }
            }


        }

        System.out.println(counter);
    }
}
