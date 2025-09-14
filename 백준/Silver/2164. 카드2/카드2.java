import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> queue =  new ArrayDeque<>();
        int index = 1;

        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while(queue.size() != 1){
            if(index % 2 == 1){
                //홀수번째일 때,
                queue.poll(); //꺼내서 걍 버림
            }else{
                //아닐때는 빼서 뒤로 넣음
                int value = queue.poll();
                queue.offer(value);
            }

            index++;
        }
        // 하나 남았을 때 꺼내서 출력하기
        System.out.println(queue.poll());
    }
}
