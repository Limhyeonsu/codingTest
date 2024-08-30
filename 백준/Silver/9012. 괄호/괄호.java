import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
		    String input = br.readLine();
		    System.out.println(solution(input));
		}
	
	}
	
	public static String solution(String input) {
	    String answer = "YES";
	    Stack<Character> stack = new Stack<>();
	    for(char c : input.toCharArray()) {
	        if(c == '(') {
	            stack.push(c);
	        }else {
	            if(stack.isEmpty()) return "NO";
	            stack.pop();
	        }
	    }
	    if(!stack.isEmpty()) return "NO";
	    return answer;
		    
	}
}