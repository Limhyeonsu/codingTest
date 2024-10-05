import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
		    int v = Integer.parseInt(st.nextToken());
		    map.put(v, 0);
		}
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
		    int v = Integer.parseInt(st.nextToken());
		    if(map.containsKey(v)) {
		        System.out.print(1 + " ");
		    }else {
		        System.out.print(0 + " ");
		    }
		}
	}
}