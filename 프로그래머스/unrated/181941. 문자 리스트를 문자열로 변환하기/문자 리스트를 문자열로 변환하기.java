class Solution {
    public String solution(String[] arr) {
        String answer = "";
        StringBuilder builder = new StringBuilder();
        
        for(String str : arr){
            builder.append(str);
        }
        answer = builder.toString();
        return answer;
    }
}