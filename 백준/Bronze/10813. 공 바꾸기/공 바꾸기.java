import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] arr = new int[n];
		for(int x=0; x<n; x++) {
		    arr[x] = x+1;
		}
		
		for(int x=0; x<m; x++) {
		    int i = scanner.nextInt();
		    int j = scanner.nextInt();
		    int tmp = arr[i-1];
		    arr[i-1] = arr[j-1];
		    arr[j-1] = tmp;
		    
		}
      
        for(int x: arr) {
            System.out.print(x + " ");
        }
	}
}
