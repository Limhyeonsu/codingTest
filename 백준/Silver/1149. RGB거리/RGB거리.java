import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] house = new int[n+1][3];
		int[][] dy = new int[n+1][3];
        
		for(int i=1; i<=n; i++) {
		    for(int j=0; j<3; j++) {
		        house[i][j] = scanner.nextInt();
		    }
		}
		
		for(int i=1; i<=n; i++) {
		    dy[i][0] = Math.min(dy[i-1][1], dy[i-1][2]) + house[i][0];
		    dy[i][1] = Math.min(dy[i-1][0], dy[i-1][2]) + house[i][1];
		    dy[i][2] = Math.min(dy[i-1][0], dy[i-1][1]) + house[i][2];
		    
		}
		
		System.out.println(Math.min(Math.min(dy[n][0], dy[n][1]), dy[n][2]));
      
	}
	
	
}