class Solution {
    public String solution(String rny_string) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        
        for(char c : rny_string.toCharArray()){
            if(c == 'm'){
                str.append("rn");
            } else{
                str.append(c);
            }
        }
        answer = str.toString();
        return answer;
    }
}