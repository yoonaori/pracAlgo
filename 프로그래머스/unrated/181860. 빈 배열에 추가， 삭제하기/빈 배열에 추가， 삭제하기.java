import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        List<Integer> x = new ArrayList<>();
        
        for(int i=0; i<flag.length; i++){
            if(flag[i] == true){
                int t = 0;
                while(t < arr[i]*2){
                    x.add(arr[i]);
                    t++;
                }
            } else{
                int f = 0;
                int idx = x.size()-1;
                while(f < arr[i]){
                    x.remove(idx);
                    idx--;
                    f++;
                }
            }
        }
        
        answer = new int[x.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = x.get(i);
        }
        return answer;
    }
}