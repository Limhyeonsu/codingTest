import java.util.*;

public class Main
{
       
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n == 0) System.out.println(1);
		else System.out.println(DFS(n));
	}
	
	public static long DFS(int v) {
	    if(v == 1) return 1;
	    else {
	        return v * DFS(v-1); 
	    }
	}
}