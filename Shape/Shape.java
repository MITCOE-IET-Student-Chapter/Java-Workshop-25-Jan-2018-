
abstract public class Shape {
	protected double value1;
	protected double value2;
	
	public Shape() {}
	public Shape(double d1, double d2) {
		value1 = d1;
		value2 = d2;
	}
	
	abstract public void calcArea();
	
	public void dispShapeName(String sname) {
		System.out.println("Calculating Area of "+sname);
	}
	

}
