import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) {
		    int x = scanner.nextInt();
		    int y = scanner.nextInt();
		    int sum = x + y;
		    System.out.printf("Case #%d: %d + %d = %d\n", i, x, y, sum);
		}
	}
}