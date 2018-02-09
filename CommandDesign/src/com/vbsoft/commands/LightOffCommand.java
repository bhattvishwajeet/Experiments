package com.vbsoft.commands;
import com.vbsoft.receivers.Light;

public class LightOffCommand implements ICommand{
	private Light light;
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.switchOffLight();
	}

	@Override
	public void unexecute() {
		System.out.println(" I am in unexecute method.");
		
	}

	
}
