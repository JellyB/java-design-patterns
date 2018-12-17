package com.iluwatar.proxy.staticexample;

/**
 * 描述：静态代理类的演示代码
 * @author biguodong
 * Create time 2018-12-16 下午4:38
 **/
public class ProxySubject implements Subject{

    /**
     * 代理类持有一个委托类的对象引用
     */
    private Subject delegate;

    public ProxySubject(Subject delegate) {
        this.delegate = delegate;
    }

    /**
     * 将请求分派给委托类执行，记录任务执行时间
     * @param taskName
     */
    @Override
    public void dealTask(String taskName) {
        long beginTime = System.currentTimeMillis();
        delegate.dealTask(taskName);
        long finishTime = System.currentTimeMillis();
        System.out.println("执行任务耗时：" + (finishTime - beginTime) + "毫秒");
    }
}
