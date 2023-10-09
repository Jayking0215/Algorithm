class Solution {

    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int idx, int sum){
    	// 배열 마지막 노드까지 탐색이 끝났는지 체크
        if(idx == numbers.length){
        	// 합계와 타겟 값이 같으면 answer을 1 증가 시킴.
            if(sum == target) answer++; 
        }else{
        	// 해당 노드 값을 더하고 다음 값 탐색
            dfs(numbers, target, idx + 1, sum + numbers[idx]);
            // 해당 노드 값을 빼고 다음 값 탐색
            dfs(numbers, target, idx + 1, sum - numbers[idx]);
        }   
    }
}