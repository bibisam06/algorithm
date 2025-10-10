import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        int curMax = numbers[0];

        for(int i=1; i<n; i++){
            int cur = numbers[i];
            int dpCur = Math.max(cur, curMax + cur);
            max = Math.max(dpCur, max);
            curMax = dpCur;

        }




        System.out.println(max);
    }
}
