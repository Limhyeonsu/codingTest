import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
		    int p = scanner.nextInt();
		    list.add(p);
		}
		
		Collections.sort(list);
		
		int answer = 0;
		int sum = 0;
		for(int i : list) {
		    answer = answer + i;
		    sum += answer;
		}
		System.out.println(sum);
      
	}
}