import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while(true) {
            input = br.readLine();
            if(input.equals(".")) return;
            
            System.out.println(solution(input));
            
        }
	}
	
	public static String solution(String value) {
	    Stack<Character> stack = new Stack<>(); 
	    String answer = "yes";
	    for(char c : value.toCharArray()) {
	        if(c == '(' || c == '[') stack.push(c);
	        else if(c == ')'){
	            if(!stack.isEmpty()) {
	                if(stack.peek() == '(') stack.pop();
	                else return "no";
	            } else return "no";
	            
	        } else if(c == ']'){
	            if(!stack.isEmpty()) {
	                if(stack.peek() == '[') stack.pop();
	                else return "no";
	            } else return "no";
	        }
	    }
	    
	    if(!stack.isEmpty()) return "no";
	    
	    return answer;
	}
}