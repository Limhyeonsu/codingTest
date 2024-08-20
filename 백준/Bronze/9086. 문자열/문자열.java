import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=0; i<t; i++) {
		    String s = scanner.next();
		    System.out.println(s.charAt(0) + "" +s.charAt(s.length()-1));
		}
	}
}