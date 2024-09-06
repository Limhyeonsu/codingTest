import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
            queue.offer(scanner.nextInt());
		}
		
	    String answer = "Nice";
        Stack<Integer> stack = new Stack<>();
        for(int i=1; i<=n; i++) {
            while(!queue.isEmpty()) {
                if(!stack.isEmpty()) {
                    if(stack.peek() == i) {
                        stack.pop();
                        break;
                    }
                }
                
                if(queue.peek() == i) {
                    queue.poll();
                    break;
                }
		        if(queue.peek() > i) {
		            stack.push(queue.poll());
		        }
            }
            
            if(!stack.isEmpty() && stack.peek() == i) {
                stack.pop();
            }
		}
		
		if(!stack.isEmpty()) answer = "Sad";
		System.out.println(answer);
      
	}

}
