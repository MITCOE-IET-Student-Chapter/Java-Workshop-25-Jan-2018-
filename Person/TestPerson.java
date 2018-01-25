
public class TestPerson {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("Sujay");
		p.setAddress("Kothrud, Pune");
		p.setAge(20);
		
		System.out.println("Name : "+ p.getName()+"\nAddress : "+p.getAddress()+"\nwAge : "+p.getAge());
		
		Person p1 = new Person();
		p1.setName("Harshal");
		p1.setAddress("Belgaum");
		p1.setAge(20);
		
		System.out.println("Name : "+ p1.getName()+"\nAddress : "+p1.getAddress()+"\nwAge : "+p1.getAge());
	}
}
