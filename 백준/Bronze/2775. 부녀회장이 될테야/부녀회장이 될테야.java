import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=0; i<t; i++) {
		    int k = scanner.nextInt();
		    int n = scanner.nextInt();
		    int[] dy = new int[n+1];
		    
		    //0층 세팅
		    for(int j=0; j<n+1; j++) {
		        dy[j] = j;
		    }
		    
		    //1층~k층
		    for(int x=1; x<=k; x++) {
		        //2호~n호
		        for(int y=2; y<=n; y++) {
		            dy[y] = dy[y-1] + dy[y];
		        }
		        
		    }
		    
		    System.out.println(dy[n]);
		}
	
		
	}
}
