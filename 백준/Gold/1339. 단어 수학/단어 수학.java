import java.util.*;

public class Main {
    static Map<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

       
        Map<Character, Integer> weight = new HashMap<>();
        for (String word : words) {
            int len = word.length();
            for (int i = 0; i < len; i++) {
                char ch = word.charAt(i);
                int value = (int) Math.pow(10, len - i - 1);
                weight.put(ch, weight.getOrDefault(ch, 0) + value);
            }
        }

        List<Character> letters = new ArrayList<>(weight.keySet());
        letters.sort((a, b) -> weight.get(b) - weight.get(a));

        int num = 9;
        for (char ch : letters) {
            map.put(ch, num--);
        }

        int sum = 0;
        for (String word : words) {
            sum += calculate(word);
        }

        System.out.println(sum);
    }

    static int calculate(String s) {
        int sum = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            sum += map.get(chars[i]) * (int) Math.pow(10, s.length() - i - 1);
        }
        return sum;
    }
}
