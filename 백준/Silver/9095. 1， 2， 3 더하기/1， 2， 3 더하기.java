import java.util.*;

public class Main
{
    static int[] dy;
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		for(int i=0; i<t; i++) {
		    int n = scanner.nextInt();
		    dy = new int[n+1];
		    System.out.println(Main.solution(n));
		}
	}
	
	public static int solution(int n) {
	    if(n == 1) {
	        return 1;
	    }else if(n == 2){
	        return 2;
	    }else if(n == 3) {
	        return 4;
	    }else if(n >= 4) {
	        dy[1] = 1;
    	    dy[2] = 2;
    	    dy[3] = 4;
    	    for(int i=4; i<=n; i++) {
    	        dy[i] = dy[i-1] + dy[i-2] + dy[i-3];
    	    }
	    }
	    return dy[n];
	}
}