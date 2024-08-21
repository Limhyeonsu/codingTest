import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		String x = scanner.next();
		String y = scanner.next();
		
		StringBuilder sbr1 = new StringBuilder(x);
		StringBuilder sbr2 = new StringBuilder(y);
		
		int value1 = Integer.valueOf(sbr1.reverse().toString());
		int value2 = Integer.valueOf(sbr2.reverse().toString());
	
		System.out.println(value1 > value2 ? value1 : value2);
		
		
	}
}