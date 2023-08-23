class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int idx = my_string.length() - is_suffix.length();
        
        if(idx < 0){
            answer = 0;
        } else if(my_string.substring(idx).equals(is_suffix)){
            answer = 1;
        } else{
            answer = 0;
        }
        return answer;
    }
}