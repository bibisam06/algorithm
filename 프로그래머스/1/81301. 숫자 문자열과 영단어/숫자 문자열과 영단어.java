import java.util.*; 
class Solution {
    public int solution(String s) {
        List<String> list = new ArrayList<>(List.of(
    "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
));
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        String tmp = "";
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length; i++){
            
            if(!Character.isDigit(chars[i])){
                tmp += chars[i];
                if(list.contains(tmp)){
                    sb.append(list.indexOf(tmp)); // 숫자로 변환
                    tmp = ""; // tmp 초기화
                }
            }else{
                sb.append(chars[i]);
            }
        }
        String string = String.valueOf(sb);
        answer = Integer.parseInt(string);
        return answer;
    }
}