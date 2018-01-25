
public class TestPerson {

	public static void main(String[] args) {
		
		Person p = new Person(); //invokes default constructor
		//use of setters to initialize instance variables
		p.setName("Sujay");
		p.setAddress("Kothrud, Pune");
		p.setAge(20);
		
		System.out.println("Name : "+ p.getName()+"\nAddress : "+p.getAddress()+"\nAge : "+p.getAge());
		
		Person p1 = new Person("Shiv", "Pimpri", 21); //invokes parameterized constructor
		//use of parameterized constructor to initialize instance variables
		
		System.out.println("Name : "+ p1.getName()+"\nAddress : "+p1.getAddress()+"\nAge : "+p1.getAge());
	}
}
