class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        if(A.equals(B)){
            return answer;
        }

        int len = A.length();

        for(int i=0; i<len; i++){
            answer++;
            A = A.substring(len-1).concat(A.substring(0, len-1));

            if(A.equals(B)){
                return answer;
            }
        }

        answer = -1;
        return answer;
    }
}