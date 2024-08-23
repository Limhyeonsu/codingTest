import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
        
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        int[][] answer = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }  
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                b[i][j] = scanner.nextInt();
            }
        }  
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }  
	}
}