import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
        
        Position position = new Position(x, y);
        
        
		System.out.println(position.getQuadrant());
	}
	
	
}

class Position {
    
    private int x;
    private int y;
    
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getQuadrant() {
        if(this.x > 0) {
            if(this.y > 0) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if(this.y > 0) {
                return 2;
            } else {
                return 3;
            }
        }
    }
}