import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        int total = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
       // br.readLine();
        StringTokenizer stk2 = new StringTokenizer(br.readLine());
        Set<Integer> set1 = new HashSet<>();
        for(int i=0; i<a; i++){
            set1.add(Integer.parseInt(stk2.nextToken()));
        }

     //   br.readLine();
        StringTokenizer stk3 = new StringTokenizer(br.readLine());
        Set<Integer> set2 = new HashSet<>();
        for(int j=0; j<b; j++){
            set2.add(Integer.parseInt(stk3.nextToken()));
        }

        // 일단 다 넣엇고 각각 돌면서 있는가 없는가 보고 카운트하면 되지 않을까

        // A -> B 부터
        for(int i: set1){
            if(!set2.contains(i)) total++;
        }

        for(int j : set2){
            if(!set1.contains(j)) total++;
        }
        // B -> A

        System.out.println(total);
    }
}
