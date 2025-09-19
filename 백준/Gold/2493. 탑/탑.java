import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        int[] ans = new int[n];
        int[] stackIdx = new int[n];
        int[] stackH = new int[n];
        int top = -1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int h = Integer.parseInt(st.nextToken());

            // 현재 높이보다 작거나 같은 건 모두 제거
            while (top >= 0 && stackH[top] <= h) top--;

            ans[i] = (top >= 0) ? stackIdx[top] : 0;

            // 현재 탑을 스택에 push
            stackIdx[++top] = i + 1;  // 문제는 1-based
            stackH[top] = h;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(' ');
            sb.append(ans[i]);
        }
        System.out.print(sb.toString());
    }
}