import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
        int answer = 0;
        if(x == y || x == z || y == z) {
            
            if(x == y && x == z) {
                answer = (x * 1000) + 10_000;
                
            } else if(y == z) {
                answer = (y * 100) + 1_000;
            } else {
                answer = (x * 100) + 1_000;
            }
            
        } else {
            int maxValue = Math.max(Math.max(x, y), z);
            answer = maxValue * 100;
        }
        
        System.out.println(answer);
	}
}