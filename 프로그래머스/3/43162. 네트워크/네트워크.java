class Solution {
    static boolean[] check;
    public int solution(int n, int[][] computers) {
        check = new boolean[n];
        int answer = 0;
        for(int i=0; i<n; i++) {
            if(!check[i]) {
                dfs(i, computers);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int v, int[][] computers) {
        check[v] = true;
        for(int i=0; i<computers[v].length; i++) {
            if(computers[v][i] == 1 && !check[i]) {
                dfs(i, computers);
            }
        }
    }
}