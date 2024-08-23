import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[][] charArr = new char[5][15];
	    
	    int i=0;
	    for(int x=0; x<5; x++){
	        String input = scanner.nextLine();
	     
		    char[] inputArr = input.toCharArray();
		    
		    for(int j=0; j<inputArr.length; j++) {
		        charArr[i][j] = inputArr[j];
		    }
		    i++;
		}
		
        for(i=0; i<15; i++) {
            
            for(int j=0; j<5; j++) {
                if(charArr[j][i] == '\0') continue;
                System.out.print(charArr[j][i]);
                
            }
        }  
        
	}
}