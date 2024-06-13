class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        // 공백도 배열에 포함하기위해 limit를 -1로 지정
        String[] word = s.split(" ", -1);
        
        for(String str : word){
            for(int i=0; i<str.length(); i++){
                if(i % 2 == 0){
                    sb.append(String.valueOf(str.charAt(i)).toUpperCase());
                } else{
                    sb.append(String.valueOf(str.charAt(i)).toLowerCase());
                }
            }
            sb.append(" ");
        }

        answer = sb.substring(0, sb.length()-1);
        return answer;
    }
}