class Solution {
    private static int[][] dy;
    public int solution(int[][] triangle) {
        dy = new int[triangle.length][triangle[triangle.length-1].length];
        dy[0][0] = triangle[0][0];
	    int answer = 0;
	    for(int i=1; i<triangle.length; i++) {
	        for(int j=0; j<triangle[i-1].length; j++) {
	            for(int k=j; k<j+2; k++) {
	                int sum = dy[i-1][j] + triangle[i][k];
	                answer = Math.max(answer, sum);
	                if(dy[i][k] > 0) {
	                    dy[i][k] = Math.max(dy[i][k], sum);
	                }else {
	                    dy[i][k] = sum;
	                }
	                
	            }
	        }
	    }
	    return answer;
    }
}