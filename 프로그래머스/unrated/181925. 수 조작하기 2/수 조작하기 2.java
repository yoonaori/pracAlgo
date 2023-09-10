class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        StringBuilder builder = new StringBuilder();
        
        for(int i=0; i<numLog.length-1; i++){
            int opr = numLog[i+1] - numLog[i];
            if(opr == 1){
                builder.append("w");
            } else if(opr == -1){
                builder.append("s");
            } else if(opr == 10){
                builder.append("d");
            } else{
                builder.append("a");
            }
        }
        answer = builder.toString();
        return answer;
    }
}