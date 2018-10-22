package com.iluwatar.singleton.practice;


/**
 * 描述：急切的创建可以保证线程安全，静态变量在类加载的时候已经被创建
 *
 * @author biguodong
 * Create time 2018-10-22 下午4:17
 **/
public final class EagerlySingleton {

    private static final EagerlySingleton instance = new EagerlySingleton();

    /**
     * 构造方法私有
     */
    private EagerlySingleton(){

    }

    /**
     * 提供访问单例的静态方法
     * @return
     */
    public static EagerlySingleton getInstance(){
        return instance;
    }
}
