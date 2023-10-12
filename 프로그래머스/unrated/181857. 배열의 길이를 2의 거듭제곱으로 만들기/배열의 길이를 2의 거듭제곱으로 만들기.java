class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len = arr.length;
        int pow = 0;
        
        while(len > Math.pow(2, pow)){
            pow++;
        }
        // Math.pow()의 결과는 double형이므로 (int)로 형변환 필요
        // 생성된 answer 배열은 0으로 초기화된다
        answer = new int[(int)Math.pow(2, pow)];
        for(int i=0; i<len; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}