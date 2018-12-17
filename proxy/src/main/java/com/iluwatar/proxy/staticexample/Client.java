package com.iluwatar.proxy.staticexample;

/**
 * 描述：调用客户端
 * @author biguodong
 * Create time 2018-12-16 下午4:45
 **/
public class Client {
    public static void main(String[] args) {
        Subject subject = SubjectStaticFactory.getInstance();
        subject.dealTask("some task");
    }
}
