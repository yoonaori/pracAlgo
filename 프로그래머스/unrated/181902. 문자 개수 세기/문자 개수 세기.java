class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        answer = new int[52];
        
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);

            // 대문자인 경우
            if(ch>='A' && ch<='Z'){
                answer[ch - 'A']++;
            // 소문자인 경우
            } else if(ch>='a' && ch<='z'){
                answer[26 + ch - 'a']++;
            }
        }
        return answer;
    }
}
