
import java.util.*;

public class Main {

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    List<Integer> coins = new ArrayList<>();
    for(int i=0; i<n; i++){
        coins.add(sc.nextInt());
    }

    coins.sort(Collections.reverseOrder());
    int count = 0;
    for(int i=0; i<n; i++){

        if(coins.get(i) > k) continue;
        else{
            count += (k / coins.get(i));
            k %= coins.get(i);
        }
    }

    System.out.println(count);
}
}
