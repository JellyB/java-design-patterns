package com.iluwatar.proxy.dynamicexample;

import com.iluwatar.proxy.staticexample.RealSubject;
import com.iluwatar.proxy.staticexample.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 描述：动态代理对象的工厂
 *
 * @author biguodong
 * Create time 2018-12-16 下午6:08
 **/
public class DynProxyFactory {

    public static Subject getInstance(){
        Subject delegate = new RealSubject();
        InvocationHandler handler = new SubjectInvocationHandler(delegate);
        Subject proxy;
        proxy = (Subject) Proxy.newProxyInstance(delegate.getClass().getClassLoader(),
                delegate.getClass().getInterfaces(),
                handler);
        return proxy;
    }
}
