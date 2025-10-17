/*
     백준 1406 : 에디터 문제(실버2)
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();

        Deque<String> stack1 = new ArrayDeque<>();
        Deque<String> stack2 = new ArrayDeque<>(); //stack 두개 -> 왼쪽 오른쪽으로

        for(int i=0; i<text.length(); i++){
            stack1.push(String.valueOf(text.charAt(i)));
        }

        int n = Integer.parseInt(br.readLine());


        for(int i=0; i<n; i++){
            String input = br.readLine();
            if(input.equals("L") && !stack1.isEmpty()){
                String c = stack1.pop();
                stack2.push(c);
            }else if(input.equals("D") && !stack2.isEmpty()){
                String c = stack2.pop();
                stack1.push(c);
            }else if(input.equals("B") && !stack1.isEmpty()) stack1.pop();

            if(input.length() != 1 && input.charAt(0) == 'P'){
                String[] strings = input.split(" ");
                stack1.push(strings[1]);
            }
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        while(!stack1.isEmpty()) sb1.append(stack1.pop());
        while(!stack2.isEmpty()) sb2.append(stack2.pop());

        System.out.println(sb1.reverse().toString() + sb2.toString());
    }
}
