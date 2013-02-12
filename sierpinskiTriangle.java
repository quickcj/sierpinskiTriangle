/**
 * Math for triangle
 *
 *		x = .9(Math.min(w/2,h/2))
 *		c = center point = (a+w/2, b+h/2)
 *		T = top = (cx, cy - x)
 *		y = x sin30
 *		z = math.squareroot(x^2 - y^2)
 *		R= right = (cx + 2, cy + y)
 *		L = left = (cx-2, by + y)
 */
import java.awt.Graphics;

public class sierpinskiTriangle {
	private double w, h, a, b, x, y, z, cx, cy;
	private int depth;
	private Graphics g;

	public static final int MAX_DEPTH = 7;


// point initialized from parameters
    //public Point(double x, double y) {
       // Point.x = x;
        //Point.y = y;
    //}

	/**
	 * Constructor
	 *
	 * @param w = width of triangle
	 * @param h = height of the triangle
	 * @param d = depth of the triangle
	 */
	public sierpinskiTriangle (double w, double h, double a, double b) {
		x = .9*(Math.min(w/2, h/2));
		cy = b+h/2;
		cx = a+w/2;
		//Point top = Point(cx, (cy - x));
		y = x*Math.sin(30);
		z = Math.sqrt(Math.pow(x, 2) - Math.pow(y, 2));
		//Point right = Point((cx + 2), (cy + y));
		//Point left = Point((cx - 2), (cy + y));
		this.depth=1;
	}
	
	/**
	 * incrementDepth
	 */
	public void incrementDepth() {
		if(depth == MAX_DEPTH) {
			depth = 1;
		}else {
			depth++;
		}
	}

	/**
	 * draw
	 * 		draw the htree to the screen
	 *
	 * 		this is an accessor mehtod that calls the real private recursive method
	 *
	 * @param g - the Graphics object associated with the window
	 */
	public void draw(Graphics g) {
		this.g = g;
		g.drawLine((int)cx+2, (int)(cy+y), (int)cx, (int)(cy-x));
		//recursiveDraw(w, h);
	}

	public void recursiveDraw(double w, double h) {
		

	}


}