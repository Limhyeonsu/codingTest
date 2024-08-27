import java.util.*;

public class Main
{
    static int count, houseCnt;
    static int[][] board;
    static String answer;
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		board = new int[n][n];
		for(int i=0; i<n; i++) {
		    String str = scanner.next();
		    char[] charArr = str.toCharArray();
		    for(int j=0; j<n; j++) {
		           board[i][j] = charArr[j] - 48;
		    }
		}
		
	
	    houseCnt = 0;
		answer = "";
		count = 0;
		for(int i=0; i<n; i++) {
		    for(int j=0; j<n; j++) {
		        if(board[i][j] == 1) {
		            count++;
		            houseCnt++;
		            board[i][j]=0;
		            DFS(i, j, board);
		            answer += houseCnt + " ";
		            houseCnt = 0;
		        }
		    }
		}
		
	    System.out.println(count);
		String[] strArr = answer.split(" ");
		int[] houseCntArr = new int[strArr.length];
		for(int i=0; i<strArr.length; i++) {
		    houseCntArr[i] = Integer.parseInt(strArr[i]);
		}
		
		
		Arrays.sort(houseCntArr);
		for(int x: houseCntArr) {
		    System.out.println(x);
		}
	}
	
	public static void DFS(int x, int y, int[][] board) {
	    int[] dx = {-1, 0, 1, 0};
	    int[] dy = {0, 1, 0, -1};
	 
	    for(int i=0; i<4; i++){
	        int nx = x+dx[i];
	        int ny = y+dy[i];
	        
	        if(nx>=0 && nx<board.length && ny>=0 && ny<board.length && board[nx][ny]==1) {
	            board[nx][ny] = 0;
	            houseCnt++;
	            DFS(nx, ny, board);
	        }
	    }   
	}
}