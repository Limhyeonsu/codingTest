import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] streets = new long[n-1];
		long[] price = new long[n];
		for(int i=0; i<n-1; i++) {
		    streets[i] = scanner.nextLong();
		}
		
		for(int i=0; i<n; i++) {
		    price[i] = scanner.nextLong();
		}
	
	    long minPrice = price[0];
	    long answer = 0L;
	    for(int i=0; i<n-1; i++) {
		    if(minPrice > price[i]) minPrice = price[i];
		    answer += (minPrice * streets[i]);
		    
		}
		
	
		System.out.println(answer);
		
	}
}