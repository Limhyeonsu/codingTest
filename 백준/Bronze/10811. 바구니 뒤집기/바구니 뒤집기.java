import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] baskets = new int[n+1];
        for(int i=1; i<=n; i++) {
            baskets[i] = i;
        }
        for(int k=1; k<=m; k++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            
            int a = j-i;
            if(a > 1) {
                for(int x=0; x<=a/2; x++) {
                    int tmp = baskets[j-x];
                    baskets[j-x] = baskets[i+x];
                    baskets[i+x] = tmp;
                }
                
            } else {
                int tmp = baskets[i];
                baskets[i] = baskets[j];
                baskets[j] = tmp;
            }
            
        
            
        }
        
        for(int i=1; i<=n; i++) {
            System.out.print(baskets[i] + " ");
        }
		
	}
}