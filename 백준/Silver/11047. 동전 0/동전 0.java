import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();;
		
		for(int i=0; i<n; i++) {
		    list.add(scanner.nextInt()); 
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		int answer = 0;
		int sum = 0;
		boolean bool = true;
		for(int i: list) {
		   if(k == 0) break;
		   answer += k/i;
		   k = k%i;
		}
		
        System.out.println(answer);
	}
}