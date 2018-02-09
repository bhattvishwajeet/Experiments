import com.vbsoft.phone.OS;
import com.vbsoft.phone.OSFactory;

public class Client {

	public static void main(String args[]) throws Exception {
		
		OSFactory factory = new OSFactory();
		OS os = factory.getSpec("IOS");
		System.out.println("theos:"+os.spec());
	
	}
	
}
