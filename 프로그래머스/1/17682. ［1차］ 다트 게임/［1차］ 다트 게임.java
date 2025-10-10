import java.util.*;

class Solution {
    public int solution(String dartResult) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        char[] chars = dartResult.toCharArray();

        while (i < chars.length) {

            int num = 0;
            if (chars[i] == '1' && i + 1 < chars.length && chars[i + 1] == '0') {
                num = 10;
                i++;
            } else {
                num = chars[i] - '0';
            }
            list.add(num);
            i++;

            char bonus = chars[i];
            int last = list.get(list.size() - 1);
            if (bonus == 'S') last = (int) Math.pow(last, 1);
            else if (bonus == 'D') last = (int) Math.pow(last, 2);
            else if (bonus == 'T') last = (int) Math.pow(last, 3);
            list.set(list.size() - 1, last);
            i++;

           
            if (i < chars.length) {
                char option = chars[i];
                if (option == '*') {
                    if (list.size() >= 2) {
                        list.set(list.size() - 2, list.get(list.size() - 2) * 2);
                    }
                    list.set(list.size() - 1, list.get(list.size() - 1) * 2);
                    i++;
                } else if (option == '#') {
                    list.set(list.size() - 1, list.get(list.size() - 1) * -1);
                    i++;
                }
            }
        }

       
        int answer = 0;
        for (int score : list) {
            answer += score;
        }
        return answer;
    }
}
