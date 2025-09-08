import java.util.*;
class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String phone = phone_number.substring(0, length-4);
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<length-4; i++){
            sb.append("*");
        }
        String answer = phone_number.replace(phone, String.valueOf(sb));
        return answer;
    }
}