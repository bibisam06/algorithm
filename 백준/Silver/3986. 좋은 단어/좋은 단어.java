import java.util.*;

/*
    3986번 : 좋은 단어
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 

        int counter = 0;

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            Deque<Character> stack = new ArrayDeque<>();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            
            if (stack.isEmpty()) counter++;
        }

        System.out.println(counter);
    }
}