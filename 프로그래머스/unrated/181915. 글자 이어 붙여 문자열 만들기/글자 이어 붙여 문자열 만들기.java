class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        
        for(int idx : index_list){
            str.append(my_string.charAt(idx));
        }
        answer = str.toString();
        return answer;
    }
}