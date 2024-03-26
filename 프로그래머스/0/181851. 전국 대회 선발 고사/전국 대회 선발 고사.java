import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> abc = new ArrayList<>();

        for(int i=1; i<=rank.length; i++){
            for(int j=0; j<rank.length; j++){
                if(rank[j] == i && attendance[j] == true){
                    abc.add(j);
                }
            }
        }

        int a = abc.get(0);
        int b = abc.get(1);
        int c = abc.get(2);
        
        answer = 10000*a + 100*b + c;
        return answer;
    }
}