class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int index1 = 0; // cards1의 인덱스
        int index2 = 0; // cards2의 인덱스
        
        // goal 배열의 원소 하나씩 꺼내어 확인
        for(String check:goal){
            // check가 cards1 또는 cards2에 있는지 확인
            if(index1<cards1.length && cards1[index1].equals(check)){
                index1++; // cards1에 있으면 cards1의 인덱스 증가
            } else if(index2<cards2.length && cards2[index2].equals(check)){
                index2++; // cards2에 있으면 cards2의 인덱스 증가
            } else{ // 둘다 없으면 No 리턴
                answer = "No";
                return answer;
            }
        }
        answer = "Yes"; // for문 정상적으로 돌았으면 Yes 리턴
        return answer;
    }
}