import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
        int[] remainders = new int[10];
        for(int i=0; i<remainders.length; i++) {
            remainders[i] = scanner.nextInt() % 42;
        }
        // System.out.println(Arrays.toString(remainders));
        for(int i=0; i<remainders.length; i++) {
            for(int j=i+1; j<remainders.length; j++) {
                if(remainders[i] != -1 && remainders[i] == remainders[j]) {
                    remainders[j] = -1;
                }
            }
        }
        int cnt = 0;
        for(int i=0; i<remainders.length; i++) {
            if(remainders[i] != -1) {
                cnt++;
            }
        }
		System.out.println(cnt);
	}
}