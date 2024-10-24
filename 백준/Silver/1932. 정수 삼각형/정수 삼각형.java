import java.util.*;

public class Main
{
    private static int[][] dy;
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Integer[][] triangle = new Integer[n][n];
		dy = new int[n][n];
		for(int i=0; i<n; i++) {
		    for(int j=0; j<i+1; j++) {
		        triangle[i][j] = scanner.nextInt();
		    }
		}
	
		System.out.println(Main.solution(triangle));
	}
	
	public static int solution(Integer[][] triangle) {
	    dy[0][0] = triangle[0][0];
	    int answer = triangle[0][0];
	    for(int i=1; i<triangle.length; i++) {
	        for(int j=0; j<i; j++) {
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