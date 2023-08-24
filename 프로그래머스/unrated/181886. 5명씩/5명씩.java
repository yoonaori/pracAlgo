class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        if(names.length%5 == 0){
            answer = new String[names.length/5];
        } else{
            answer = new String[names.length/5 + 1];
        }
        
        int idx = 0;
        for(int i=0; i<answer.length; i++){
            answer[i] = names[idx];
            idx += 5;
        }
        return answer;
    }
}