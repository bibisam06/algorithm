//package binarysearch.silver.Num2805;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long m = sc.nextLong();

        int[] trees = new int[n];
        for (int i = 0; i < n; i++) {
            trees[i] = sc.nextInt();
        }

        Arrays.sort(trees);

        long left = 0;
        long right = trees[n - 1];
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;

            if (check(trees, mid, m)) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }

    public static boolean check(int[] trees, long mid, long m) {
        long total = 0;

        for (int i = 0; i < trees.length; i++) {
            if (trees[i] > mid) {
                total += (trees[i] - mid);
            }
        }

        return total >= m;
    }
}