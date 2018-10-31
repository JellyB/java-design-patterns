package com.iluwatar.singleton.practice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;

/**
 * 描述：这个实现本身是线程安全的，但是添加其他方法及线程安全性是开发人员的责任
 *
 * @author biguodong
 * Create time 2018-10-22 下午5:40
 **/
public enum  EnumSingleton implements SingletonInterface{


    INSTANCE{
        Logger logger = LoggerFactory.getLogger(this.getClass());
        @Override
        public String doSomething() {
            logger.info("do something");
            return "Hello singleton";
        }


        /**
         * Returns the name of this enum constant, as contained in the
         * declaration.  This method may be overridden, though it typically
         * isn't necessary or desirable.  An enum type should override this
         * method when a more "programmer-friendly" string form exists.
         *
         * @return the name of this enum constant
         */
        @Override
        public String toString() {
            return getDeclaringClass().getCanonicalName() + "@" + hashCode();
        }

    };



    public static EnumSingleton getInstance(){
        return EnumSingleton.INSTANCE;
    }

    public static void main(String[] args) {
        try{
            EnumSingleton enumSingleton1 = EnumSingleton.getInstance();
            EnumSingleton enumSingleton2 = EnumSingleton.getInstance();
            System.out.println(String.format("EnumSingleton:%s", enumSingleton1.toString()));
            System.out.println(String.format("EnumSingleton:%s", enumSingleton2.toString()));

            Class clazz = Class.forName("com.iluwatar.singleton.practice.EnumSingleton");
            Constructor[] cst = clazz.getDeclaredConstructors();
            cst[0].setAccessible(true);
            EnumSingleton enumSingleton3 = (EnumSingleton)cst[0].newInstance();
            System.out.println(String.format("EnumSingleton:%s", enumSingleton3.toString()));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }



    }
}
