import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		    int x = scanner.nextInt();
		    int y = scanner.nextInt();
		    
		    if(x == 0 && y ==0) break;
		    
		    System.out.println(x + y);
		}
		
	}
}