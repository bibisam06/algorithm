class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
 while(n >= a){
            int exchanged = (n / a) * b; // 새로 받은 콜라
            answer += exchanged;          // 총합에 추가
            n = exchanged + (n % a);      // 남은 병 + 새로 받은 병
            System.out.println("n : " + n + ", total: " + answer);
        }

        return answer;
    }
}