class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(String word : dic){
            int cnt = 0;
            for(String s : spell){
                if(word.contains(s)){
                    cnt++;
                }
            }
            
            if(cnt == spell.length){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}