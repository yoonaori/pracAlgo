class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letter_arr = letter.split(" ");
        
        for(String current : letter_arr){
            for(int i=0; i<morse.length; i++){
                if(current.equals(morse[i])){
                    answer += Character.toString(i+'a');
                }
            }
        }
        
        return answer;
    }
}