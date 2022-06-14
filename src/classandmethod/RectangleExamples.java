package classandmethod;

public class RectangleExamples {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		rectangle1.length = 4;
		rectangle1.breadth = 5;
		Rectangle rectangle2 = new Rectangle();
		rectangle2.length = 5;
		rectangle2.breadth = 8;
		double realLength = rectangle1.length;
		double realBreadth = rectangle1.breadth;
		double area = rectangle1.calculateArea(realLength, realBreadth);
		if (area>0) {
		System.out.println("Area of rectangle1 is: " + area);
		}
		realLength = rectangle2.length;
		realBreadth = rectangle2.breadth;
		area = rectangle2.calculateArea(realLength, realBreadth);
		if(area>0) {
		System.out.println("Area of rectangle2 is: " + area);

	}

}
}
