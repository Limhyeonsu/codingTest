import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		String[] arr = n.split("-");
		int[] sum = new int[arr.length];
		
		for(int i=0; i< arr.length; i++) {
		    String[] tmp = arr[i].split("\\+");
		    for(String str : tmp) {
		        sum[i] += Integer.valueOf(str);
		    }
		}
		int answer = sum[0];
		for(int i=1; i< sum.length; i++) {
		    answer -= sum[i]; 
		}
		
		System.out.println(answer);
      
	}
}