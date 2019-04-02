
public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setRectangleCount();
		r.dimensions();
		double[] tempArea = r.areas();
		double[] tempPerimeter = r.perimeter();
		r.Print(tempArea, tempPerimeter);
	}
}
