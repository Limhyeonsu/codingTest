import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> queue = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
		    StringTokenizer st = new StringTokenizer(br.readLine());
			int cmd = Integer.parseInt(st.nextToken());
		    int value = 0;
		    
		    if(st.hasMoreTokens()) value = Integer.parseInt(st.nextToken());
		    
		    switch (cmd) {
		        case 1: 
		            queue.offerLast(value);
		            break;
		        case 2:
		            queue.offerFirst(value);
		            break;
		        case 3:
		            if(queue.isEmpty()) {
		                bw.write("-1");
		                bw.write("\n");
		            } else {
		                bw.write(queue.pollLast() + "");
		                bw.write("\n");
		            }
		            break;
		        case 4:
		            if(queue.isEmpty()) {
		                bw.write("-1");
		                bw.write("\n");
		            } else {
		                bw.write(queue.pollFirst() + "");
		                bw.write("\n");
		            }
		            break;
		        case 5:
		            bw.write(queue.size() + "");
		            bw.write("\n");
		            break;
		        case 6:
		            if(queue.isEmpty()) {
		                bw.write("1");
		                bw.write("\n");
		            } else {
		                bw.write("0");
		                bw.write("\n");
		            }
		            break;
		        case 7:
		            if(queue.isEmpty()) {
		                bw.write("-1");
		                bw.write("\n");
		            } else {
		                bw.write(queue.peekLast() + "");
		                bw.write("\n");
		            }
		            break;
		        case 8:
		            if(queue.isEmpty()) {
		                bw.write("-1");
		                bw.write("\n");
		            } else {
		                bw.write(queue.peekFirst() + "");
		                bw.write("\n");
		            }
		            break;
		    }
		
		}
		
		bw.flush();
		bw.close();
      
	}
}