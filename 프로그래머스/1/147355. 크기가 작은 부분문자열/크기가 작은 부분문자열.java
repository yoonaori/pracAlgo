class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for(int i=0; i<=t.length()-p.length(); i++){
            long part = Long.parseLong(t.substring(i, i+p.length()));
            long p_int = Long.parseLong(p);

            if(part <= p_int){
                answer++;
            }
        }
        
        return answer;
    }
}