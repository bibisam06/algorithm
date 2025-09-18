import java.io.*;
import java.util.*;

public class Main {
    // 빠른 입력
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c, sign = 1, val = 0;
            do { c = read(); } while (c <= ' ');          // skip spaces
            if (c == '-') { sign = -1; c = read(); }
            while (c > ' ') { val = val * 10 + (c - '0'); c = read(); }
            return val * sign;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        int N = fs.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = fs.nextInt();

        int[] ans = new int[N];
        Arrays.fill(ans, -1);

        Deque<Integer> stack = new ArrayDeque<>(); // 인덱스 스택 (단조 감소)
        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        // 한 번에 출력
        StringBuilder sb = new StringBuilder(N * 3);
        for (int i = 0; i < N; i++) {
            if (i > 0) sb.append(' ');
            sb.append(ans[i]);
        }
        System.out.println(sb.toString());
    }
}