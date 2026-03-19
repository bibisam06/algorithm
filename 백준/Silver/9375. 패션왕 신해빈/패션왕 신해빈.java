import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
9375번 : 패션왕 신해빈 (실버3)
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int j=0; j<t; j++){
            int n = Integer.parseInt(br.readLine());
            int totalCount = 0;
            Map<String, Integer> clothes = new HashMap<>();


            for(int i=0; i<n; i++){
                StringTokenizer stk = new StringTokenizer(br.readLine());
                String cloth = stk.nextToken();
                String name = stk.nextToken(); //name -> cloth

                clothes.put(name, clothes.getOrDefault(name, 0) + 1);
            }

            int value = 1;
            for(String cloth : clothes.keySet()){
                value *= (clothes.get(cloth) + 1); //1 더한거 곱하기
            }

            value = value -1;
            System.out.println(value);

        }
    }
}
