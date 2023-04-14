import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        answer = new String[strings.length];
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<strings.length; i++){
            // (ex) usun, ebed, acar 
            // -> 인덱스 n에 해당하는 값을 strings 앞에 붙여 list에 담아줌
            list.add(strings[i].charAt(n) + strings[i]);
        }
        
        // (ex) acar, ebed, usun 오름차순 정렬
        // -> 인덱스 n이 같은 경우, 해당 정렬을 통해 사전순으로 정렬된다
        Collections.sort(list); 
        
        for(int i=0; i<list.size(); i++){
            // subString(1)을 통해 인덱스 1부터 끝까지의 문자열을 answer 배열에 담아줌
            answer[i] = list.get(i).substring(1);
        }
        
        return answer;
    }
}