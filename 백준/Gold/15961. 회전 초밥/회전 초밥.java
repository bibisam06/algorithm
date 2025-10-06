import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); 
        int d = Integer.parseInt(st.nextToken()); 
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] belt = new int[n];
        for (int i = 0; i < n; i++) {
            belt[i] = Integer.parseInt(br.readLine());
        }

        int[] cnt = new int[d + 1]; // 초밥 종류별 개수
        int kind = 0;          

        // 초기 윈도우 [0, k-1]
        for (int i = 0; i < k; i++) {
            if (cnt[belt[i]] == 0) kind++;
            cnt[belt[i]]++;
        }

        int ans = kind;
        
        ans = (cnt[c] == 0) ? ans + 1 : ans;

        
        for (int i = 1; i < n; i++) {
            
            int left = belt[i - 1];
            cnt[left]--;
            if (cnt[left] == 0) kind--;

            
            int right = belt[(i + k - 1) % n];
            if (cnt[right] == 0) kind++;
            cnt[right]++;

            // 쿠폰 포함 여부 계산
            int current = kind + (cnt[c] == 0 ? 1 : 0);
            ans = Math.max(ans, current);
        }

        System.out.println(ans);
    }
}
