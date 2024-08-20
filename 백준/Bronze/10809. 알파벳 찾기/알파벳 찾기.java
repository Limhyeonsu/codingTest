import java.util.*;

public class Main{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int[] alphabet = new int[26];
		for(int i=0; i<alphabet.length; i++) {
		    alphabet[i] = -1;
		}
		
		for(int i=0; i<s.length(); i++) {
		    int ascii = s.charAt(i);
		    if(alphabet[ascii-97] != -1) continue;
		    alphabet[ascii-97] = i;   
		}
    
        for(int i : alphabet) {
		    System.out.print(i + " ");
		}
	}
}