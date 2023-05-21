class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            char tmp = my_string.charAt(i);
            
            if(Character.isLowerCase(tmp)){ //소문자일 경우
                answer += Character.toUpperCase(tmp);
            } else{ //대문자일 경우
                answer += Character.toLowerCase(tmp);
            }
        }
        return answer;
    }
}