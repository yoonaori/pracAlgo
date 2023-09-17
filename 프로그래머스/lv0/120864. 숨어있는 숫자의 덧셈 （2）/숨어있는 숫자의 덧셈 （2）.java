class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // [a-zA-Z] 는 모든 영어 소문자 대문자를 의미
        // 모든 영문자를 공백으로 바꾸고, 공백을 기준으로 나누어 배열에 저장
        String[] str_arr = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        
        for(String str : str_arr){
            if(!str.equals("")){
                answer += Integer.parseInt(str);
            }
        }
        return answer;
    }
}