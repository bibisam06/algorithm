import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int totalCount = 0;
        //n 개의 문자열 입력받기

        for(int i=0; i<n; i++){
            String str = sc.next();

            List<Character> list = new ArrayList<>();
            char[] chars = str.toCharArray();

            for(int j=0; j<chars.length-1; j++){
                if((chars[j] != chars[j+1]) && list.contains(chars[j+1])) {
                    totalCount++;
                    break;
                }
                list.add(chars[j]);
            }


        }

        //System.out.println(totalCount);
        System.out.println(n-totalCount);
    }
}
