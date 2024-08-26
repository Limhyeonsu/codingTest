import java.util.*;

public class Main
{
    static int[][] board, dis;
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
        
        board = new int[n][m];
        dis = new int[n][m];
        for(int i=0; i<n; i++) {
            String str = scanner.next();
            char[] charArr = str.toCharArray();
            for(int j=0; j<m; j++) {
                board[i][j] = charArr[j] - 48;
            }
        }
        
        BFS(board);
        System.out.println(dis[n-1][m-1] + 1);
        
	}
	
	public static void BFS(int[][] board) {
	    int[] dx = {-1, 0, 1, 0};
	    int[] dy = {0 ,1, 0, -1};
	    Queue<int[]> queue = new LinkedList<>();
	    queue.offer(new int[]{0,0});
	    board[0][0] = 0;
	    while(!queue.isEmpty()) {
	        int[] cv = queue.poll();
	        for(int i=0; i<4; i++) {
	            int nx = cv[0] + dx[i];
	            int ny = cv[1] + dy[i];
	            if(nx>=0 && nx<board.length && ny>=0 && ny<board[0].length && board[nx][ny] == 1) {
	                board[nx][ny] = 0;
	                queue.offer(new int[]{nx, ny});
	                dis[nx][ny] = dis[cv[0]][cv[1]] + 1;
	            }
	            
	        }
	        
	    }
	}
}