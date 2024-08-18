import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int[] students = new int[28];
		
		for(int i=0; i<students.length; i++) {
		    students[i] = scanner.nextInt();
		}
		Arrays.sort(students);
		
		int x = 0;
		int size = students.length;
		for(int i=0; i<30; i++) {
		    if(x < size && students[x] == i + 1) {
		        x++;
		    }else{
	           System.out.println(i+1);
		    }   
		}
	}
}