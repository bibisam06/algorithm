import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String action = sc.next();

            if (action.equals("enter")) {
                set.add(name);
            } else if (action.equals("leave")) {
                set.remove(name);
            }
        }

        List<String> result = new ArrayList<>(set);
        result.sort(Collections.reverseOrder()); // 사전 역순 정렬

        for (String name : result) {
            System.out.println(name);
        }
    }
}
