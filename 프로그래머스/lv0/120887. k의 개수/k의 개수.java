class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String k_str = Integer.toString(k);
        
        for(int current=i; current<j+1; current++){
            String current_str = Integer.toString(current);
            for(int t=0; t<current_str.length(); t++){
                if(current_str.charAt(t) == k_str.charAt(0)){
                    answer++;
                }
            }
        }
        return answer;
    }
}