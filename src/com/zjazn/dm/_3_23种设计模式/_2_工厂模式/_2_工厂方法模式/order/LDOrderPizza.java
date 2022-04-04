package com.zjazn.dm._3_23种设计模式._2_工厂模式._2_工厂方法模式.order;


import com.zjazn.dm._3_23种设计模式._2_工厂模式._2_工厂方法模式.pizza.LDPepperPizza;
import com.zjazn.dm._3_23种设计模式._2_工厂模式._2_工厂方法模式.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	//伦敦Pizza工厂制作
	@Override
	public Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
