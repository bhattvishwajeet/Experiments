
public class StaticFactoryMethods {

	private String name="";
	private String id="";

	public String getName() {
		return name;
	}


	public String getId() {
		return id;
	}

	
	private StaticFactoryMethods(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public static StaticFactoryMethods defaultStudent(String name, String id) {
		return new StaticFactoryMethods(name, id);
	}
	
	
}
