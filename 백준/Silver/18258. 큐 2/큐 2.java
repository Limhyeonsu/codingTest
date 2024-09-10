import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		Deque<Integer> queue = new ArrayDeque<>();
		for(int i=0; i<n; i++) {
		    String cmd = br.readLine();
		    int input = 0;
		    if(cmd.startsWith("push")) {
		        StringTokenizer st = new StringTokenizer(cmd);
                cmd = st.nextToken();
                input = Integer.parseInt(st.nextToken());
                
		    }
		  
		    
		    if(cmd.equals("push")) {
		        queue.offerFirst(input);
		    }
		    else if(cmd.equals("pop")) {
		        if(queue.isEmpty()){
		            bw.write("-1");
		            bw.write("\n");
		        } 
		        else {
		            bw.write(queue.pollLast() + "");
		            bw.write("\n");
		        }
		    }
		    else if(cmd.equals("size")) {
		        bw.write(queue.size() + "");
		        bw.write("\n");
		    }
		    else if(cmd.equals("empty")){
		        if(queue.isEmpty()) {
		            bw.write("1");
		            bw.write("\n");
		        }
		        else {
		            bw.write("0");
		            bw.write("\n");
		        }
		    }
		    else if(cmd.equals("front")){
		        if(queue.isEmpty()) { 
		            bw.write("-1");
		            bw.write("\n");
		        }
		        else {
		            bw.write(queue.peekLast() + "");
		            bw.write("\n");
		        }
		    }
		    else if(cmd.equals("back")){
		        if(queue.isEmpty()) {
		            bw.write("-1");
		            bw.write("\n");
		        }
		        else {
		            bw.write(queue.peekFirst() + "");
		            bw.write("\n");
		        }
		    }
		    
		
		}
		bw.flush();
		bw.close();
      
	}
}