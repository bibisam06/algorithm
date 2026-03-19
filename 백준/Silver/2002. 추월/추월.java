import java.util.*;
/*
2002번 : 추월(실버1)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        Map<String, Integer> order = new HashMap<>();

        sc.nextLine();

        for(int i=0; i<n; i++){
            order.put(sc.nextLine(), i+1); // 1부터 2, 3, .... 순으로 들어감 (순서)
        }

        int[] cars = new int[n]; // 순서 저장해두는 그거 일단 필요할까바 만들었음

        // 영식이
        for(int i=0; i<n; i++){
            String car = sc.nextLine();
            cars[i] = order.get(car); // 순서 꺼내서저장해서넣기
        }

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(cars[i] > cars[j]) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
