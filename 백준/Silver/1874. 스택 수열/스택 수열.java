import java.util.*;

/*
1874번 : 스택수열(실버2)
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int value = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            while (value < num) {
                ++value;
                stack.push(value);
                sb.append("+\n");
            }

            if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.print(sb);
    }

}