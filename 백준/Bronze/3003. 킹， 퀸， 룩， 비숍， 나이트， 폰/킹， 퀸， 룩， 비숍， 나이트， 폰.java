import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
	    int[] chess = {1, 1, 2, 2, 2, 8};
	    int[] answer = new int[6];
	    for(int i=0; i<chess.length; i++) {
	        int chessInput = scanner.nextInt();
	        answer[i] = chess[i] - chessInput;
	    }
	    
	    for(int x: answer) {
	        System.out.print(x + " ");
	    }
		
	}
}