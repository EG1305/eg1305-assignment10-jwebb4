import java.util.Scanner;

public class Rectangle {
	private Scanner input = new Scanner(System.in);
	private int rectangleCount = 0;
	private int rectangle = 1;
	private double[][] dimensions;
	private double[] areas;
	private double[] perimeter;

	public void setRectangleCount() {
		System.out.println("Enter the number of rectangles to be created");
		rectangleCount = input.nextInt();
	}

	public void dimensions() {
		dimensions = new double[rectangleCount][2];
		for (int i = 0; i < rectangleCount; i++) {
			System.out.println("Enter rectangle " + rectangle + " length");
			dimensions[rectangle - 1][0] = input.nextDouble();
			System.out.println("Enter rectangle " + rectangle + " length");
			dimensions[rectangle - 1][1] = input.nextDouble();
			rectangle++;
		}
	}

	public double[] areas() {
		areas = new double[rectangleCount];
		for (int i = 0; i < rectangleCount; i++) {
			areas[i] = dimensions[i][0] * dimensions[i][1];
		}
		return areas;
	}

	public double[] perimeter() {
		perimeter = new double[rectangleCount];
		for (int i = 0; i < rectangleCount; i++) {
			perimeter[i] = 2 * dimensions[i][0] + 2 * dimensions[i][1];
		}
		return perimeter;
	}

	public void Print(double[] a, double[] b) {
		System.out.println("Here are the rectangle that you created");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Rectangle " + (i + 1) + "  area: " + a[i] + " : perimeter: " + b[i]);
		}
	}
}
