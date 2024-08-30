import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		String temp = new StringBuilder(str).reverse().toString();
		if(str.equals(temp)) System.out.println(1);
		else System.out.println(0);
      
	}
}