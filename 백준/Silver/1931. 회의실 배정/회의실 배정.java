import java.util.*;

class Cabinet implements Comparable<Cabinet>{
    
    public int startTime, endTime;
    
    public Cabinet(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    @Override
    public int compareTo(Cabinet o) {
        if(this.endTime == o.endTime) return this.startTime - o.startTime;
        else return this.endTime - o.endTime;
    }
}

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		ArrayList<Cabinet> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
		    int startTime = scanner.nextInt();
		    int endTime = scanner.nextInt();
		    list.add(new Cabinet(startTime, endTime));
		}
		
		Collections.sort(list);
		int cnt = 0;
		int et = 0;
		for(Cabinet c : list) {
		    if(c.startTime >= et) {
		        cnt++;
		        et = c.endTime;
		    }
		}
		
		System.out.println(cnt);
      
	}
}