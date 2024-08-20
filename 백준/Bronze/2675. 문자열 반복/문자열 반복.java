import java.util.*;

public class Main{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		for(int i=0; i<t; i++) {
		    int r = scanner.nextInt();
		    String s = scanner.next();
		    String answer = "";
		    for(char c : s.toCharArray()) {
		        for(int x=0; x<r; x++) {
		            answer += c;
		        }
		    }
		    System.out.println(answer);
		}
	}
}