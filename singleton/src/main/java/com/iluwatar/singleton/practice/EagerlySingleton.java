package com.iluwatar.singleton.practice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 描述：急切的创建可以保证线程安全，静态变量在类加载的时候已经被创建
 *
 * @author biguodong
 * Create time 2018-10-22 下午4:17
 **/
public final class EagerlySingleton {

    private static final Logger logger = LoggerFactory.getLogger(EagerlySingleton.class);

    /**
     * 防止反射调用构造方法
     */
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    private static final EagerlySingleton INSTANCE = new EagerlySingleton();

    /**
     * 构造方法私有
     */
    private EagerlySingleton(){
        if(!isInitialized.get()){
            isInitialized.getAndSet(true);
        }else{
            throw new IllegalStateException("实例已存在！");
        }
        logger.info(">>>>>>>  constructor <<<<<<<<<");
    }

    /**
     * 提供访问单例的静态方法
     * @return
     */
    public static EagerlySingleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {

        try {
            EagerlySingleton eagerlySingleton1 = EagerlySingleton.getInstance();
            EagerlySingleton eagerlySingleton2 = EagerlySingleton.getInstance();
            logger.info("EagerlySingleton:{}", eagerlySingleton1);
            logger.info("EagerlySingleton:{}", eagerlySingleton2);

            Class clazz = Class.forName("com.iluwatar.singleton.practice.EagerlySingleton");
            Constructor[] cst = clazz.getDeclaredConstructors();
            cst[0].setAccessible(true);
            EagerlySingleton eagerlySingleton3 = (EagerlySingleton) cst[0].newInstance();
            logger.info("EagerlySingleton:{}", eagerlySingleton3);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
        }

    }
}
