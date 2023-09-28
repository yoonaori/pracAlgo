import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str);  // 같은 문자를 카운트 하기위해 정렬
        
        for(int i=0; i<str.length; i++){
            // 같은 문자의 갯수를 세기위한 변수
            int cnt = 0;
            
            for(int j=0; j<str.length; j++){
                if(str[i].equals(str[j])){
                    cnt++;
                }
            }
            if(cnt == 1){
                answer += str[i];
            }
        }
        
        return answer;
    }
}