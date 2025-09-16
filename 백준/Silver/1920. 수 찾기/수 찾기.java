import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.nextInt());
        }

        int M = sc.nextInt();
        for (int j = 0; j < M; j++) {
            int value = sc.nextInt();
            if (set.contains(value)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}