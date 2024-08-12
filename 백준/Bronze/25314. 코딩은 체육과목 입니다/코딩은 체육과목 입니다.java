import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
	
	    int x = n / 4;
	    
	    for(int i=0; i<x; i++) {
	        System.out.print("long ");
	    }	
	    System.out.print("int\n");
	}	
}