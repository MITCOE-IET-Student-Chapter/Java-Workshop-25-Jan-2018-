
public class TestInheritance {

	public static void main(String[] args) {
		Employee e = new Employee();
		
		//instance variables from class Person
		e.setName("employee_sujay");
		e.setAge(21);
		
		//instance variable from class Employee
		e.setEcode(3468);
		e.setDept("IT");
		e.setSalary(430000);
		
		System.out.println("Name : "+e.getName()+"\nDept : "+e.getDept()+"\nSalary : "+e.getSalary());
		
		e.dispMsg();
		e.dispMsg("my message");
		e.dispMsg("testing method overloading", 5);
		
		System.out.println(e);
	}

}
