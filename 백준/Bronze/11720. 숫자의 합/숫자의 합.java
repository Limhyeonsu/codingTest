import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		int total = 0;
		for(int i=0; i<n; i++) {
		    total += Integer.parseInt("" + s.charAt(i));
		}
		System.out.println(total);
		
	}
}