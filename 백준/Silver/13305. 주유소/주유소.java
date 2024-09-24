import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] streets = new int[n - 1];
		int[] price = new int[n];
		for(int i=0; i<n-1; i++) {
		    streets[i] = scanner.nextInt();
		}
		price[0] = scanner.nextInt();
		for(int i=1; i<n-1; i++) {
		    int v = scanner.nextInt();
		    if(price[i - 1] < v) price[i] = price[i - 1];
		    else price[i] = v;
		}
		price[n - 1] = scanner.nextInt();
		
		int answer = 0;
		for(int i=0; i<n-1; i++) {
		    answer += price[i] * streets[i];
		}
		System.out.println(answer);
		
	}
}