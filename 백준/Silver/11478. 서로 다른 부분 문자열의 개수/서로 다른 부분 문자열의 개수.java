import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        char[] chars = S.toCharArray();


        Set<String> set = new HashSet<>();
        set.add(S);
        for(int i=1; i<=chars.length; i++){
            for(int j=0; j<chars.length-i+1; j++){
                if(i==1){
                    set.add(String.valueOf(chars[j]));
                }else{ //여기가 메인 일거같은 느낌..
                    
                    String temp = S.substring(j, j+i);
                    
                    set.add(temp);
                   
                }
            }

        }

        System.out.println(set.size());
    }


}
