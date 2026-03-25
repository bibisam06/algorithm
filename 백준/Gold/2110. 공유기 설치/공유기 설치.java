//package binarysearch.gold.Num2110;

import java.util.*;
/*
2110번 : 공유기 설치(골드IV)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] houses = new int[n];

        for(int i=0; i<n; i++){
            houses[i] = sc.nextInt();
        }

        Arrays.sort(houses);
        int answer = 0;
        int left = 1;//initial value;
        int right = houses[n-1]-houses[0];

        while(left<=right){
            int mid = (left+right)/2;
            if(check(houses, mid, c)){
                //right = mid-1;
                answer = mid;
                left = mid+1;
            }else{
                //left = mid+1;
                right = mid-1; 
            }
        }
        System.out.println(answer);

    }

    public static boolean check(int[] houses, int mid, int c){
        int n = houses.length;
        int value = 1;
        int indexValue = houses[0];
        for(int i=1; i<n; i++){
            if(houses[i] - indexValue >= mid){
                indexValue = houses[i]; //update
                value++;
            }
        }

        if(value >= c){
            return true;
        }else{
            return false;
        }
    }
}
