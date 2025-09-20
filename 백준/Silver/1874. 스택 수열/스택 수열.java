import java.util.*;

/*
1804 번 : 스택 수열
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int next = 1;

        for (int value : arr) {
            // value가 나올 때까지 1,2,3... push
            while (next <= value) {
                stack.push(next++);
                sb.append("+\n");
            }
            // 이제 맨 위가 value여야 pop 가능
            if (!stack.isEmpty() && stack.peek() == value) {
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.print("NO");
                return;
            }
        }
        System.out.print(sb.toString());
    }
}