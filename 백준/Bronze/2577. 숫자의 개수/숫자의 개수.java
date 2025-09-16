
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a * b * c;

        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<10; i++){
            map.put(String.valueOf(i), 0);
        }
        String value = String.valueOf(sum);
        char[] chars = value.toCharArray();
        for(char character : chars){
            map.put(String.valueOf(character), map.getOrDefault(String.valueOf(character), 0) + 1);
        }

        for(String key : map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
