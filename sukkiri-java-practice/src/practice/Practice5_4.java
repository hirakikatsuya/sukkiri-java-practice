package practice;

public class Practice5_4 {
	public static void main(String[] args) {
		double TriangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積は" + TriangleArea + "平方cm");

		double CircleArea = calcCircleArea(5.0);
		System.out.println("円の面積は"+CircleArea+"平方cmです");
	}

	public static double calcTriangleArea(double bottom, double height) {
		double area = bottom * height / 2;
		return area;
	}

	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
}
