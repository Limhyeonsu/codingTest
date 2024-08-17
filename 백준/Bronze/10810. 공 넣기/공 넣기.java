import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] basket = new int[n];
		for(int x=0; x<m; x++) {
		    int i = scanner.nextInt();
		    int j = scanner.nextInt();
		    int k = scanner.nextInt();
		    
		    for(int y=i-1; y<=j-1; y++) {
		        basket[y] = k;
		    }
		}
		
		for(int x: basket) {
		    System.out.print(x + " ");
		}
      
	}
}