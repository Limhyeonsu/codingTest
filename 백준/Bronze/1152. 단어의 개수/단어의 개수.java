import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] arr = s.trim().split(" ");
		
		if(arr.length == 1 && arr[0].isEmpty()) {
		    System.out.println(0);
		} else {
		    System.out.println(arr.length);
		}
		
	}
}