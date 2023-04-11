class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // # 풀이 1번
	// int[] answer = {};
	// answer = new int[num2 - num1 + 1];
	    
	// numbers 배열을 num1번째 인덱스부터 num2번째 인덱스까지 
	// answer 배열에 복사함 (0은 answer 배열에 복사할 때, 몇번째 인덱스부터 넣을 것인지 명시한 것)
	// System.arraycopy(numbers, num1, answer, 0, num2);
	    
	// return answer;
        
        // # 풀이 2번
        int[] answer = {};
        answer = new int[num2-num1+1];  // 잘라낸 정수 배열의 길이만큼 answer 배열 생성
        
        for(int i=0; i<answer.length; i++){  // 잘라낸 정수 배열의 길이만큼 반복하며
            answer[i] = numbers[num1];  // answer 배열 0번째 칸에, numbers 배열의 num1번째 인덱스를 넣어주고
            num1++;  // num1의 그 다음 인덱스를 넣어주기 위해 1 증가시킴
        }
    
        return answer;
    }
}
