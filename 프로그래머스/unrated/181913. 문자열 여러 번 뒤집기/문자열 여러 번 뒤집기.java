class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuilder origin = new StringBuilder(my_string);
        
        for(int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            
            StringBuilder tmp = new StringBuilder(origin.substring(start,end+1));
            tmp.reverse();
            origin.replace(start, end+1, tmp.toString());
        }
        answer = origin.toString();
        return answer;
    }
}