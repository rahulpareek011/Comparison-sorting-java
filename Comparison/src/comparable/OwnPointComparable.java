package comparable;
import java.util.*;

class Point implements Comparable{
	int x;
	int y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
	
	public int compareTo(Object o) {
		Point p = (Point) o;
		if(this.x < p.x)
			return -1;
		else if(this.x > p.x)
			return 1;
		else {
			if(this.y < p.y)
				return -1;
			else if(this.y > p.y)
				return 1;
			else 
				return 0;
		}
	}
}

public class OwnPointComparable {

	public static void main(String[] args) {
		TreeSet<Point> ts = new TreeSet<>();
		ts.add(new Point(1,1));
		ts.add(new Point(2,1));
		ts.add(new Point(1,2));
		ts.add(new Point(2,2));
		
		System.out.println(ts);

	}

}
