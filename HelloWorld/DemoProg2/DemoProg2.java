
public class DemoProg2 {

	/*
	 * to demonstrate command line arguments
	 * Run Configuration > arguments
	 * enter two integer arguments with space in between
	 * for eg.
	 * 100 200
	 */
	
	public static void main(String[] args) {
		/*
		 * parsing of command line arguments and assigning it to integer type variables
		 */
		int n1 = Integer.parseInt(args[0]);
		//first argument args[0] into n1
		
    	int n2 = Integer.parseInt(args[1]);
    	//second argument args[1] into n2
    	
    	System.out.println("Result : " + (n1+n2));
	}

}
