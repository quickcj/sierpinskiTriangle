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

public class sierpinski_trinangle {
	



	/**
	 * Constructor
	 *
	 * @param w = width of triangle
	 * @param h = height of the triangle
	 * @param d = depth of the triangle
	 */
	public sierpinski_trinangle (int w, int h, int d) {
		this.w = w;
		this.h = h;
	}



}