
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        //List
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            String str1 = sc.nextLine();
            list.add(str1);
            map.put(str1, i+1);
        }

        for(int j = 0; j<M; j++){
            String str = sc.nextLine();
            char[] chars = str.toCharArray();

            if(Character.isDigit(chars[0])){
                System.out.println(list.get(Integer.parseInt(str)-1));
            }else{
                System.out.println(map.get(str));
            }
        }
    }
}
