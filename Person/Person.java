
public class Person {
	//instance variables
	protected String name;
	protected String address;
	protected int age;

	//default constructor. is by default included
	public Person() {
		System.out.println("Default Constructor from person class");
	}
	
	//parameterized constructor
	public Person(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	//setters getters generated using eclipse
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public void dispMsg() {
		System.out.println("Empty msg");
	}
	public void dispMsg(String msg) {
		System.out.println(msg);
	}
	public void dispMsg(String msg, int x) {
		for(int i = 0; i<x; i++ ) {
			System.out.println(msg);
		}
	}
	public String toString() {
		return "from toString of Person class \nName : "+getName();
		
	}
	public static void main(String[] args) {
		
	}

}
