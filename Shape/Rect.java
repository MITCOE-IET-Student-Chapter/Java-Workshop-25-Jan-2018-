
public class Rect extends Shape {

	public Rect() {}
	public Rect(double s1, double s2) {
		super(s1, s2);
	}
	public void calcArea() {
		System.out.println("Area : "+(value1*value2));
	}

}
