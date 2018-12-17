package com.iluwatar.proxy.staticexample;

/**
 * 描述：代理接口，处理给定名字的任务
 *
 * @author biguodong
 * Create time 2018-12-16 下午1:08
 **/
public interface Subject {

    /**
     * 执行给定任务的名字
     * @param taskName
     */
    void dealTask(String taskName);
}
