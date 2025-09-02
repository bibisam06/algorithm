class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        char[] tarr = t.toCharArray();
        long intP = Long.parseLong(p);
        int lenP = p.length();
        
        
        for(int i=0; i<=tarr.length-lenP; i++){
            String str = t.substring(i, i+lenP);
            long intT = Long.parseLong(str);
            System.out.println("str is"+ str);
            
            if (intT <= intP) {
                        answer++;
            }
        }
        return answer;
    }
}