import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        List<String> str = new ArrayList<>();
        
        for(String current : strArr){
            if(current.contains("ad")){
                continue;
            } else{
                str.add(current);
            }
        }
        answer = str.toArray(new String[str.size()]);
        return answer;
    }
}