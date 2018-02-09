import com.vbsoft.commands.ICommand;
import com.vbsoft.commands.LightOffCommand;
import com.vbsoft.commands.LightOnCommand;
import com.vbsoft.receivers.Light;

public class Invoker {

	ICommand lightOn;
	ICommand lightOff;
	
	public Invoker(ICommand lightOn, ICommand lightOff) {
		this.lightOn = lightOn;
		this.lightOff = lightOff;
	}
	
	
	public static void main(String args[]) throws Exception {
		
		Light light = new Light();
		Invoker obj = new Invoker(new LightOnCommand(light),new LightOffCommand(light));
		obj.lightOn.execute();
		obj.lightOff.execute();
		
	}
}
