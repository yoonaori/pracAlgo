class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        
        while(k>0){
            str.append(my_string);
            k--;
        }
        answer = str.toString();
        return answer;
    }
}