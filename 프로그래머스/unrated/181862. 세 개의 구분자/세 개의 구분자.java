import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        List<String> l = new ArrayList<>();
        
        String str = myStr.replaceAll("a", " ").replaceAll("b", " ").replaceAll("c", " ");
        String[] tmp = str.split(" ");
        
        for(int i=0; i<tmp.length; i++){
            if(!tmp[i].equals("")){
                l.add(tmp[i]);
            }
        }
        
        if(l.isEmpty()){
            answer = new String[1];
            answer[0] = "EMPTY";
            return answer;
        }
        
        answer = new String[l.size()];
        for(int i=0; i<l.size(); i++){
            answer[i] = l.get(i);
        }
        return answer;
    }
}