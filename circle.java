package encapsulation;

public class circle {
	
	private double radius;
	
	//Constructors
	
	public circle(double radius) {
		this.radius = radius;
	}
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double AreaCircle() {
		double area = (Math.PI*(Math.pow(radius, 2)));
		return area;
	}
	public double PeriCircle() {
		double peri = (2* Math.PI*(radius));
		return peri;
	}
	
	public static void main(String[] args) {
		circle circle1 = new circle(10);
		
		System.out.println("Area: " +circle1.AreaCircle());
		System.out.println("Perimeter: " +circle1.PeriCircle());
		
		circle1.setRadius(25);
		
		System.out.println("Area: " +circle1.AreaCircle());
		
	}

}
