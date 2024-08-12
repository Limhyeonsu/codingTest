import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int totalAmount = scanner.nextInt();
		int n = scanner.nextInt();
		int calcAmount = 0;
		for(int i=0; i < n; i++) {
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    calcAmount += a * b;
		}
		String answer = "Yes";
		if(totalAmount != calcAmount) {
		    answer = "No";
		}
		
		System.out.println(answer);
	}
}