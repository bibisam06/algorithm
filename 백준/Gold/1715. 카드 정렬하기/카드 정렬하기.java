
import java.util.*;
import java.io.*;

/*
   1715번 : 카드 정렬하기 ( 골드 4 )
 */
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<n; i++){
            pq.add(Integer.parseInt(br.readLine()));
        }

        int total = 0;
        while(!pq.isEmpty() && pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            int c = a + b;
            total += c;
            pq.add(c);
        }


        if(n==1) total = 0;
        System.out.println(total);
    }
}