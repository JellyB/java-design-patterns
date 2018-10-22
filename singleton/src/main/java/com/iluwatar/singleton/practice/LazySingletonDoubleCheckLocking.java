package com.iluwatar.singleton.practice;

/**
 * 描述：懒汉模式-双重检查枷锁
 *
 * @author biguodong
 * Create time 2018-10-22 下午5:47
 **/
public final class LazySingletonDoubleCheckLocking {

    private static volatile LazySingletonDoubleCheckLocking instance;

    /**
     * 构造函数私有，防止外部调用
     */
    private LazySingletonDoubleCheckLocking(){
        if(null != instance){
            throw new IllegalStateException("实例已存在!");
        }
    }

    public static LazySingletonDoubleCheckLocking getInstance(){
        /**
         * 局部变量使性能提高25%
         * Joshua Bloch "Effective Java, Second Edition", p. 283-284
         */
        LazySingletonDoubleCheckLocking result = instance;
        /**
         * 检查实例是否已经创建存在，如果存在，直接return
         *
         */
        if(result == null){
            /**
             * 如果没有创建，我们不能保证同时是否有别的线程也在访问，因此，我们需要对一个对象加锁以实现互斥
             */
            synchronized (LazySingletonDoubleCheckLocking.class){
                result = instance;
                if(result == null){
                    /**
                     * 此时对象仍然为空，我们可以安全（没有其他线程可以进入此区域）创建一个实例，并使它成为我们的单例
                     */
                    result = instance = new LazySingletonDoubleCheckLocking();
                }
            }
        }
        return result;
    }

}
