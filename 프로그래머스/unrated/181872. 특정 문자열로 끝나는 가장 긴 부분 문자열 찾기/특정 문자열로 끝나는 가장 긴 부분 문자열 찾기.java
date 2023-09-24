class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        // lastIndexOf() 사용 : 뒤에서부터 체크 / 매개변수(pat)가 위치한 index를 반환해준다.
        int idx = myString.lastIndexOf(pat);
        
        // pat 이전의 String이 담기게 된다.
        answer = myString.substring(0, idx);
        answer += pat;
        
        return answer;
    }
}