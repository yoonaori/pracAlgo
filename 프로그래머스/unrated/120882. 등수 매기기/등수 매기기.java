import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = {};
        List<Integer> scoreList = new ArrayList<>();
        
        for(int[] s : score){
            // 영어 + 수학 합해서 list에 저장
            scoreList.add(s[0] + s[1]);
        }
        // list를 내림차순 정렬 (점수 합이 높은 순으로 정렬)
        scoreList.sort(Comparator.reverseOrder());
        
        answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            // indexOf() : 매개변수와 일치하는 원소의 인덱스 반환
            // 인덱스는 0부터 시작이므로 1등은 0이 아닌 1이 될수있도록 1을 더해줌
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
        }
        
        return answer;
    }
}