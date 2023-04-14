import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        //문자열 s를 한글자씩 배열 arr에 담아줌
        String[] arr = s.split("");
        //arr를 내림차순으로 정렬(대문자가 소문자보다 작음)
        Arrays.sort(arr, Collections.reverseOrder());
        
        //향상된 for문을 사용하여, arr배열에 있는 원소들을 하나씩 꺼내어 answer에 담아줌
        for(String str : arr){ 
            answer += str;
        }
        
        return answer;
    }
}