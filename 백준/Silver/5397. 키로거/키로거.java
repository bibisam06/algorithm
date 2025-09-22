import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            String s = br.readLine();
            char[] chars = s.toCharArray();

            LinkedList<Character> list = new LinkedList<>();
            int index = 0;
            for (char c : chars) {
                if (c == '<') {
                    if (index > 0) index--;  // 수정: isEmpty() 대신 index 경계 체크
                } else if (c == '>') {
                    if (index < list.size()) index++;  // 수정: 비었는지와 무관, size 경계만 체크
                } else if (c == '-') {
                    if (index > 0) {
                        index--;               // 왼쪽으로 한 칸 이동
                        list.remove(index);    // 수정: index-1가 아니라 index를 삭제
                    }
                } else {
                    list.add(index, c);        // 수정: 커서 위치에 삽입
                    index++;
                }
            }
            StringBuilder sb = new StringBuilder();
            for(char c : list){
                sb.append(String.valueOf(c));
            }
            System.out.println(sb.toString());
        }
    }
}
