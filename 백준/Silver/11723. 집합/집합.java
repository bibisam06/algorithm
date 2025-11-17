import java.util.*;
import java.io.*;
/*
11723번 : 집합
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            String line = br.readLine();
            String[] strings = line.split(" "); //공백 기준으로 나누기
           // System.out.println(strings[0]);

            String first = strings[0]; //첫 연산자만 가져와서 ..
            if(first.equals("add")) {
                set.add(Integer.parseInt(strings[1]));
            } else if(first.equals("remove")) {
                set.remove(Integer.parseInt(strings[1]));
            } else if(first.equals("check")) {
                int k = Integer.parseInt(strings[1]);
                if(set.contains(k)) sb.append("1\n");
                else sb.append("0\n");
            } else if(first.equals("toggle")) {
                int k = Integer.parseInt(strings[1]);
                if (set.contains(k)) set.remove(k);
                else set.add(k);
            } else if(first.equals("empty")) {
                set.clear();
            } else if(first.equals("all")) {
                set.clear();
                for(int j=0; j<20; j++){
                    set.add(j+1);
                }
            }

        }

        System.out.println(sb.toString());
    }
}
