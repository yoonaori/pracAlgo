class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int leng = pat.length();
        
        for(int i=0; i<=myString.length()-leng; i++){
            String sub = myString.substring(i, i+leng);
            if(sub.contains(pat)){
                answer++;
            }
        }
        
        return answer;
    }
}