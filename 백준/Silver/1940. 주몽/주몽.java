/*
    1940 주몽
*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] numbers = new int[n];
        for(int i=0; i<n; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);

        //two pointer
        int left = 0;
        int right = n-1;
        int count = 0;

        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if( sum < m ) {
                left ++;
            }
            else if( sum == m ) {
                count++;
                left ++;
                right --;
            }else {
                right --;
            }

        }

        System.out.println(count);

    }
}
