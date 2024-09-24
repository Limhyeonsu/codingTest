import java.util.*;

public class Main
{
    static int [] fibo;
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		fibo = new int[n+1];
		DFS(n);
		System.out.println(fibo[n]);
	}
	
	public static int DFS(int v) {
	    if(fibo[v] > 0) return fibo[v];
	    if(v == 0) return fibo[v] = 0;
	    else if(v == 1) return fibo[v] = 1;
	    else if(v == 2) return fibo[v] = 1;
	    else return fibo[v] = DFS(v-2) + DFS(v-1);
	    
	}
}