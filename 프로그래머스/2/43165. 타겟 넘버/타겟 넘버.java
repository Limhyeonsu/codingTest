class Solution {
    static int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        int sum = 0;
        dfs(0, numbers, target, sum);
        return answer;
    }
    
    public void dfs(int node, int[] numbers, int target, int sum) {
        if(node == numbers.length) {
            if(sum == target) answer++;
                    
        }else {
            dfs(node+1, numbers, target, sum + numbers[node]);
            dfs(node+1, numbers, target, sum - numbers[node]);
        }
        
    }
}