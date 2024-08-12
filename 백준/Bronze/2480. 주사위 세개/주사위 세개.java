import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
        String[] arr = str.split(" ");
        
		int x = Integer.parseInt(arr[0]);
		int y = Integer.parseInt(arr[1]);
		int z = Integer.parseInt(arr[2]);
		
        int answer = 0;
        if(x == y || x == z || y == z) {
            
            if(x == y && x == z) {
                answer = (x * 1000) + 10_000;
                
            } else if(y == z) {
                answer = (y * 100) + 1_000;
            } else {
                answer = (x * 100) + 1_000;
            }
            
        } else {
            int maxValue = Math.max(Math.max(x, y), z);
            answer = maxValue * 100;
        }
        
        System.out.println(answer);
	}
}