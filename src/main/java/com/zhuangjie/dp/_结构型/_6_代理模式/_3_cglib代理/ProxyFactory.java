package com.zhuangjie.dp._结构型._6_代理模式._3_cglib代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    //维护一个目标对象
    private Object target;

    //构造器，传入一个被代理的对象
    public ProxyFactory(Object target) {
        this.target = target;
    }
    //返回一个代理对象：是 target 对象的代理对象
    public Object getProxyInstance() {
        //1。创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2。设置一个父类
        enhancer.setSuperclass(target.getClass());
        //3。设置回调函数
        enhancer.setCallback(this);
        //4。创建子类对象，即代理对象
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理,start~");
        Object invoke = method.invoke(target, args);
        System.out.println("Cglib代理,end~");

        return invoke;
    }
}
