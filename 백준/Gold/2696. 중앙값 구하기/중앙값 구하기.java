import java.util.*;
import java.io.*;

public class Main {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){ //테스트 케이스
            int N = Integer.parseInt(br.readLine());

            PriorityQueue<Integer> min = new PriorityQueue<>();
            PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
            List<Integer> answer = new ArrayList<>();

            int cnt = 0;
            StringTokenizer stk = null;

            while(cnt < N){
                if(stk == null || !stk.hasMoreTokens()){
                    stk = new StringTokenizer(br.readLine(), " ");
                }

                while(stk.hasMoreTokens() && cnt < N){
                    int num = Integer.parseInt(stk.nextToken());
                    cnt++;

                    //값 넣기
                    if (max.isEmpty() || num <= max.peek()) {
                        max.offer(num);
                    } else {
                        min.offer(num);
                    }

                    // 옮기기
                    if(max.size() < min.size()){
                        max.offer(min.poll());
                    }else if(max.size() > min.size() + 1){
                        min.offer(max.poll());
                    }

                    // 홀수 일 때 답변 넣어서
                    if(cnt % 2 == 1) answer.add(max.peek());
                }
            }

            //나가서 붙이기 sb
            sb.append(answer.size()).append("\n");
            for(int idx=0; idx<answer.size(); idx++){
                if(idx % 10 == 0 && idx != 0){
                    sb.append("\n");
                }
                sb.append(answer.get(idx)).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}