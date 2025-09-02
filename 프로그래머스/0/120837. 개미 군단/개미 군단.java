class Solution {
    public int solution(int hp) {
        int answer = 0;
        int tmp;
        int A = hp / 5;
        int B = (hp % 5) / 3;
        tmp = hp % 5;
        int C = (tmp % 3);
            
        answer = A + B + C;
        return answer;
    }
}