import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;

        int maxTime = times[0];
        for (int i = 1; i < times.length; i++) {
            maxTime = Math.max(maxTime, times[i]);
        }

        long start = 1;
        long end = (long) maxTime * n;

        while (start <= end) {
            long mid = (start + end) / 2;

            if (checkIfPossible(mid, n, times)) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return answer;
    }

    static boolean checkIfPossible(long time, int n, int[] times) {
        long sum = 0;

        for (int i = 0; i < times.length; i++) {
            sum += time / times[i];

            if (sum >= n) {
                return true;
            }
        }

        return false;
    }
}