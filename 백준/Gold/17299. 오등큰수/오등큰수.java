import java.util.*;
import java.io.*;
/*
17299번 : 오등큰수(골드3)
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(stk.nextToken());
        }

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        Map<Integer, Integer> map = new HashMap<>();
        //빈도수 계산하기 인덱스 - 빈도수 계산
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int[] answer = new int[n];
        for(int i=1; i<n; i++){

            if(map.get(nums[stack.peek()]) < map.get(nums[i])){
                while(!stack.isEmpty() &&
                        map.get(nums[stack.peek()]) < map.get(nums[i])){
                    answer[stack.peek()] = nums[i];
                    stack.pop();
                }
                stack.push(i);
            }else{
                stack.push(i); //미해결 인덱스들 여기에
            }
        }

        while(!stack.isEmpty()){
            int index = stack.pop();
            answer[index] = -1;
        }

        for(int i=0; i<n; i++){
            sb.append(answer[i]).append(" ");
        }
        System.out.println(sb);
    }
}
