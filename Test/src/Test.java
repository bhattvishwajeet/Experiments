/**
 * 
 */

/**
 * @author vishwajeetbhatt
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mina clasd");
		StaticFactoryMethods obj = StaticFactoryMethods.defaultStudent("Vishwajeet", "1234");
		System.out.println("The object created:"+obj.getName()+" with id:"+obj.getId());

	}

}
