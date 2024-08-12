import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] answer = new int[n];
		for(int i=0; i < n; i++) {
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    answer[i] = a + b;
		}
		
		for(int x: answer) {
		    System.out.println(x);
		}
		
      
	}
	
}