import java.util.*;

public class Main
{
public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int value = scanner.nextInt();
            if(value < x) answer.add(value);
        }
        
        for(int result : answer) {
            System.out.print(result + " ");
        }
        
      
	}
}