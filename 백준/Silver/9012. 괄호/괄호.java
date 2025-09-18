import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine(); // 한 줄 전체 입력
            Deque<Character> stack = new ArrayDeque<>();
            boolean valid = true;

            for (char c : str.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        valid = false;
                        break;
                    }
                }
            }

            if (valid && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}