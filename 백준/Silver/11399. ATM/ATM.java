
import java.util.*;

public class Main {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] times = new int[n];

    for(int i=0; i<n; i++){
        times[i] = sc.nextInt();
    }

    System.out.println(getMinTime(times));
}

static int getMinTime(int[] times){
    Arrays.sort(times);
   // System.out.println(Arrays.toString(times));
    int sum = 0;
    int total = 0;
    for(int i : times){
        sum += i;
        total += sum;
    }
    return total;
}
}
