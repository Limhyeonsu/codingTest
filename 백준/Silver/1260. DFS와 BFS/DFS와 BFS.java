import java.util.*;

public class Main
{
    static int n, m, v;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] visit;
    // static int visitCnt;
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		v = scanner.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();

		
		for(int i=0; i<=n; i++){
		    graph.add(new ArrayList<Integer>());
		}
// 		visitCnt = 0;
		visit = new int[n+1];
		for(int i=0; i<m; i++) {
		    int a =scanner.nextInt();
		    int b =scanner.nextInt();
		    graph.get(a).add(b);
		    graph.get(b).add(a);
		}
		
		DFS(v);
		visit = new int[n+1];
		System.out.println();
		BFS(v);
      
	}
	
	public static void DFS(int v) {
	    System.out.print(v + " ");
	    Collections.sort(graph.get(v));
	    visit[v]=1;
	    for(int nv: graph.get(v)) {
    	    if(visit[nv]==0) {
    	        DFS(nv);
    	    }
    	}
	    
	}
	
	public static void BFS(int v) {
	    Queue<Integer> queue = new LinkedList<>();
	    visit[v]=1;
	    queue.offer(v);
	    while(!queue.isEmpty()) {
    	    int cv = queue.poll();
    	    System.out.print(cv + " ");
    	   // Collections.sort(graph.get(cv));
    	    
    	    for(int nv: graph.get(cv)) {
    	        if(visit[nv] == 0) {
    	            visit[nv]=1;
    	            queue.offer(nv);
    	        }
    	    }
    	    
    	}
	    
	}
}