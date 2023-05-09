class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int depth, int sum){
        // 마지막 노드까지 탐색한 경우
        if(depth == numbers.length){
            // 합이 target과 같으면 answer++후 해당 메소드 종료
            if(target == sum){
                answer++;
            }
            return;
        }
        
        int plus = sum + numbers[depth];
        int minus = sum - numbers[depth];
        
        // 해당 노드의 값을 더하고 다음 깊이 탐색
        dfs(numbers, target, depth+1, plus);
        // 해당 노드의 값을 빼고 다음 깊이 탐색
        dfs(numbers, target, depth+1, minus);
    }
}