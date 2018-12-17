package com.iluwatar.proxy.dynamicexample;

import com.iluwatar.proxy.staticexample.Subject;

/**
 * 描述：动态代理调用客户端
 * @author biguodong
 * Create time 2018-12-16 下午6:10
 **/
public class Client {

    public static void main(String[] args) {
        Subject proxy = DynProxyFactory.getInstance();
        proxy.dealTask("动态代理任务");
    }
}
