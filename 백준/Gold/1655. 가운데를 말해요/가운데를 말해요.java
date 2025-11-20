import java.util.*;
import java.io.*;
/*
1655 : 가운데를 말해요 ( 골드 2 )
 */
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // 작은 거
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 큰 거

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());


            if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
                maxHeap.offer(num);
            } else {
                minHeap.offer(num);
            }

            
            if (maxHeap.size() < minHeap.size()) {
                maxHeap.offer(minHeap.poll());
            } else if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.offer(maxHeap.poll());
            }
            sb.append(maxHeap.peek()).append("\n");
        }
        System.out.println(sb.toString());
    }
}
