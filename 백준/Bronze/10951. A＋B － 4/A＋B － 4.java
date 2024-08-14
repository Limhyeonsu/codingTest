import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
		    int x = scanner.nextInt();
		    int y = scanner.nextInt();
		    
		    
		    System.out.println(x + y);
		}
		scanner.close();
	}
}