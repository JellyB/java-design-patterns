package com.iluwatar.singleton.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;

/**
 * 描述：线程安全的Singleton类。该实例被懒加载，因此需要同步锁机制
 *
 * @author biguodong
 * Create time 2018-10-22 下午4:04
 **/
public final class LazySingleton {
    private static Logger logger = LoggerFactory.getLogger(LazySingleton.class);
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

    public static void main(String[] args) {
        /**
         * LazySingleton
         */
        try{
            LazySingleton lazySingleton1 = LazySingleton.getInstance();
            LazySingleton lazySingleton2 = LazySingleton.getInstance();
            logger.info("LazySingleton:{}", lazySingleton1);
            logger.info("LazySingleton:{}", lazySingleton2);
            Class clazz = Class.forName("com.iluwatar.singleton.practice.LazySingleton");
            Constructor[] cst = clazz.getDeclaredConstructors();
            cst[0].setAccessible(true);
            LazySingleton lazySingleton3 = (LazySingleton)cst[0].newInstance();
            logger.info("LazySingleton:{}", lazySingleton3);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
        }


    }
}
