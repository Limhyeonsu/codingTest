import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] dy = new int[n+1];
		
		Arrays.fill(dy, 5501);
		
		int[] bags = {3,5};
		dy[0] = 0;
		for(int i=0; i<bags.length; i++) {
		    for(int j=bags[i]; j<=n; j++) {
		        if(dy[j] > -1) {
		            dy[j] = Math.min(dy[j], dy[j-bags[i]]+1);
		        }
		    }
		}
		System.out.println(dy[n] == 5501 ? -1 : dy[n]);
      
	}
}