import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
		    arr[i] = scanner.nextInt();
		}
		int v = scanner.nextInt();
		
		Arrays.sort(arr);
		
		int answer = 0;
		for(int i=0; i<n; i++) {
		    if(arr[i] > v) break;
		    if(arr[i] == v) answer++;
		}
		
		System.out.println(answer);
	}
}