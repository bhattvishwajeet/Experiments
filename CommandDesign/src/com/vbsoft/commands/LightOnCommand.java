package com.vbsoft.commands;
import com.vbsoft.receivers.Light;

public class LightOnCommand implements ICommand{
	private Light light;
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.switchOnLight();
	}

	@Override
	public void unexecute() {
		System.out.println(" I am in unexecute method.");
		
	}

	
}
