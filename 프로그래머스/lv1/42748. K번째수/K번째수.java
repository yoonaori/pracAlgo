import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            // 인덱스 값 아님
            int start = commands[i][0];
            int end = commands[i][1];
            int num = commands[i][2];
            
            // start에서 1을 빼주는 이유는, start가 인덱스 값이 아닌 몇번째부터 시작인지 명시한 변수이기 때문
            // 반대로 end는 copyOfRange()가 해당 배열을 end값이 아닌 end 직전 인덱스까지 복사하기 때문에 1을 빼주지 않음
            // (ex) Arrays.copyOfRange(arr, 0, 3) -> arr배열의 인덱스 0부터 인덱스 2까지 복사
            int[] splitArray = Arrays.copyOfRange(array, start-1, end);
            
            Arrays.sort(splitArray);  // 잘라낸 배열 오름차순 정렬
            // 위의 start와 마찬가지로, num이 인덱스 값이 아닌 몇번째 수를 구할 것인지 명시한 변수이기 때문에 1을 빼줌
            answer[i] = splitArray[num-1];
        }
        
        return answer;
    }
}