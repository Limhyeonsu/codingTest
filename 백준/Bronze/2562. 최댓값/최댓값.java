import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int pos= 0;
		for(int i=0; i<9; i++) {
		    int value = scanner.nextInt();
		    if(value > max) {
		        max = value;
		        pos = i+1;
		    }
		    
		}
		
		System.out.println(max);
		System.out.println(pos);
      
	}
}