import java.util.*;
import java.io.*;
/*
1021번 : 회전하는 큐 ( 실버 2 )
 */
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);

        int[] numbers = new int[m];

        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            numbers[i] = Integer.parseInt(stk.nextToken());
        }

        Deque<Integer> deque = new ArrayDeque<>(); //일단 1~ 까지 넣어두기

        for(int i=0; i<n; i++){
            deque.add(i+1);
        }

        int count = 0;
        for(int i=0; i<numbers.length; i++){
            int k = numbers[i];
            //좌우 길이 비교 -> 더 짧은 쪽으로 move -> 제일 앞에 나오면 뺴기

            while (deque.peekFirst() != k) {
                if (isLeftOrRight(deque, k)) {
                    deque = movetoRight(deque);
                    count++;
                } else {
                    deque = movetoLeft(deque);
                    count++;
                }
            }
            deque.pollFirst(); // k 제거

        }
        //하나씩 더할거임

      

        System.out.println(count);
    }

    static Deque movetoLeft(Deque deque){
        int left = (int)deque.pollFirst();
        deque.addLast(left);
        return deque;
    }

    static Deque movetoRight(Deque deque){

        int right = (int)deque.pollLast();
        deque.addFirst(right);
        return deque;
    }

    //좌우 길이 세는 거
    static boolean isLeftOrRight(Deque deque, int k ){

        int left = 0;
        for(Object i : deque){
            if(i.equals(k)){
                break;
            }
            left ++;
        }

        int right = deque.size() - left;

        if(right < left) return true; //왼 > 오 -> 오른쪽으로
        else return false; //반대는 왼쪽으로 가야겟쥬?
        //false -> 왼쪽, true -> 오른쪽
    }
}
