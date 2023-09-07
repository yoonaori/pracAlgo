class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        
        for(String current : str){
            if(!answer.contains(current)){
                answer += current;
            }
        }
        
        return answer;
    }
}