package com.iluwatar.singleton.practice;

/**
 * 描述：这个实现本身是线程安全的，但是添加其他方法及线程安全性是开发人员的责任
 *
 * @author biguodong
 * Create time 2018-10-22 下午5:40
 **/
public enum  EnumSingleton implements SingletonInterface{

    INSTANCE{
        @Override
        public String doSomething() {
            return "Hello singleton";
        }
    };


    public static EnumSingleton getInstance(){
        return EnumSingleton.INSTANCE;
    }
}
