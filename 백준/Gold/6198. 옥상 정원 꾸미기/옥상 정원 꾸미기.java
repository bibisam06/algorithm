import java.util.*;
import java.io.*;
/*
6198번 : 옥상정원 꾸미기(골드5)
 */
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }

        long answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && stack.peek() <= nums[i]){
                stack.pop();
            }
            answer += stack.size();
            stack.push(nums[i]);
        }

        System.out.println(answer);
    }
}