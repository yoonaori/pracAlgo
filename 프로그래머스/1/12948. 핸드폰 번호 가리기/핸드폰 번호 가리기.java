class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        int length = phone_number.substring(0, phone_number.length() - 4).length();
        sb.append("*".repeat(length));
        sb.append(phone_number.substring(length));
        
        answer = sb.toString();
        
        return answer;
    }
}