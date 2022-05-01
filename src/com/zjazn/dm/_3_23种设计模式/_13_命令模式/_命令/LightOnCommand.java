package com.zjazn.dm._3_23种设计模式._13_命令模式._命令;

import com.zjazn.dm._3_23种设计模式._13_命令模式._被调用者.LightReceiver;

public class LightOnCommand implements Command {

	//聚合LightReceiver
	LightReceiver light;
	
	//构造器
	public LightOnCommand(LightReceiver light) {
		super();
		this.light = light;
	}
	
	@Override
	public void execute() {
		//调用接收者的方法
		light.on();
	}

	

	@Override
	public void undo() {
		//调用接收者的方法
		light.off();
	}

}
