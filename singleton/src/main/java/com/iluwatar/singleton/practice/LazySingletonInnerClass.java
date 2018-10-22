package com.iluwatar.singleton.practice;

/**
 * 描述：线程安全的创建java单例
 * 该技术尽可能的慵懒，适用于java的所有版本，利用了关于类初始化的特征，因此可以在所有符合java规范的编译器及虚拟机中工作
 *
 * 只有调用了getInstance方法，内部类才会被引用（因此类加载器不回加载），这个设计时线程安全的，不需要特殊的语言结构（synchronized, volatile）
 * @author biguodong
 * Create time 2018-10-22 下午6:14
 **/
public final class LazySingletonInnerClass {

    /**
     * private constructor
     */
    private LazySingletonInnerClass(){

    }

    public static LazySingletonInnerClass getInstance(){
        return HelperHolder.INSTANCE;
    }

    /**
     * 提供懒加载实例
     */
    private static class HelperHolder{
        private static final LazySingletonInnerClass INSTANCE = new LazySingletonInnerClass();

    }
}
