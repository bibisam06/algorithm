import java.util.*;

class Solution {
    public String solution(String new_id) {

        // 1단계: 대문자 -> 소문자
        String id = new_id.toLowerCase();

        // 2단계: 허용 문자 외 제거
        StringBuilder sb = new StringBuilder();
        for (char c : id.toCharArray()) {
            if (Character.isLetterOrDigit(c) || c == '-' || c == '_' || c == '.') {
                sb.append(c);
            }
        }

        // 3단계: 연속된 점 하나로 치환
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == '.' && sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == '.') {
                continue;
            }
            sb2.append(c);
        }

        // 4단계: 처음과 끝 점 제거
        if (sb2.length() > 0 && sb2.charAt(0) == '.') sb2.deleteCharAt(0);
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == '.') sb2.deleteCharAt(sb2.length() - 1);

        // 5단계: 빈 문자열이면 "a" 추가
        if (sb2.length() == 0) sb2.append('a');

      
        if (sb2.length() >= 16) {
            sb2.delete(15, sb2.length());
            if (sb2.charAt(sb2.length() - 1) == '.') sb2.deleteCharAt(sb2.length() - 1);
        }

        
        while (sb2.length() < 3) {
            sb2.append(sb2.charAt(sb2.length() - 1));
        }

        return sb2.toString();
    }
}
