class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int cnt = 0;
        int[] origin = new int[arr.length];
        
        // arr와 origin의 요소를 확인하여 동일하면 cnt++이므로,
        // cnt와 arr의 길이가 같다는 것은 origin과 arr가 동일하다는 뜻
        // 따라서, origin과 arr가 같아질 때까지 반복
        while(cnt != arr.length){
            cnt = 0;
            origin = arr.clone();  // 배열 복사
            
            for(int i=0; i<arr.length; i++){
                if(arr[i]%2==0 && arr[i]>=50){
                    arr[i] /= 2;
                } else if(arr[i]%2!=0 && arr[i]<50){
                    arr[i] = arr[i]*2 + 1;
                }
                
                if(arr[i] == origin[i]){
                    cnt++;
                }
            }
            answer++;  // 반복횟수 체크 (for문 한번 돌때마다 증감)
        }
        
        return answer-1;  // 최소 반복값을 찾아야하므로 -1한 값이 정답
    }
}