import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
         while (n > 0) {
            answer += n % 10; // 마지막 자리 더하기
            n /= 10;          // 자리 하나 줄이기
        }
      

        return answer;
    }
}