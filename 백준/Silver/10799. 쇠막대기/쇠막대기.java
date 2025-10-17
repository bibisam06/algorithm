/*
백준 10799번 : 쇠막대기(스택예제#1)
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] chars = input.toCharArray();

        Deque<Character> stack = new ArrayDeque<>();
        int count = 0 ;

        for(int i=0; i<chars.length; i++){
            char c = chars[i];
            if(c == '(') stack.push(c);
            else{
                stack.pop();
                if(chars[i-1] == '(') {
                    count += stack.size();
                }else{
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
