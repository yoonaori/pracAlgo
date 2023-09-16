import java.util.*;
import java.lang.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        String beforeStr = String.valueOf(beforeArr);
        String afterStr = String.valueOf(afterArr);
        
        if(beforeStr.equals(afterStr)){
            answer = 1;
        } else{
            answer = 0;
        }
        
        return answer;
    }
}