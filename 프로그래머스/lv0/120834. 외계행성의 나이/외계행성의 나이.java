class Solution {
    public String solution(int age) {
        String answer = "";
        String age_962 = "abcdefghij";
        String[] age_str = Integer.toString(age).split("");
        
        for(int i=0; i<age_str.length; i++){
            answer += age_962.charAt(Integer.valueOf(age_str[i]));
        }
        
        return answer;
    }
}