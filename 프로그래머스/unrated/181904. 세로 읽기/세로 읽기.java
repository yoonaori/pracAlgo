import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        List<String> str = new ArrayList<>();
        
        // m글자씩 끊어서 arrayList에 담김
        for(int i=0; i<my_string.length(); i+=m){
            str.add(my_string.substring(i, i+m));
        }

        for(String current : str){
            answer += current.substring(c-1, c);
        }
        return answer;
    }
}