import java.util.*; 
class Solution {
    public String[] solution(String[] record) {
        
        List<String> ids = new ArrayList<>();
        List<String> methods = new ArrayList<>(); 
        
        Map<String, String> map = new HashMap<>();
        
        
        for(int i = 0; i < record.length; i++) {
            String[] names = record[i].split(" ");
            String method = names[0];
            String uuid = names[1];
            
            methods.add(method);
            ids.add(uuid);
            
            if(method.equals("Enter") || method.equals("Change")) {
                map.put(uuid, names[2]); // 이름 업데이트
            }
        }
        
        
        List<String> arr = new ArrayList<>();
        for(int i = 0; i < ids.size(); i++) {
            String Id = ids.get(i);
            String met = methods.get(i);
            
            if(met.equals("Enter")) {
                arr.add(map.get(Id) + "님이 들어왔습니다.");
            } else if(met.equals("Leave")) {
                arr.add(map.get(Id) + "님이 나갔습니다.");
            }
        }
        
        
        String[] answer = new String[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}