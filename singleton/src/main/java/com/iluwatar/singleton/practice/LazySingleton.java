package com.iluwatar.singleton.practice;

/**
 * 描述：线程安全的Singleton类。该实例被懒加载，因此需要同步锁机制
 *
 * @author biguodong
 * Create time 2018-10-22 下午4:04
 **/
public final class LazySingleton {
    private static LazySingleton instance = null;

    /**
     * 构造方法私有，防止外部构建
     * 防止使用反射实例化
     */
    private LazySingleton(){
        if(instance == null){
            instance = this;
        }else{
            throw new IllegalStateException("实例已存在!");
        }
    }

    /**
     * 只有在第一次调用实例的时才会创建，延迟加载
     * @return
     */
    public static synchronized LazySingleton getInstance(){
        if(null == instance){
            return new LazySingleton();
        }
        return instance;
    }
}
