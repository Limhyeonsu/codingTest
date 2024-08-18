import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] tests = new int[n];
		for(int i=0; i<n; i++) {
		    tests[i] = scanner.nextInt();
		}
		
		Arrays.sort(tests);
		double highScore = Double.valueOf(tests[n-1]);
		double sumResult = 0.0;
		for(int i=0; i<tests.length; i++) {
		    sumResult += (Double.valueOf(tests[i]) / highScore) * 100;
		}
		
		System.out.println(sumResult/n);
		
	}
}