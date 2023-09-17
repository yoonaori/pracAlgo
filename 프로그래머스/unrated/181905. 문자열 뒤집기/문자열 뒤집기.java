class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String[] str_arr = my_string.split("");
        StringBuilder b = new StringBuilder();
        String tmp = "";
        
        for(int i=0; i<s; i++){
            b.append(str_arr[i]);
        }
        for(int i=e; i>=s; i--){
            tmp += str_arr[i];
        }
        b.append(tmp);
        for(int i=e+1; i<str_arr.length; i++){
            b.append(str_arr[i]);
        }
        
        answer = b.toString();
        return answer;
    }
}