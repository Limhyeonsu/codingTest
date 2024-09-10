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
		    while(bool) {
		        if(sum == k) bool = false;
		        if(i > k) break;
		        else if(sum < k){
		            answer++;
		            sum += i;
		        }else if(sum > k) {
		            answer--;
		            sum -= i;
		            break;
		        }
		    }
		}
		
        System.out.println(answer);
	}
}