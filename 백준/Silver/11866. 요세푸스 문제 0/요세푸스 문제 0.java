import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
		    queue.offer(i);
		}
		int i = 1;
		System.out.print("<");
		while(queue.size() > 1) {
		    
		    int v = queue.poll();
		    if(i%k != 0) queue.offer(v);
		    else System.out.print(v + ", ");
		    i++;
		    
		}
		System.out.print(queue.poll() + ">");
      
	}
}