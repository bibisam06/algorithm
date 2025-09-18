
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();

        List<Integer> list = new ArrayList<>();
        //리스트 초기화
        for(int i=0; i<a; i++){
            list.add(i+1); //1 번부터니까..
        }

        Queue<Integer> queue = new ArrayDeque<>();
        int index = 0;
        while (!list.isEmpty()) {
            index = (index + b - 1) % list.size(); // 현재 크기 기준으로 모듈러
            int value = list.remove(index);        // 안전: 인덱스로 제거
            queue.add(value);
            // index는 다음 회차에서 현재 index부터 이어서 시작 (이미 그 자리는 삭제됨)
        }

        System.out.print("<");
        while(!queue.isEmpty()) {
            if(queue.size() == 1) {
                System.out.print(queue.poll());
            }else{
                System.out.print(queue.poll() + ", ");
            }
        }
        System.out.print(">");
    }
}
