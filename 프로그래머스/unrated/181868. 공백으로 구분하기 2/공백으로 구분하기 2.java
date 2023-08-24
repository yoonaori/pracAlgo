class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        // trim()을 통해 앞뒤 공백 제거
        my_string = my_string.trim();
        // \s는 공백을 의미하는 정규식, +는 그 이상을 뜻한다
        answer = my_string.split("\\s+");
        
        return answer;
    }
}