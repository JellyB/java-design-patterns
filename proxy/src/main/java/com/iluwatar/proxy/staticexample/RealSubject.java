package com.iluwatar.proxy.staticexample;

import java.util.concurrent.TimeUnit;

/**
 * 描述：真正执行任务的类，实现了代理接口
 * @author biguodong
 * Create time 2018-12-16 下午4:34
 **/
public class RealSubject implements Subject{

    /**
     * 执行给定任务的名字
     * @param taskName
     */
    @Override
    public void dealTask(String taskName) {
        System.out.println("正在执行任务：" + taskName);
        try{
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
