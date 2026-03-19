import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Set<String> tree = new TreeSet<String>(
                (a, b) -> {
                    if (a.length() == b.length()) {
                        return a.compareTo(b);
                    }
                    return a.length() - b.length();
        });

        // n 개 입력받기
        for(int i=0; i<n; i++) {
            tree.add(sc.next());
        }

        // 출력하기

        for(String str : tree){
            System.out.println(str);
        }
    }
}