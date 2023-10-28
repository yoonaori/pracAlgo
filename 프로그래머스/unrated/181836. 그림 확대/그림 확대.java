import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        List<String> answerList = new ArrayList<>();
        
        for(int i=0; i<picture.length; i++){
            // picture 배열의 각 원소를 다루기쉽도록 배열로 변환
            String[] tmp = picture[i].split("");
            StringBuilder build = new StringBuilder();
            for(int j=0; j<tmp.length; j++){
                // 가로로 k배 늘리기 : repeat() 사용하여 각 문자를 k만큼씩 반복처리
                build.append(tmp[j].repeat(k));
            }
            for(int j=0; j<k; j++){
                // 세로로 k배 늘리기
                answerList.add(build.toString());
            }
        }
        // k배씩 늘린 최종 그림 파일 list를 answer 배열로 변환
        answer = answerList.toArray(new String[answerList.size()]);
        return answer;
    }
}