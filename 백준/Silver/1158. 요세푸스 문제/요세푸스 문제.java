import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i); //값을 넣어서
        }


        int index = 0;
        while (!list.isEmpty()) {
            index = (index + K - 1) % list.size(); // 다음 제거할 위치
            answer.add(list.remove(index));
        }

        System.out.print("<");
        for (int i = 0; i < answer.size(); i++) {
            if (i == answer.size() - 1) {
                System.out.print(answer.get(i));
            } else {
                System.out.print(answer.get(i) + ", ");
            }
        }
        System.out.print(">");
    }
}
