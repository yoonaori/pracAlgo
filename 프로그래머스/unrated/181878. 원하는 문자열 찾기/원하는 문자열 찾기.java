class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String lowerString = myString.toLowerCase();
        
        if(lowerString.contains(pat.toLowerCase())){
            answer = 1;
        } else{
            answer = 0;
        }
        return answer;
    }
}