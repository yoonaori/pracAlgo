import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        // arr와 delete_list 배열을 arrayList 타입으로 변환
        List<Integer> arrList = new ArrayList<>();
        for(int num : arr){
            arrList.add(num);
        }
        List<Integer> delList = new ArrayList<>();
        for(int num : delete_list){
            delList.add(num);
        }
        
        for(int delNum : delList){
            if(arrList.contains(delNum)){
                arrList.remove(arrList.indexOf(delNum));
            }
        }
        answer = new int[arrList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}