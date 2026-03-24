import java.util.*;
/*
1966번 : 프린터 큐(실버3)
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] priorities = new int[n];
            for (int i = 0; i < n; i++) {
                priorities[i] = sc.nextInt();
            } //입력받기 끝

            Deque<int[]> documents = new ArrayDeque<>(); //인덱스 - 우선순위로입력
            for(int i=0; i<n; i++){
                documents.offer(new int[]{i,priorities[i]}); //넣어두기
            }

            //해당인덱스가 나오면 순서 출력하고 끝냄
            //처음에는while->for문으로 돌림
            int index = 0;
            boolean hasPriorities = false;
            while(!documents.isEmpty()){
                hasPriorities = false;
                int[] cur = documents.pollFirst();
                for(int[] doc : documents){
                    if(doc[1] > cur[1]){
                        hasPriorities = true;
                        break;
                    }
                }
                if(hasPriorities){ //우선순위큰게있는경우 -> 다시 뒤로 넣음
                    documents.offerLast(cur);
                }else{ //우선순위 큰 게 없는 경우 -> 출력처리
                    index++;
                    if(cur[0] ==m){
                        System.out.println(index);
                        break;
                    }

                }
        }
           // index++;

        }

    }
}