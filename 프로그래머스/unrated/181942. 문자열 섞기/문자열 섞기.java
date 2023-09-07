class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] str1_Ar = str1.split("");
        String[] str2_Ar = str2.split("");

        for(int i=0; i<str1_Ar.length; i++){
            answer += str1_Ar[i];
            answer += str2_Ar[i];
        }
        return answer;
    }
}