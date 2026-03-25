//package binarysearch.silver.Num2512;
import java.util.*;
/*
2512 : 예산(실버2)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cities = new int[n];
        for(int i=0; i<n; i++){
            cities[i] = sc.nextInt();
        }
        int m = sc.nextInt();

        Arrays.sort(cities);
        int left = 0;
        int right = cities[cities.length-1]; //제일마지막제일큰걸로상한값잡고
        int answer = 0;
        while(left<= right){
            int mid = (left+right)/2;
            if(check(cities, mid, m)){
                left = mid + 1;
                answer = mid;
            }else{
                right = mid - 1;
            }
        }

        System.out.println(answer);

    }

    public static boolean check(int[] cities, int mid, int max){

        int total = 0;
        for(int i=0; i<cities.length; i++){
            if(cities[i] >= mid){
                total+=mid;
            }else{
                total+=cities[i];
            }
        }
        if(total<=max){
            return true;
        }else{
            return false;
        }

    }
}
