import java.util.*;
import java.io.*;

/*
백준 3015번 : 오아시스 재결합 ㅎ
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] people = new long[n];

        for(int i=0; i<n; i++){
            people[i] = Integer.parseInt(br.readLine());
        }

        Deque<long[]> stack = new ArrayDeque<>();
        long answer = 0;


        for(int i=0; i<n; i++){
            long count = 1;

            while(!stack.isEmpty() && stack.peek()[0] < people[i]){
                answer += stack.pop()[1];
            }

            while(!stack.isEmpty() && stack.peek()[0] == people[i]){
               long[] top = stack.pop();
               answer += top[1];
               count = top[1] + 1;

           }


            if (!stack.isEmpty()) answer++;
           stack.push(new long[]{people[i], count});

        }

        System.out.println(answer);
    }
}
