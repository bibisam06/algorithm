import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<double[]> failures = new ArrayList<>(); // {스테이지 번호, 실패율}

        for (int i = 1; i <= N; i++) {
            int reach = 0;  // i단계 도달한 사람
            int fail = 0;   // i단계에서 멈춘 사람

            for (int s : stages) {
                if (s >= i) reach++;  
                if (s == i) fail++;   
            }

            double rate = (reach == 0) ? 0 : (double) fail / reach;
            failures.add(new double[]{i, rate});
        }


        failures.sort(Comparator.comparing((double[] a) -> a[1])
                                .reversed()
                                .thenComparing(a -> a[0]));

        for (int i = 0; i < N; i++) {
            answer[i] = (int) failures.get(i)[0];
        }

        return answer;
    }
}