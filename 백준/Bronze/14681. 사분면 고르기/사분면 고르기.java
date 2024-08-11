import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
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