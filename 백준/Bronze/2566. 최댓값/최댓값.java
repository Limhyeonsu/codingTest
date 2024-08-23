import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int maxIndex1 = 0;
        int maxIndex2 = 0;
       
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                 int value = scanner.nextInt();
                 if(max < value) {
                     max = value;
                     maxIndex1 = i;
                     maxIndex2 = j;
                 }
            }
        }  
        
        System.out.println(max);
        System.out.println((maxIndex1+1) + " " + (maxIndex2+1));
	}
}