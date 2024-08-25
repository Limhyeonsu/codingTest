import java.util.*;

public class Main
{
    static ArrayList<ArrayList<Integer>> graph;
    static int[] visit;
    static int answer;
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int p1 = scanner.nextInt();
		int p2 = scanner.nextInt();
		int m = scanner.nextInt();
		
		visit = new int[n+1];
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
		    graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<m; i++) {
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    graph.get(a).add(b);
		    graph.get(b).add(a);
		}
		
		answer = 0;
		BFS(p1, p2);
        if(visit[p2] == 0) answer = -1;
        System.out.println(answer);
	}
	
	public static void BFS(int v, int p2) {
	    Queue<Integer> queue = new LinkedList<>();
	    visit[v] = 1;
	    queue.offer(v);
	    while(!queue.isEmpty()){
	        int len = queue.size();
	        for(int i=0; i<len; i++) {
	            int cv = queue.poll();
	            if(cv == p2) {
    	            return;
	            }
	            for(int nv : graph.get(cv)) {
	                if(visit[nv] == 0) {
	                    visit[nv] = 1;
	                    queue.offer(nv);
	                
	                }
	            }
	        }
	        answer++;
	    }
	}
}