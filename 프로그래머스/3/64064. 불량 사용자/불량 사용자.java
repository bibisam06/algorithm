import java.util.*; 

class Solution {
    static Set<String> counter = new HashSet<>(); //set
    public int solution(String[] user_id, String[] banned_id) {
        
        counter.clear(); 
        List<String> strings = new ArrayList<>(); 
        boolean[] used = new boolean[user_id.length];
        
        combination(strings, user_id, banned_id, 0, used);

        return counter.size();
    }
    
    static boolean checking(String user_id, String banned_id){
        char[] username = user_id.toCharArray();
        char[] banned = banned_id.toCharArray(); 
        if(user_id.length() != banned_id.length()) return false;
        else{
            for(int i=0; i<user_id.length(); i++){
                if(banned[i] == '*') {
                    continue; 
                }
                else{
                    if(banned[i] != username[i]) return false;
                }
            }
        }
        return true; //체크함수는 그대로 놔둠
    }
    
    static void combination(List<String> strings2, String[] user, String[] banned_id, int startIndex, boolean[] used){
        int n = banned_id.length; 
        
        if(strings2.size() == n){
           List<String> sorted = new ArrayList<>(strings2);
            Collections.sort(sorted);
            counter.add(String.join(",", sorted)); // 조합(순서 무시)으로 저장
            return; 
        }
        int b = startIndex; 
        for(int i = 0; i<user.length; i++){ 
                if(used[i]) continue; 
                if(checking(user[i], banned_id[b])){
                    used[i] = true; 
                    strings2.add(user[i]);   
                    combination(strings2, user, banned_id, b + 1, used);
                    strings2.remove(strings2.size()-1); 
                    used[i] = false; 
                }
            
        
        }
        
    }
}

