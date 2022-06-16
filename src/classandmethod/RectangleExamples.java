package classandmethod;

public class RectangleExamples {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		rectangle1.length = 4;
		rectangle1.breadth = 5;
		Rectangle rectangle2 = new Rectangle();
		rectangle2.length = 5;
		rectangle2.breadth = 8;
		
		double area = rectangle1.calculateArea(rectangle1.length, rectangle1.breadth);
		if (area>0) {
		System.out.println("Area of rectangle1 is: " + area);
		}
		
		area = rectangle2.calculateArea(rectangle2.length, rectangle2.breadth);
		if(area>0) {
		System.out.println("Area of rectangle2 is: " + area);

	}

}
}
