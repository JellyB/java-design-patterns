package com.iluwatar.proxy.dynamicexample;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 描述：自定义调用处理器
 * @author biguodong
 * Create time 2018-12-16 下午6:05
 **/
public class SubjectInvocationHandler implements InvocationHandler {
    private Object delegate;

    public SubjectInvocationHandler(Object delegate) {
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long beginTime = System.currentTimeMillis();
        //利用反射将请求分派给为拖类对象
        method.invoke(delegate, args);
        long finishTime = System.currentTimeMillis();
        System.out.println("动态代理-执行任务耗时:" + (finishTime - beginTime) + "毫秒");
        return null;
    }
}
