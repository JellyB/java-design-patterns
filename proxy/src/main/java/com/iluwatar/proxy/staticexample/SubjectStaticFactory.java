package com.iluwatar.proxy.staticexample;

/**
 * 描述：静态代理工厂
 * @author biguodong
 * Create time 2018-12-16 下午4:42
 **/
public class SubjectStaticFactory {
    /**
     * 客户端调用此方法获取代理对象
     * 客户端并不知道获取到的是代理类对象还是为拖类对象
     * @return
     */
    public static Subject getInstance(){
        return new ProxySubject(new RealSubject());
    }
}
