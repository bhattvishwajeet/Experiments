
public class Test {

	public static void main(String args) throws Exception {
		
		StaticFactoryMethods obj = StaticFactoryMethods.defaultStudent("Vishwajeet", "1234");
		System.out.println("The object created:"+obj.getName()+" with id:"+obj.getId());
	}
	
}

