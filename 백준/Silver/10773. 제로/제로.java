import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*
문제 : 제로(0) 10773번
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            int v = sc.nextInt();
            if(v == 0){
                stack.pop();
            }else{
                stack.push(v);
            }
        }

        if(stack.isEmpty()){
            System.out.println("0");
        }else{
            int value = getSum(stack);
            System.out.println(value);
        }

    }

    public static int getSum(Deque<Integer> stack) {
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}
