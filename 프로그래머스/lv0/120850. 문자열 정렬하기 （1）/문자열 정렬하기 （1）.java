import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        // replaceAll()을 통해 my_string에서 알파벳(a-z)이 포함된 부분을 없애버림
        String str = my_string.replaceAll("[a-z]","");
        // 알파벳 삭제 후의 문자열 길이만큼 answer 배열 생성
        answer = new int[str.length()];
        
        for(int i=0; i<str.length(); i++){  // 문자열의 길이만큼 반복하며
            answer[i] = str.charAt(i) - '0';  // charAt()을 통해 문자(숫자) 하나씩 배열에 넣어줌
            // 이때 숫자는 문자로 인식되어 ASCII 코드로 넘어감
            // '0'= 48, '1'= 49, '2'= 50 ...
            // 따라서 '0'(48)을 각각 빼주면 해당하는 숫자가 된다
        }
        Arrays.sort(answer);  // 배열 오름차순 정렬해줌 (import 해야 함)
        
        return answer;
    }
}
