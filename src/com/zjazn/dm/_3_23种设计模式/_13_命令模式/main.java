package com.zjazn.dm._3_23种设计模式._13_命令模式;

import com.zjazn.dm._3_23种设计模式._13_命令模式._命令.LightOffCommand;
import com.zjazn.dm._3_23种设计模式._13_命令模式._命令.LightOnCommand;
import com.zjazn.dm._3_23种设计模式._13_命令模式._命令.TVOffCommand;
import com.zjazn.dm._3_23种设计模式._13_命令模式._命令.TVOnCommand;
import com.zjazn.dm._3_23种设计模式._13_命令模式._被调用者.LightReceiver;
import com.zjazn.dm._3_23种设计模式._13_命令模式._被调用者.TVReceiver;
import com.zjazn.dm._3_23种设计模式._13_命令模式._调用者.Controller;

public class main {
    public static void main(String[] args) {
        //使用命令设计模式，完成通过遥控器，对电灯的操作
        //创建电灯的对象（接受者）
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //需要一个遥控器
        Controller controller = new Controller();

        //给我们的遥控器设置命令，比如no=0是电灯的开和关的操作
        controller.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println("--------按下灯的开按钮-----------");
        controller.onButtonWasPushed(0);
        System.out.println("--------按下灯的关按钮-----------");
        controller.offButtonWasPushed(0);
        System.out.println("--------按下撤销按钮-----------");
        controller.undoButtonWasPushed();




        System.out.println("=========使用遥控器操作电视机==========");

        TVReceiver tvReceiver = new TVReceiver();

        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);

        //给我们的遥控器设置命令, 比如 no = 1 是电视机的开和关的操作
        controller.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println("--------按下电视机的开按钮-----------");
        controller.onButtonWasPushed(1);
        System.out.println("--------按下电视机的关按钮-----------");
        controller.offButtonWasPushed(1);
        System.out.println("--------按下撤销按钮-----------");
        controller.undoButtonWasPushed();

    }
}
