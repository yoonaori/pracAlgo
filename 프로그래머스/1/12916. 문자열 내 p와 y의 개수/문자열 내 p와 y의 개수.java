class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // 전체 소문자로 변환
        s = s.toLowerCase();
        
        int p = 0;
        int y = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p'){
                p++;
            } else if(s.charAt(i) == 'y'){
                y++;
            }
        }
        
        if(p==0 && y==0){
            return answer;
        }
        
        if(p == y){
            return answer;
        } else{
            answer = false;
            return answer;
        }
    }
}