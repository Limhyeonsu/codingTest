import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		int ovenTime = scanner.nextInt();
		
		int resultHour = hour;
		int resultMinute = minute + ovenTime;
		if(resultMinute >= 60) {
		    resultHour += resultMinute / 60;
		    resultMinute = resultMinute % 60;
		    
		    if(resultHour == 24) {
		        resultHour = 0;
		    } else if(resultHour > 24) {
		        resultHour = resultHour % 24;
		    }
		} 
		
		System.out.println(resultHour + " " + resultMinute);
      
	}
}
