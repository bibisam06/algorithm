import java.util.*;
class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();

        // 오름차순 정렬
        Arrays.sort(chars);

        // 내림차순으로 뒤집기
        StringBuilder sb = new StringBuilder(new String(chars));
        sb.reverse();

        return sb.toString();
    }
}