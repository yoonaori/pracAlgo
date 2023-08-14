class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        // long 타입인 n을 String 타입으로 변환하여 str에 저장
        String str = Long.toString(n);
        // str을 ""(공백)으로 쪼개서 str_arr 배열에 저장
        String[] str_arr = str.split("");
        // str_arr의 길이 계산
        int size = str_arr.length; 
        
        answer = new int[size]; // size의 크기를 갖는 정답(answer) 배열 생성
        for(int i=0; i<size; i++){
            // parseInt를 통해 문자열을 int로 변환하여, 정답 배열에 저장
            answer[i] = Integer.parseInt(str_arr[size-1-i]);
        }
        
        return answer;
    }
}