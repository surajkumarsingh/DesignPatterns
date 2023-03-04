package openclose;

public class Triangle extends Shape {

	private double radius;
	public Triangle(double radius) {
		
	}
	
	
	@Override
	public double area() {
		
		return Math.PI * radius * radius;
	}

	
	
}
