import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String str_low = my_string.toLowerCase();
        String[] str = str_low.split("");
        Arrays.sort(str);
        
        for(String current : str){
            answer += current;
        }
        return answer;
    }
}