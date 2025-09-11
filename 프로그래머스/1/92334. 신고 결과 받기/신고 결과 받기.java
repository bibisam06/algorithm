import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) { 
        int[] answer = new int[id_list.length];
        Arrays.fill(answer, 0);

        // 각 유저의 인덱스 저장
        Map<String, Integer> user_id = new LinkedHashMap<>(); 
        // 각 유저가 신고당한 횟수
        Map<String, Integer> report_count = new HashMap<>();
        // 각 유저가 신고한 사람 목록
        Map<String, List<String>> mail_list = new HashMap<>();

        // 초기화
        for(int i=0; i<id_list.length; i++){
            user_id.put(id_list[i], i);
            report_count.put(id_list[i], 0);
            mail_list.put(id_list[i], new ArrayList<>());
        } 

        // 신고 처리
        for(String r : report){
            String[] split_data = r.split(" "); 
            String reporter = split_data[0];
            String reported = split_data[1];

            List<String> reporters = mail_list.get(reported);

            if(!reporters.contains(reporter)){
                reporters.add(reporter);
                report_count.put(reported, report_count.get(reported) + 1);
            }
        }

        // k번 이상 신고당한 사람의 신고자에게 메일 발송
        for(String key : report_count.keySet()){
            int count = report_count.get(key);
            if(count >= k){
                List<String> list2 = mail_list.get(key);
                for(String s : list2){
                    int index = user_id.get(s);
                    answer[index]++;
                }
            }
        }

        return answer;
    }
}