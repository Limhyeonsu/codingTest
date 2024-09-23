import java.util.*;

public class Main
{
    public static int[] price;
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] streets = new int[n - 1];
		price = new int[n];
		for(int i=0; i<n-1; i++) {
		    streets[i] = scanner.nextInt();
		}
		for(int i=0; i<n; i++) {
		    price[i] = scanner.nextInt();
		}
		
		int answer = price[0] * streets[0];
		int nextIndex = getNextIndex(0, n);
		if(nextIndex == 0) {
		    for(int x=1; x<streets.length; x++) {
		        answer += price[0] * streets[x];
		    }
		} else {
		
    		for(int x=1; x<nextIndex; x++) {
    		    answer += price[0] * streets[x];
    		}
    		while(nextIndex < n-1){
    		    int tmp = nextIndex;
    		    nextIndex = getNextIndex(nextIndex, n);
    		    for(int x=tmp; x<nextIndex; x++) {
    		    answer += price[tmp] * streets[x];
    		    }
    		}
		}
        System.out.println(answer);
	}
	
	public static int getNextIndex(int curIndex, int n) {
	    
	    for(int j=curIndex + 1; j<n; j++) {
		    if(price[curIndex] > price[j]) {
		        return j;
		    }
		}
		return curIndex;
		
	    
	}
}