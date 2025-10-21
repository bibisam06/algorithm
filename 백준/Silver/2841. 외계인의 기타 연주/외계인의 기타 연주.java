
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int count = 0;
        Deque<Integer>[] stacks = new ArrayDeque[7]; // line 1 ~ 6 까쥐

        for(int i=0; i<7; i++){
            stacks[i] = new ArrayDeque<>();
        }
        for(int i=0; i<n; i++){

            st = new StringTokenizer(br.readLine());
            int lines = Integer.parseInt(st.nextToken());
            int prat = Integer.parseInt(st.nextToken());

            while( !stacks[lines].isEmpty() && stacks[lines].peek() > prat){
                count++;
                stacks[lines].pop(); //크면 꺼냄
            }

            if (!stacks[lines].isEmpty() && stacks[lines].peek() == prat) continue;

            // 새 프렛 누르기
            stacks[lines].push(prat);
            count++;

        }

        System.out.println(count);

    }
}
