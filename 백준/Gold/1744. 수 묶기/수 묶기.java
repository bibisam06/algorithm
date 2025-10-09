/*
    1744 번 : 수 묶기 문제 ( 백준 )
*/
import java.util.*;

public class Main {

    public static void main(String[] args){
        int answer = 0;

        List<Integer> yangs = new ArrayList<>();
        List<Integer> ums = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int v = sc.nextInt();

            if(v == 1){
                answer += 1;
            }else if(v > 1){
                yangs.add(v);
            }
            else {
                ums.add(v);
            }

        }

        Collections.sort(yangs, Collections.reverseOrder());
        Collections.sort(ums);


        while(!yangs.isEmpty()){ //양수 계산
            if(yangs.size() == 1) {
                answer += yangs.get(0);
                break;
            }
            answer += (yangs.get(0) * yangs.get(1));

            yangs.remove(0);
            yangs.remove(0);// 0두번삭제
        }

        while(!ums.isEmpty()){
            if(ums.size() == 1) {
                answer += ums.get(0);
                break;
            }

            answer += ums.get(0) * ums.get(1);
            ums.remove(0);
            ums.remove(0);

        }

        System.out.println(answer);
    }
}
