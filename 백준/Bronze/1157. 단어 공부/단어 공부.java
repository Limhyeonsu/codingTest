import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		Map<Character, Integer> map = new HashMap<>();
		for(char x: input.toUpperCase().toCharArray()) {
		    map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		String answer = "";
		int max = Integer.MIN_VALUE;
		for(Character key : map.keySet()) {
		    int value = map.get(key);
		    
		    if(value > max) {
		        max = value;
		        answer = key + "";
		    }else if(value == max) {
		        answer = "?";
		    }
		}
		System.out.println(answer);
      
	}
}