
public class Employee extends Person {
	//demonstration of inheritance
	
	protected int ecode;
	protected String dept;
	protected double salary;
	
	
	public int getEcode() {
		return ecode;
	}


	public void setEcode(int ecode) {
		this.ecode = ecode;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		System.out.println(super.toString());
		return "from toString of Employee class\nDept : "+getDept()+"\nSalary : "+getSalary();
		
	}

	public static void main(String[] args) {

	}

}
