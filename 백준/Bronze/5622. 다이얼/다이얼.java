/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		String[] dialStr = {" ", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "OPERATOR"};
		int [] dialTime = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		
		String x = scanner.next();
		int answer = 0;
		for(int i=0; i<x.length(); i++) {
		    if(x.charAt(i) == ' ') {
		        answer += dialTime[0];
		        continue;
		    } else if(x.equals("OPERATOR")) {
		        answer += dialTime[dialTime.length-1];
		        continue;
		    }
		    
		    loopout:
		    for(int l=0; l<dialStr.length; l++) {
    		    for(int j=0; j<dialStr[l].length(); j++) {
    		        if(dialStr[l].charAt(j) == x.charAt(i)) {
    		            answer += dialTime[l];
    		            break loopout;
    		        } 
    		    }
		    
		    }
		}
		
		System.out.println(answer);
		
		
	}
}