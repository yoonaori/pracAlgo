class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = {};
        answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            String[] check = quiz[i].split(" ");
            int res = 0;
            if(check[1].equals("+")){
                res = Integer.parseInt(check[0]) + Integer.parseInt(check[2]);
            } else{
                res = Integer.parseInt(check[0]) - Integer.parseInt(check[2]);
            }
            
            if(res == Integer.parseInt(check[4])){
                answer[i] = "O";
            } else{
                answer[i] = "X";
            }
        }
        return answer;
    }
}