class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        sb.reverse();
        String answer = sb.toString();
        return answer;
    }
}