package com.zhuangjie.dp._行为型._7_策略模式;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        //使用线程池来演示
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1,
                TimeUnit.SECONDS,
                new SynchronousQueue<>(),
                new ThreadPoolExecutor.AbortPolicy()); //拒绝策略

        Runnable runnable = ()-> {
            System.out.print("我");
            try{Thread.sleep(10000);}catch (Exception e) {}
            System.out.println("卡了");
        };
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable); //会触发拒绝策略
    }
}
