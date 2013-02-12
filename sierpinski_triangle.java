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

public class sierpinski_triangle {
	private double w, h, a, b, x, y, z, cx, cy;
	private int depth;
	private Graphics g;

	public static final int MAX_DEPTH = 7;




	/**
	 * Constructor
	 *
	 * @param w = width of triangle
	 * @param h = height of the triangle
	 * @param d = depth of the triangle
	 */
	public sierpinski_triangle (double w, double h, double a, double b) {
		this.w = w;
		this.h = h;
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
		recursiveDraw(w, h);
	}

	public void recursiveDraw(int w, int h) {
		x = .9*(Math.min(w/2, h/2));
		cy = b+h/2;
		cx = a+w/2;
		Point c = Point(cx, cy);
		Point top = (cx, (cy - x));
		y = x*math.sin(30);
		z = math.squareroot(math.pow(x) - math.pow(y));
		Point right = ((cx + 2), cy + y);
		Point left = ((cx - 2), (by + y);


	}


}