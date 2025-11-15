import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] chars = input.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        int total = 0;
        int inner = 1;

        for(int i=0; i<chars.length; i++){
            if(chars[i] == '('){
                inner *= 2;
                stack.push(chars[i]);
            }
            else if(chars[i] == '['){
                inner *= 3;
                stack.push(chars[i]);
            }else if(chars[i] == ')'){

                if(stack.isEmpty() || stack.peek() != '('){
                    total = 0;
                    break;
                }
                if( chars[i-1] == '(') total += inner;

                stack.pop();
                inner /= 2;
            }
            else if(chars[i] == ']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    total = 0;
                    break;
                }
                if(chars[i-1] == '[') total += inner;

                stack.pop();
                inner /= 3;
            }

        }

        if(!stack.isEmpty()) total = 0;
        System.out.println(total);
    }
}
